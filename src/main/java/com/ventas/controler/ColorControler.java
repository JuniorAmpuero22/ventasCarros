package com.ventas.controler;

import com.ventas.Model.Color;
import com.ventas.service.ColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("color")
public class ColorControler {

    @Autowired
    private ColorService colorService;

    @GetMapping("listar")
    public List<Color> listarColor() {
            return colorService.listarColor();
    }

    @PostMapping("guardar")
    public Color guardarColor(@RequestBody Color color){
        return colorService.guardarColor(color);
    }

    @DeleteMapping("eliminar/{id}")
    public String eliminar (@PathVariable Integer idColor){
        colorService.eliminar(idColor);
        return "se elimino correctamente....";

    }
    @PutMapping("actualizar")
    public Color actualizarColor (@RequestBody Color color){
        return colorService.actualizarColor(color);
    }

    @GetMapping("obtener/{id}")
    public Color obtenerColor (@PathVariable Integer id){
        return colorService.obtenerColor(id);
    }
    
}

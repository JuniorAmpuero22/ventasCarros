package com.ventas.controler;

import com.ventas.Model.ColorCarro;
import com.ventas.service.ColorCarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("colorCarro")
public class ColorCarroControler {

    @Autowired
    private ColorCarroService colorCarroService;

    @GetMapping("listar")
    public List<ColorCarro> listarColorCarro(){

        return colorCarroService.listarColorCarro();
    }

    @PostMapping("guardar")
    public ColorCarro guardarColorCarro(@RequestBody ColorCarro colorCarro){
        return colorCarroService.guardarColorCarro(colorCarro);
    }

    @DeleteMapping("eliminar")
    public String eliminar (@PathVariable Integer idColorCarro){
        colorCarroService.eliminar(idColorCarro);
        return "se elimino correctamente......";
    }

    @PutMapping("actualizar")
    public ColorCarro actualizarColorCarro(@RequestBody ColorCarro colorCarro){
        return colorCarroService.actualizarColorCarro(colorCarro);
    }
    @GetMapping("obtener/{id}")
    public ColorCarro obtenerColorCarro(@PathVariable Integer id){
        return colorCarroService.obtenerColorCarro(id);
    }
}

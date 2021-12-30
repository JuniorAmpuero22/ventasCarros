package com.ventas.controler;

import com.ventas.Model.Descuentos;
import com.ventas.service.DescuentosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("descuentos")
public class DescuentosControler {

    @Autowired
    private DescuentosService descuentosService;

    @GetMapping("listar")
    public List<Descuentos> listarDescuentos(){
        return descuentosService.listarDescuentos();
    }

    @PostMapping("guardar")
    public Descuentos guardarDescuentos(@RequestBody Descuentos descuentos){
        return descuentosService.guardarDescuentos(descuentos);
    }
    @DeleteMapping("eliminar")
    public String eliminar (@PathVariable Integer idDescuentos){
           descuentosService.eliminar(idDescuentos);
           return "se eliminos correctamente......";
    }
    @PutMapping("actualizar")
    public Descuentos actualizarDescuentos(@RequestBody Descuentos descuentos){
        return descuentosService.actualizarDescuentos(descuentos);
    }
    @GetMapping("obtener/{id}")
    public Descuentos obtenerDescuentos(@PathVariable Integer id){
        return descuentosService.obtenerDescuentos(id);
    }
}

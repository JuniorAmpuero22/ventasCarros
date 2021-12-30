package com.ventas.controler;

import com.ventas.Model.Ventas;
import com.ventas.service.VentasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("ventas")
public class VentasControler {

    @Autowired
    private VentasService ventasService;

    @GetMapping("listar")
    public List<Ventas> listarVentas(){

        return ventasService.listarVentas();
    }
    @PostMapping("guardar")
    public Ventas guardarVentas(@RequestBody Ventas ventas){
        return ventasService.guardarVentas(ventas);
    }
    @DeleteMapping("eliminar/{idVentas}")
    public String eliminar(@PathVariable Integer id){
        ventasService.eliminar(id);
        return "se elimino correctamente....";
    }
    @PutMapping("actualizar")
    public Ventas actualizarVentas(@RequestBody Ventas ventas){
        return ventasService.actualizarVentas(ventas);
    }
    @GetMapping("obtener/{id}")
    public Ventas obtenerVentas(@PathVariable Integer id){
        return ventasService.obtenerVentas(id);
    }
}

package com.ventas.controler;

import com.ventas.Model.ModoPago;
import com.ventas.service.ModoPagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("modoPago")
public class ModoPagoControler {

    @Autowired
    private ModoPagoService modoPagoService;

    @GetMapping("listar")
    public List<ModoPago> listarModoPago(){
        return modoPagoService.listarModoPago();
    }
    @PostMapping("guardar")
    public ModoPago guardarModoPago(@RequestBody ModoPago modoPago){
        return modoPagoService.guardarModoPago(modoPago);
    }
    @DeleteMapping("eliminar/{idModoPago}")
    public String eliminar(@PathVariable Integer idModoPago){
        modoPagoService.eliminar(idModoPago);
        return "se elimino correctamente......";
    }
    @PutMapping("actualizar")
    public ModoPago actualizarModoPago(@RequestBody ModoPago modoPago){
        return modoPagoService.actualizarModoPago(modoPago);
    }
    @GetMapping("obtener/{id}")
    public ModoPago obtenerModoPago(@PathVariable Integer id){
        return modoPagoService.obtenerModoPago(id);
    }

}

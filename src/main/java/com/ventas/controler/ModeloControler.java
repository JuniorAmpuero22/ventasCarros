package com.ventas.controler;

import com.ventas.Model.Modelo;
import com.ventas.service.ModeloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@RestController
@RequestMapping("modelo")
public class ModeloControler {

    @Autowired
    private ModeloService modeloService;

    @GetMapping("listar")
    public List<Modelo> listarModelo(){
        return modeloService.listarModelo();
    }
    @PostMapping("guardar")
    public Modelo guardarModelo(@RequestBody Modelo modelo){
        return modeloService.guardarModelo(modelo);
    }
    @DeleteMapping("eliminar/{idModelo}")
    public String eliminar(@PathVariable Integer idModelo){
        modeloService.eliminar(idModelo);
        return "se elimino correctamente.....";
    }
    @PutMapping("actualizar")
    public Modelo actualiarModelo(@RequestBody Modelo modelo){
        return modeloService.actualizarModelo(modelo);
    }
    @GetMapping("obtener/{id}")
    public Modelo obtenerModelo(@PathVariable Integer id){
        return modeloService.obtenerModelo(id);
    }
}

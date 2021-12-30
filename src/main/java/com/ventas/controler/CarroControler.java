package com.ventas.controler;

import com.ventas.Model.Carro;
import com.ventas.service.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("carro")
public class CarroControler {

    @Autowired
    private CarroService carroService;

    @GetMapping("listar")
    public List<Carro> listarCarro(){
        return carroService.listarCarro();
    }
    @PostMapping("guardar")
    public Carro guardarCarro(@RequestBody Carro carro){
        return carroService.guardarCarro(carro);
    }
    @DeleteMapping("eliminar/idcarro")
    public String eliminar (@PathVariable Integer idcarro){
     carroService.eliminar(idcarro);
     return "se elimino correctamente.....";
    }
    @PutMapping("actualizar")
    public Carro actualizarCarro (@RequestBody Carro carro){
      return carroService.actualizarCarro(carro);
    }
    @GetMapping("obtener/{id}")
    public Carro obtenerCarro (@PathVariable Integer id){
        return carroService.obtenerCarro(id);
    }
}


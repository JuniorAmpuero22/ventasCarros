package com.ventas.controler;


import com.ventas.Model.Cliente;
import com.ventas.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cliente")
public class ClienteControler {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("listar")
    public List<Cliente> listarCliente(){
        return clienteService.listarCliente();
    }
    @PostMapping("guardar")
    public Cliente guardarCliente(@RequestBody Cliente cliente){
        return clienteService.guardarCliente(cliente);
    }
    @DeleteMapping("eliminar")
    public String eliminar (@PathVariable Integer idCliente){
        clienteService.eliminar(idCliente);
        return "eliminado correctamente......";
    }
   @PutMapping("actualizar")
    public Cliente actualizarCliente (@RequestBody Cliente cliente){
        return clienteService.actualizarCliente(cliente);
   }
   @GetMapping ("obtener/{Id}")
    public Cliente obtenerCliente(@PathVariable Integer id){
        return  clienteService.obtenerCliente(id);
   }
}

package com.ventas.service;


import com.ventas.Model.Cliente;

import java.util.List;

public interface ClienteService {
    List<Cliente> listarCliente ();
    Cliente guardarCliente (Cliente cliente);
    void eliminar (Integer id);
    Cliente actualizarCliente (Cliente cliente);
    Cliente obtenerCliente (Integer id);
}

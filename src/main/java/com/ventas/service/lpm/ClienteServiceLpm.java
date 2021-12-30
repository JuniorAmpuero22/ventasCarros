package com.ventas.service.lpm;

import com.ventas.Model.Cliente;
import com.ventas.repository.ClienteRepository;
import com.ventas.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceLpm implements ClienteService {

    @Autowired
    private ClienteRepository repo;

    @Override
    public List<Cliente> listarCliente() {
        return repo.findAll();
    }

    @Override
    public Cliente guardarCliente(Cliente cliente) {
        return repo.save(cliente);
    }

    @Override
    public void eliminar(Integer id) {

    }

    @Override
    public Cliente actualizarCliente(Cliente cliente) {
        return repo.save(cliente);
    }

    @Override
    public Cliente obtenerCliente(Integer id) {
        return repo.findById(id).get();
    }
}

package com.ventas.service.lpm;

import com.ventas.Model.ModoPago;
import com.ventas.repository.ModoPagoRepository;
import com.ventas.service.ModoPagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModoPagoServiceLpm implements ModoPagoService {

    @Autowired
    private ModoPagoRepository repo;

    @Override
    public List<ModoPago> listarModoPago() {
        return repo.findAll();
    }

    @Override
    public ModoPago guardarModoPago(ModoPago modoPago) {
        return repo.save(modoPago);
    }

    @Override
    public void eliminar(Integer id) {

    }

    @Override
    public ModoPago actualizarModoPago(ModoPago modoPago) {
        return repo.save(modoPago);
    }

    @Override
    public ModoPago obtenerModoPago(Integer id) {
        return repo.findById(id).get();
    }
}

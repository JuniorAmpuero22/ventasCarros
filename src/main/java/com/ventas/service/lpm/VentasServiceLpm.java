package com.ventas.service.lpm;

import com.ventas.Model.Ventas;
import com.ventas.repository.VentasRepository;
import com.ventas.service.VentasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VentasServiceLpm implements VentasService {

    @Autowired
    private VentasRepository repo;

    @Override
    public List<Ventas> listarVentas() {
        return repo.findAll();
    }

    @Override
    public Ventas guardarVentas(Ventas ventas) {
        return repo.save(ventas);
    }

    @Override
    public void eliminar(Integer id) {

    }

    @Override
    public Ventas actualizarVentas(Ventas ventas) {
        return repo.save(ventas);
    }

    @Override
    public Ventas obtenerVentas(Integer id) {
        return repo.findById(id).get();
    }
}

package com.ventas.service.lpm;

import com.ventas.Model.Descuentos;
import com.ventas.repository.DescuentosRepository;
import com.ventas.service.DescuentosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DescuentoServiceLpm implements DescuentosService {

    @Autowired
    private DescuentosRepository repo;

    @Override
    public List<Descuentos> listarDescuentos() {
        return repo.findAll();
    }

    @Override
    public Descuentos guardarDescuentos(Descuentos descuentos) {
        return repo.save(descuentos);
    }

    @Override
    public void eliminar(Integer id) {

    }

    @Override
    public Descuentos actualizarDescuentos(Descuentos descuentos) {
        return repo.save(descuentos);
    }

    @Override
    public Descuentos obtenerDescuentos(Integer id) {
        return repo.findById(id).get();
    }
}

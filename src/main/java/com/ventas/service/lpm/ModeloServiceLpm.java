package com.ventas.service.lpm;

import com.ventas.Model.Descuentos;
import com.ventas.Model.Modelo;
import com.ventas.repository.ModeloRepository;
import com.ventas.service.ModeloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModeloServiceLpm implements ModeloService {

    @Autowired
    private ModeloRepository repo;


    @Override
    public List<Modelo> listarModelo() {
        return repo.findAll();
    }

    @Override
    public Modelo guardarModelo(Modelo modelo) {
        return repo.save(modelo);
    }

    @Override
    public void eliminar(Integer id) {
        repo.deleteById(id);
    }

    @Override
    public Modelo actualizarModelo(Modelo modelo) {
        return repo.save(modelo);
    }

    @Override
    public Modelo obtenerModelo(Integer id) {
        return repo.findById(id).get();
    }
}

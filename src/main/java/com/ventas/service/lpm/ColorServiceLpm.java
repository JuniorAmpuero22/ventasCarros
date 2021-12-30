package com.ventas.service.lpm;

import com.ventas.Model.Color;
import com.ventas.repository.ColorRepository;
import com.ventas.service.ColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColorServiceLpm implements ColorService {

    @Autowired
    private ColorRepository repo;

    @Override
    public List<Color> listarColor() {
        return repo.findAll() ;
    }

    @Override
    public Color guardarColor(Color color) {
        return repo.save(color);
    }

    @Override
    public void eliminar(Integer id) {

    }

    @Override
    public Color actualizarColor(Color color) {
        return repo.save(color);
    }

    @Override
    public Color obtenerColor(Integer id) {
        return repo.findById(id).get();
    }
}

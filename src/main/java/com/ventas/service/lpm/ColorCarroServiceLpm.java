package com.ventas.service.lpm;

import com.ventas.Model.ColorCarro;
import com.ventas.repository.ColorCarroRepository;
import com.ventas.service.ColorCarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColorCarroServiceLpm implements ColorCarroService {

    @Autowired
    private ColorCarroRepository repo;

    @Override
    public List<ColorCarro> listarColorCarro() {

        return repo.findAll();
    }

    @Override
    public ColorCarro guardarColorCarro(ColorCarro colorCarro) {

        return repo.save(colorCarro);
    }

    @Override
    public void eliminar(Integer id) {

    }

    @Override
    public ColorCarro actualizarColorCarro(ColorCarro colorCarro) {

        return repo.save(colorCarro);
    }

    @Override
    public ColorCarro obtenerColorCarro(Integer id) {

        return repo.findById(id).get();
    }
}

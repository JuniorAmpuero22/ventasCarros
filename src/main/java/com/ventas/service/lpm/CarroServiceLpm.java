package com.ventas.service.lpm;

import com.ventas.Model.Carro;
import com.ventas.repository.CarroRepository;
import com.ventas.service.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarroServiceLpm implements CarroService {

    @Autowired
    private CarroRepository repo;


    @Override
    public List<Carro> listarCarro() {
        return repo.findAll();
    }

    @Override
    public Carro guardarCarro(Carro carro) {
        return repo.save(carro);
    }

    @Override
    public void eliminar(Integer id) {

    }

    @Override
    public Carro actualizarCarro(Carro carro) {
        return repo.save(carro);
    }

    @Override
    public Carro obtenerCarro(Integer id) {
        return repo.findById(id).get();
    }
}

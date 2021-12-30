package com.ventas.service;

import com.ventas.Model.Carro;

import java.util.List;

public interface CarroService {

    List<Carro> listarCarro ();
    Carro guardarCarro (Carro carro);
    void eliminar (Integer id);
    Carro actualizarCarro (Carro carro);
    Carro obtenerCarro (Integer id);


}

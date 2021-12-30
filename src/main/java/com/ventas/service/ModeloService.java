package com.ventas.service;

import com.ventas.Model.Descuentos;
import com.ventas.Model.Modelo;

import java.util.List;

public interface ModeloService {
    List<Modelo> listarModelo ();
    Modelo guardarModelo (Modelo modelo);
    void eliminar (Integer id);
    Modelo actualizarModelo (Modelo modelo);
    Modelo obtenerModelo (Integer id);
}

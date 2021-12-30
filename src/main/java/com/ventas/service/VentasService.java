package com.ventas.service;

import com.ventas.Model.Ventas;

import java.util.List;

public interface VentasService {
    List<Ventas> listarVentas();
    Ventas guardarVentas (Ventas ventas);
    void eliminar (Integer id);
    Ventas actualizarVentas (Ventas ventas);
    Ventas obtenerVentas (Integer id);
}

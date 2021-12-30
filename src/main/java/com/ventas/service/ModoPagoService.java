package com.ventas.service;

import com.ventas.Model.ModoPago
        ;

import java.util.List;

public interface ModoPagoService {
    List<ModoPago> listarModoPago ();
    ModoPago guardarModoPago (ModoPago modoPago);
    void eliminar (Integer id);
    ModoPago actualizarModoPago (ModoPago modoPago);
    ModoPago obtenerModoPago (Integer id);
}

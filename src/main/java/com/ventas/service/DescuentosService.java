package com.ventas.service;

import com.ventas.Model.Descuentos;

import java.util.List;

public interface DescuentosService {
    List<Descuentos> listarDescuentos ();
    Descuentos guardarDescuentos (Descuentos descuentos);
    void eliminar (Integer id);
    Descuentos actualizarDescuentos (Descuentos descuentos);
    Descuentos obtenerDescuentos (Integer id);
}

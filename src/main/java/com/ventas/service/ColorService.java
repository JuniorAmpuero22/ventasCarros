package com.ventas.service;


import com.ventas.Model.Color;

import java.util.List;

public interface ColorService {
    List<Color> listarColor ();
    Color guardarColor (Color color);
    void eliminar (Integer id);
    Color actualizarColor (Color color);
    Color obtenerColor (Integer id);
}

package com.ventas.service;


import com.ventas.Model.ColorCarro;

import java.util.List;

public interface ColorCarroService {
    List<ColorCarro> listarColorCarro ();
    ColorCarro guardarColorCarro (ColorCarro carro);
    void eliminar (Integer id);
    ColorCarro actualizarColorCarro (ColorCarro carro);
    ColorCarro obtenerColorCarro (Integer id);

}

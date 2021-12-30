package com.ventas.controler;

import com.ventas.DTO.VentasDTO;
import com.ventas.Model.*;
import com.ventas.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("venta")
public class VentasDTOControler {

    @Autowired
    private VentasService ventasService;


    @GetMapping("obtener/{idVentas}")
    public VentasDTO obtenerDatos( @PathVariable Integer idVentas){

        Ventas ventas = ventasService.obtenerVentas(idVentas);

        VentasDTO ventasDTO = new VentasDTO();

        ventasDTO.setCliente(ventas.getCliente().getNombre());
        ventasDTO.setCarros(ventas.getCliente().getColorCarro());
        ventasDTO.setCantidadProductos(ventas.getCantidadProductos());
        ventasDTO.setTiempoEntrega(ventas.getTiempoEntrega());
        ventasDTO.setDescuentos(ventas.getModoPago().getDescuentos().getCantidadDescuento() + "%");
        ventasDTO.setModoPago(ventas.getModoPago().getTipo());
        ventasDTO.setFecha(ventas.getFecha());

        return ventasDTO;

    }


}

package com.ventas.DTO;

import com.ventas.Model.ColorCarro;

import java.util.Date;
import java.util.List;

public class VentasDTO {

      private String Cliente;
      private Integer cantidadProductos;
      private String tiempoEntrega;
      private String modoPago;
      private String descuentos;
      private Date fecha;
      private List<ColorCarro>carros;

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String cliente) {
        Cliente = cliente;
    }

    public List<ColorCarro> getCarros() {
        return carros;
    }

    public void setCarros(List<ColorCarro> carros) {
        this.carros = carros;
    }

    public Integer getCantidadProductos() {
        return cantidadProductos;
    }

    public void setCantidadProductos(Integer cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }

    public String getTiempoEntrega() {
        return tiempoEntrega;
    }

    public void setTiempoEntrega(String tiempoEntrega) {
        this.tiempoEntrega = tiempoEntrega;
    }

    public String getModoPago() {
        return modoPago;
    }

    public void setModoPago(String modoPago) {
        this.modoPago = modoPago;
    }

    public String getDescuentos() {
        return descuentos;
    }

    public void setDescuentos(String descuentos) {
        this.descuentos = descuentos;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}

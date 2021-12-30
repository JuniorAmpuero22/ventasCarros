package com.ventas.Model;

import javax.persistence.*;

@Entity
@Table(name = "descuentos")
public class Descuentos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer cantidadDescuento;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCantidadDescuento() {
        return cantidadDescuento;
    }

    public void setCantidadDescuento(Integer cantidadDescuento) {
        this.cantidadDescuento = cantidadDescuento;
    }
}

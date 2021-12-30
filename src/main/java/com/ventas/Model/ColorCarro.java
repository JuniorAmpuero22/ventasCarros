package com.ventas.Model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "colorCarro")
public class ColorCarro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne
    @JoinColumn(name = "color_id",referencedColumnName = "id")
    private Color color;
    @OneToOne
    @JoinColumn(name = "modelo_id",referencedColumnName = "id")
    private Modelo modelo;
    @OneToOne
    @JoinColumn(name = "carro_id",referencedColumnName = "id")
    private Carro carro;
    @OneToOne
    @JoinColumn(name = "descuentos_id",referencedColumnName = "id")
    private Descuentos descuentos;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Descuentos getDescuentos() {
        return descuentos;
    }

    public void setDescuentos(Descuentos descuentos) {
        this.descuentos = descuentos;
    }
}

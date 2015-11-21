package com.sfaci.eventoserver;

import com.sun.javafx.beans.IDProperty;

import javax.persistence.*;
import java.util.Date;

/**
 * Opinion que los usuarios tienen sobre un monumento
 * Se deben definir las anotaciones que indican la tabla y columnas a las que
 * representa esta clase y sus atributos
 *
 * @author Santiago Faci
 * @version curso 2015-2016
 */
@Entity
@Table(name = "opiniones")
public class Opinion {

    @Id
    @GeneratedValue
    private int id;
    @Column
    private String titulo;
    @Column
    private String texto;
    @Column
    private Date fecha;
    @Column
    private int puntuacion;

    public Opinion() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }
}

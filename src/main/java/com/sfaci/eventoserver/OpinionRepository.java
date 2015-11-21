package com.sfaci.eventoserver;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Clase que hace de interfaz con la Base de Datos
 * Al heredar de CrudRepository se asumen una serie de operaciones
 * para registrar o eliminar contenido (save/delete)
 * Se pueden añadir operaciones ya preparadas como las que hay de ejemplo ya hechas
 *
 * @author Santiago Faci
 * @version curso 2015-2016
 */
public interface OpinionRepository extends CrudRepository<Opinion, Integer> {

    List<Opinion> findAll();
    List<Opinion> findByPuntuacion(int puntuacion);
}

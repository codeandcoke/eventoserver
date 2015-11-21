package com.sfaci.eventoserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Clase que lanza la aplicación
 *
 * Cómo compilar/ejecutar la aplicación:
 *  - Si se hacen cambios en el build.gradle conviene ejecutar (desde la terminal):
 *      - ./gradlew idea
 *      - ./gradlew build
 *  - Una vez compilado se pueden ejecutar por dos vias
 *      - ./gradlew bootRun
 *      - También se puede ejecutar el jar (con java -jar) que se genera en la carpeta 'build/libs' según el fichero 'build.gradle'
 *
 *  El proyecto parte de un proyecto base creado con la herramienta Spring Initializr,
 *  disponible en https://start.spring.io/. Conviene seleccionar ya de inicio las dependencias de Web, JPA y MySQL
 *  De todas formas se pueden añadir luego a gradle y sincronizar el proyecto como se indica más arriba
 *
 * @author Santiago Faci
 * @version curso 2015-2016
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }
}

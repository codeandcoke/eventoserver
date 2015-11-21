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
 * @author Santiago Faci
 * @version curso 2015-2016
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }
}

package com.tetraminoo.apispring.controller;

import com.tetraminoo.apispring.model.entity.Tetramino;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Esta clase permite recibir las peticiones hechas por el cliente y dar una
 * respuesta a este en formato JSON, la informacion dada al cliente son las
 * coordenadas de la ubicación anterior y actual de las piezas que conforman el
 * tetramino al desplazarse hacia abajo, a la derecha o a la izquierda, la clase 
 * utiliza notaciones spring MVC para definir su comportamiento como controlador
 * para reconocer las peticiones HTTP hechas por la aplicacion cliente.
 * Las peticiones HTTP hechas por el cliente, deben ser de tipo GET al dominio
 * mencionado en el repositorio y el URI base: /api/tetrimino/o.
 * @author Bryan
 */
@RestController
@RequestMapping("/o")
public class Controller {
    
    TetraminoServicio tetraminoServicio;
    
    /**
     * Este método retorna un objeto JSON de la clase Tetramino 
     * (letra O del tetris)con las coordenas X y Y iniciales de cada 
     * pieza que conforma la figura al momento de hacer su llamado.
     * @return Coordenadas iniciales de las piezas del tetramino en 
     * formato JSON.
     */
    @RequestMapping(value="/crear", method=RequestMethod.GET)
    public ResponseEntity<Tetramino> obtenerTetrimino(){
    
       tetraminoServicio = new TetraminoServicio(0, 4, 1, 5);
       Tetramino tetramino = tetraminoServicio.obtenerTetramino();
        
       return new ResponseEntity<Tetramino>(tetramino,HttpStatus.OK);
    }
   
    /**
     * Retorna una lista de objetos JSON de la clase Tetramino con las 
     * coordenadas en X y Y de cada una de las piezas que conforman la 
     * figura antes y despues de desplazar el tetramino hacia abajo.
     * @return Coordenadas de las piezas antes y después de desplazar hacia 
     * abajo en formato JSON.
     */
    @RequestMapping(value="/abajo", method=RequestMethod.GET)
    public ResponseEntity<Tetramino> desplazarAbajo(){
   
       Tetramino coordenadasAbajo = tetraminoServicio.desplazar("abajo");
   
       return new ResponseEntity<Tetramino>(coordenadasAbajo,HttpStatus.OK);
    }

    /**
     * Retorna una lista de objetos JSON de la clase Tetramino con las 
     * coordenadas en X y Y de cada una de las piezas que conforman la 
     * figura antes y despues de desplazar el tetramino hacia la derecha.
     * @return Coordenadas de las piezas antes y después de desplazar a la 
     * derecha en formato JSON.
     */
    @RequestMapping(value="/derecha", method=RequestMethod.GET)
    public ResponseEntity<Tetramino> desplazarDerecha() {
    
        Tetramino coordenadasDerecha = tetraminoServicio.desplazar("derecha");
        
        return new ResponseEntity<Tetramino>(coordenadasDerecha,HttpStatus.OK);        
    }
    
    /**
     * Retorna una lista de objetos JSON de la clase Tetramino con las 
     * coordenadas en X y Y de cada una de las piezas que conforman la 
     * figura antes y despues de desplazar el tetrimino hacia la izquierda.
     * @return Coordenadas de las piezas antes y después de desplazar a la 
     * izquierda en formato JSON.
     */
    @RequestMapping(value="/izquierda", method=RequestMethod.GET)
    public ResponseEntity<Tetramino> desplazarIzquierda(){
    
        Tetramino coordenadasIzquierda = tetraminoServicio.desplazar("izquierda");
        
        return new ResponseEntity<Tetramino> (coordenadasIzquierda,HttpStatus.OK);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tetraminoo.apispring.controller;

import com.tetraminoo.apispring.model.entity.Tetramino;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Esta clase permite hacer lógica de negocio entre la clase Tetramino y la clase
 * controlador. Es decir, simula el desplazamiento de la letra, modificando el 
 * valor de la fila y columna donde se encontraría cada pieza que la conforma al
 * moverse en cierta dirección.
 * @author Bryan
 */
@Component
public class TetraminoServicio {
    
    private int fila1;
    private int fila2;
    private int columna1;
    private int columna2;
    private Tetramino ubicacionActual;
    
    public TetraminoServicio(){}
    
    /**
     * Estos parámetros se utilizan para dar una ubicacion inicial de la letra
     * con unos valores fijos, que se irán modificando cuando se invoquen las
     * operaciones de desplazamiento.
     * @param fila1 Posición en el eje X de las piezas superiores de la figura.
     * @param columna1 posición en el eje Y de las piezas del lado izquierdo.
     * @param fila2 Posición en el eje X de las piezas inferiores de la figura.
     * @param columna2 Posición en el eje Y de las piezas del lado derecho.
     */
    public TetraminoServicio(int fila1, int columna1, int fila2, int columna2){
    
        this.fila1 = fila1;
        this.columna1 = columna1;
        this.fila2 = fila2;
        this.columna2 = columna2;

    }
    
    /**
     *Método que retorna un objeto de clase Tetramino con la posicion 
     *inicial de la letra.
     * @return Ubicación inicial en X y Y de las piezas del tetramino.
     */
    public Tetramino obtenerTetramino() {
        
        ubicacionActual = new Tetramino(this.fila1, this.columna1, 
                this.fila2, this.columna2);
        
        return ubicacionActual;
        
    }
    
    /**
     * Método que suma o resta las filas y columnas (coordenadas X y Y) para
     * referenciar cada pieza que conforma la figura,dependiendo de la petición 
     * hecha a alguna de los tres operaciones de desplazamiento definidas en la
     * clase controller.
     * @param direccion Parámetro fijo de tipo String establecido en los métodos
     * de desplazamiento de la clase controler, indica la dirección a la que la
     * figura debe avanzar.
     * @return Objeto de tipo Tetramino con coordenadas de cada pieza, según la
     * dirección que se haya validado.
     */
    public Tetramino desplazar(String direccion) {
        switch(direccion) {
            case "abajo":
                
                ++this.fila1;
                ++this.fila2;
                
            break;
            case "derecha":
                
                ++this.columna1;
                ++this.columna2;
                
            break;
            case "izquierda":
                
                --this.columna1;
                --this.columna2;
                
            break;
        }
        
        this.actualizarUbicacion();
        
        return ubicacionActual;
    }
    
    /**
     * Funcion que permite actualizar las coordenadas en X y Y de cada una de
     * las piezas que conforman la figura, al realizar el despazamiento.
     */
    public void actualizarUbicacion() {
    
        ubicacionActual.setX1(this.fila1);
        ubicacionActual.setY1(this.columna1);
        ubicacionActual.setX2(this.fila1);
        ubicacionActual.setY2(this.columna2);
        ubicacionActual.setX3(this.fila2);
        ubicacionActual.setY3(this.columna1);
        ubicacionActual.setX4(this.fila2);
        ubicacionActual.setY4(this.columna2);
    
    }
    
}

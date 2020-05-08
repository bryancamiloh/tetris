/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tetraminoo.apispring.model.entity;

/**
 *Esta clase define las propiedades de la figura del tetris (Tetramino O).
 * @author Bryan
 */
public class Tetramino {

    private int x1, x2, x3, x4;   
    private int y1, y2, y3, y4;
    
    /**
     * Estos parámetros definen la fila y columna donde se encontraría cada
     * pieza que conforma la letra en el area de juego (matriz) y el eje sobre
     * el cual se desplazará (X y Y positivo o negativo).
     * @param fila1 Fila o ubicación en eje X de las piezas superiores de la 
     * figura (1 y 2).
     * @param columna1 Columna o ubicación en eje Y de las piezas del lado 
     * izquierdo de la figura (1 y 3).
     * @param fila2 Fila o ubicación en eje X de las piezas inferiores de la 
     * figura (3 y 4).
     * @param columna2 Columna o ubicación en eje Y de las piezas del lado 
     * derecho de la figura (2 y 4).
     */
    public Tetramino(int fila1, int columna1, int fila2, int columna2) {
    
        this.x1 = fila1;
        this.x2 = fila1;
        this.x3 = fila2;
        this.x4 = fila2;
        this.y1 = columna1;
        this.y2 = columna2;
        this.y3 = columna1;
        this.y4 = columna2;
        
    }

    /**
     * Método getter que retorna la posición en el eje x de la pieza ubicada
     * en la esquina superior izquierda.
     * @return Ubicación en el eje X o fila de la pieza 1.
     */
    public int getX1() {
        return x1;
    }

    /**
     * Método setter que permite modificar la posición en el eje x de la pieza
     * ubicada en la esquina superior izquierda.
     * @param x1 Nueva Ubicación en el eje X o fila de la pieza 1.
     */
    public void setX1(int x1) {
        this.x1 = x1;
    }

    /**
     * Método getter que retorna la posición en el eje x de la pieza ubicada
     * en la esquina superior derecha.
     * @return Ubicación en el eje X o fila de la pieza 2.
     */
    public int getX2() {
        return x2;
    }

    /**
     * Método setter que permite modificar la posición en el eje x de la pieza
     * ubicada en la esquina superor derecha
     * @param x2 Nueva Ubicación en el eje X o fila de la pieza 2.
     */
    public void setX2(int x2) {
        this.x2 = x2;
    }

    /**
     * Método getter que retorna la posición en el eje x de la pieza ubicada
     * en la esquina inferior izquierda.
     * @return Ubicación en el eje X o fila de la pieza 3.
     */
    public int getX3() {
        return x3;
    }

    /**
     * Método setter que permite modificar la posición en el eje x de la pieza
     * ubicada en la esquina inferior izquierda.
     * @param x3 Nueva Ubicación en el eje X o fila de la pieza 3.
     */
    public void setX3(int x3) {
        this.x3 = x3;
    }

    /**
     * Método getter que retorna la posición en el eje x de la pieza ubicada
     * en la esquina inferior derecha.
     * @return Ubicación en el eje X o fila de la pieza 4.
     */
    public int getX4() {
        return x4;
    }
    
    /**
     * Método setter que permite modificar la posición en el eje y de la pieza 
     * ubicada en la esquina inferior derecha.
     * @param x4 Nueva Ubicación en el eje X o fila de la pieza 4.
     */
    public void setX4(int x4) {
        this.x4 = x4;
    }

    /**
     * Método getter que retorna la posición en el eje y de la pieza ubicada
     * en la esquina superior izquierda.
     * @return Ubicación en el eje Y o columna de la pieza 1.
     */
    public int getY1() {
        return y1;
    }

    /**
     * Método setter que permite modificar la posición en el eje y de la pieza 
     * ubicada en la esquina superior izquierda.
     * @param y1 Nueva Ubicación en el eje Y o columna de la pieza 1.
     */
    public void setY1(int y1) {
        this.y1 = y1;
    }

    /**
     * Método getter que retorna la posición en el eje y de la pieza ubicada
     * en la esquina superior derecha.
     * @return Ubicación en el eje Y o columna de la pieza 2.
     */
    public int getY2() {
        return y2;
    }

    /**
     * Método setter que permite modificar la posición en el eje y de la pieza 
     * ubicada en la esquina superior derecha.
     * @param y2 Nueva Ubicación en el eje Y o columna de la pieza 2.
     */
    public void setY2(int y2) {
        this.y2 = y2;
    }

    /**
     * Método getter que retorna la posición en el eje y de la pieza ubicada
     * en la esquina inferior izquierda.
     * @return Ubicación en el eje Y o columna de la pieza 3.
     */
    public int getY3() {
        return y3;
    }

    /**
     * Método setter que permite modificar la posición en el eje y de la pieza 
     * ubicada en la esquina inferior izquierda.
     * @param y3 Nueva Ubicación en el eje Y o columna de la pieza 3.
     */
    public void setY3(int y3) {
        this.y3 = y3;
    }

    /**
     * Método getter que retorna la posición en el eje y de la pieza ubicada
     * en la esquina inferior derecha.
     * @return Ubicación en el eje Y o columna de la pieza 4.
     */
    public int getY4() {
        return y4;
    }

    /**
     * Método setter que permite modificar la posición en el eje y de la pieza 
     * ubicada en la esquina inferior derecha.
     * @param y4 Nueva Ubicación en el eje Y o columna de la pieza 4.
     */
    public void setY4(int y4) {
        this.y4 = y4;
    }
    
}

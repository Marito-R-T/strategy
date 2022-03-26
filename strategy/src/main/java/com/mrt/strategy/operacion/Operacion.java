/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mrt.strategy.operacion;

/**
 *
 * @author marito
 */
public abstract class Operacion {
    
    protected double operador1, operador2;
    
    public abstract double Operar();

    public void setOperador1(double operador1) {
        this.operador1 = operador1;
    }

    public void setOperador2(double operador2) {
        this.operador2 = operador2;
    }
    
}

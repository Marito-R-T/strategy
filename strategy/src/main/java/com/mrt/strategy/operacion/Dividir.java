/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mrt.strategy.operacion;

import java.util.Scanner;

/**
 *
 * @author marito
 */
public class Dividir extends Operacion {

    @Override
    public double Operar() {
        Scanner doubles = new Scanner(System.in);
        System.out.println("Primer operador");
        super.setOperador1(doubles.nextDouble());
        System.out.println("Segundo operador");
        super.setOperador2(doubles.nextDouble());
        return super.operador1 / super.operador2;
    }
    
}

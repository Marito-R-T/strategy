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
public class Factorial extends Operacion {

    @Override
    public double Operar() {
        Scanner doubles = new Scanner(System.in);
        System.out.println("Primer operador");
        super.setOperador1(doubles.nextDouble());
        return this.factorial((int)super.operador1);
    }
    
    public int factorial(int num) {
        if(num == 1 || num == 0) {
            return 1;
        }
        return num * factorial(--num);
    }
    
}

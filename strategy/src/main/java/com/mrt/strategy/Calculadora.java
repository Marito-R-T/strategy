/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mrt.strategy;

import com.mrt.strategy.operacion.Dividir;
import com.mrt.strategy.operacion.Factorial;
import com.mrt.strategy.operacion.Multiplicar;
import com.mrt.strategy.operacion.Operacion;
import com.mrt.strategy.operacion.Restar;
import com.mrt.strategy.operacion.Suma;
import java.util.Scanner;

/**
 *
 * @author marito
 */
public class Calculadora {
    
    private Operacion operacion;
    
    public boolean realizarOperacion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Eliga entre las siguientes operaciones:\n"
                + "1. Suma\n"
                + "2. Resta\n"
                + "3. Multiplicación\n"
                + "4. División\n"
                + "5. Factorial");
        String op = scanner.nextLine();
        switch (op) {
            case "1":
                this.setOperacion(new Suma());
                break;
            case "2":
                this.setOperacion(new Restar());
                break;
            case "3":
                this.setOperacion(new Multiplicar());
                break;
            case "4":
                this.setOperacion(new Dividir());
                break;
            case "5":
                this.setOperacion(new Factorial());
                break;
            default:
                return false;
        }
        System.out.println("Resultado: " +operacion.Operar());
        return true;
    }

    private void setOperacion(Operacion operacion) {
        this.operacion = operacion;
    }
    
}

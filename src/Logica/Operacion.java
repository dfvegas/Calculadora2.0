/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Estudiantes
 */
public class Operacion {

    private String resultado;

    public Operacion() {
        this.resultado = "";
    }
    
    public String getResultado(String num1, String num2, String signo) {
        int total=0;
        if (signo.equals("+")){
            total = Integer.parseInt(num1) + Integer.parseInt(num2);
        }
        if (signo.equals("-")){
            total = Integer.parseInt(num1) - Integer.parseInt(num2);
        }
        if (signo.equals("X")){
            total = Integer.parseInt(num1) * Integer.parseInt(num2);
        }
        if (signo.equals("/")){
            total = Integer.parseInt(num1) / Integer.parseInt(num2);
        }
        this.resultado = String.valueOf(total);
        return this.resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
}

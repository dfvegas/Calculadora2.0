/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author User
 */
public class Conversion {
    private String resultado;

    public Conversion() {
        this.resultado = "";
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String convertir(int base1, int base2, String num) {
        int numero = 0;
        switch (base1) {
            case 2:
                numero = Integer.parseInt(num, 2);
                break;
            case 8:
                numero = Integer.parseInt(num, 8);
                break;
            case 10:
                numero = Integer.parseInt(num, 10);
                break;
            case 16:
                numero = Integer.parseInt(num, 16);
                break;
        }
        switch (base2) {
            case 2:
                this.resultado = Integer.toBinaryString(numero);
                break;
            case 8:
                this.resultado = Integer.toOctalString(numero);
                break;
            case 10:
                this.resultado = Integer.toString(numero);
                break;
            case 16:
                this.resultado = Integer.toHexString(numero);
                break;
        }
        return this.resultado;
    }
}

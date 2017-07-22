/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aula
 */
public class Potencia {
    //Atributos: (int) base, expo, pot
    public int base, expo, pot;
    
    /**
     * Inicializa los atributos con los valores que recibe
     * y calcula pot
     * @param b Base
     * @param e Exponente
     */
    public Potencia(int b, int e){
        base = b;
        expo = e;
        pot = (int)Math.pow(b, e);
    }
    
    public static void main(String[] args) {
        //1-instancien un objeto potencia con valores del teclado
        // o hardcoded
        Potencia p = new Potencia(2, 5);
        //2-Impriman los 3 atributos
        System.out.println(p.base+"^"+p.expo+"="+p.pot);
    }
}

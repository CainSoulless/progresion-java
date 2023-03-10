/* Los wrapper son una forma de tratar a los 
 * tipos primitivos como objetos, y asi tener
 * mayor integridad en el codigo, como lo serian 
 * los distintos tipos de listas.
 * Integer.valueOf() devuelve el valor que almacena
 * dicho objeto, asi se puede realizar aritmetica 
 * de una forma mas facil.
 * 
 * Unboxing es el mismo proceso pero al reves,
 * cuando queremos extraer el valor de dicho objeto.
 * 
 * Cada tipo primitivo tiene su representante objeto
 * nombreado como el tipo (a excepcion de Integer y 
 * Character pero en mayuscula en su primera letra.
 * 
 * ej:
 * int -> java.lang.Integer
 * boolean -> java.lang.Boolean
*/
package com.bytebank.test;

public class TestWrapper {
    public static void main(String[] args){
        Integer ref = Integer.valueOf("3");
        ref++;
        System.out.println(ref);

        /* A pesar de que esta opcion es correcta, no es la mas
         * adecuada, ya que Double.valueOf() devuelve una referencia
         * y no un tipo primitivo, la opcion mas idonea seria
         * Double.parseDouble()
         */
        String numeroString = "43";
        Double stringToDouble = Double.valueOf(numeroString);
        System.out.println("La clase de stringToDouble es: " + 
                            stringToDouble.getClass().getSimpleName());
    } 
}

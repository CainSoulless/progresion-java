package com.bytebank.test;
import com.bytebank.modelo.*;

public class Main {
    public static void main(String[] args) {
        CuentaCorriente cc = new CuentaCorriente(23, 44);

        Cuenta[] cuentas = new Cuenta[5];
        cuentas[1] = cc;

        CuentaAhorros ca = new CuentaAhorros(3, 1);
        cuentas[2] = ca;
        printCuentas(cuentas);

        /* Este codigo no tendria que ejecutar ya que lo que posee
         * cuentas[1] es de tipo Cuenta y no CuentaCorriente,
         * para ello usamos una herramienta de estilo C llamada
         * cast.
         * El cual proporciona la misma cantidad de bytes necesarios
         * para bypassear una confucion de tipos de datos.
         */
        CuentaCorriente cuentaCorriente = (CuentaCorriente)cuentas[1];
    }    

    public static void printCuentas(Cuenta[] cuentas) {
        for (int i = 0; i < cuentas.length; i++) {
            System.out.println(cuentas[i]); 
        }
    }
}
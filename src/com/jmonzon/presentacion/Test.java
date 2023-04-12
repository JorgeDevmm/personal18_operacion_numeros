//Ejercicio operaciones números
//        Implementar la capa de lógica de negocio de una aplicación, que proporcione los
//        siguientes métodos:
//         procesar. Recibe como parámetro una lista de números y realiza con cada uno de
//        ellos el procesamiento que se proporciona como segundo parámetro
//         calculoFiltrados. Recibe como parámetro una lista de números y, sobre aquellos
//        que cumplan la condición recibida como segundo parámetro, se aplicará la
//        operación indicada en el tercer parámetro. El método devolverá una lista con los
//        resultados de las operaciones realizadas sobre los números.
//        Una vez implementada la clase anterior, se creará una capa de presentación que,
//        partiendo de una lista de números enteros cualquiera, interaccionará con la capa de
//        lógica de negocio anterior y se ejecutarán las siguientes acciones:
//         Imprimir por pantalla todos los números de la colección
//         Calcular la suma del cuadrado de todos los números pares de la cole

package com.jmonzon.presentacion;


import com.jmonzon.logica.GestionNumeros;

import java.util.Arrays;
import java.util.List;

/**
 * @author Jorge Monzón
 * @project ejercicio18_operacion_numeros
 */
public class Test {

    public static void main(String[] args) {
//        aplicando el método asList pasamos los elementos del array a la interfaz List
        List<Integer> numeros = Arrays.asList(4, 11, 23, 15, 16);
        GestionNumeros gestor = new GestionNumeros();

        //proporcionamos las implementaciones de las interfaces funcionales
        //a través de expresiones lambda

        gestor.procesar(numeros, elemento -> System.out.println(elemento));

        List<Integer> numerosDevueltos = gestor.calculoFiltrados(numeros, elemento -> elemento % 2 == 0, elemento -> elemento * elemento);

        System.out.println("Cuadrados de pares: ");
        for (Integer elementos : numerosDevueltos) {
            System.out.println(elementos);
        }


    }
}

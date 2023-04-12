package com.jmonzon.logica;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/**
 * @author Jorge Monzón
 * @project ejercicio18_operacion_numeros
 */
public class GestionNumeros {

    //    procesar. Recibe como parámetro una lista de números y realiza con cada uno de
//    ellos el procesamiento que se proporciona como segundo parámetro
    public void procesar(List<Integer> numeros, Consumer<Integer> consumer) {

        //recorre la lista y le aplica a cada número la operación definica en consumer
        for (Integer elemento : numeros) {
            consumer.accept(elemento);
        }
    }

    public List<Integer> calculoFiltrados(List<Integer> numeros, Predicate<Integer> predicate, UnaryOperator<Integer> operacion) {

//        instanciamos con una clase de tipo arrayList para poder agregar y borrar en la interfaz List
        List<Integer> listafinal = new ArrayList<>();

        //si el número cumpla la condición del predicado, se le aplica la función
        //y el resultado se añade a una lista auxiliar
        for (Integer elemento : numeros) {
//            si cumple la condición del metodo test de la interfaz devolvera true
            if (predicate.test(elemento)) {
//                y a los que cumplan lo agregaremos al List, pero aplicando el método apply extendido de function por medio de unaryOperator
                listafinal.add(operacion.apply(elemento));

            }
        }

//        retornamos List
        return listafinal;

    }


}

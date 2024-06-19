package edu.gustavo.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
  public static void main(String[] args) {
    // Criar uma lista de números inteiros
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

    // Usar o Consumer com expressão lambda para imprimir números pares
    Consumer<Integer> imprimirNumeroPar = numero -> {

    };

    // Usar o Consumer para imprimir números pares no Stream
    numeros.forEach(t ->  {
        if(t % 2 == 0) {
          System.out.println(t);
        }
      }
      
    );
  }
}


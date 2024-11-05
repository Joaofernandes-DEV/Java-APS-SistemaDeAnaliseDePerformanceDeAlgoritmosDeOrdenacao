package utils;

import java.util.Random;

public class GeradorNumerico {

    public void gerador(int[] vetor) {
        Random num = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = num.nextInt(1000);
            System.out.println(i + "º -> " + vetor[i]);
        }
    }
}

package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import sorting.BubbleSort;
import sorting.SelectionSort;
import sorting.QuickSort;

public class ComparacaoDeDesempenho {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Escolha a fonte de dados: ");
            System.out.println("1. Carregar de arquivo");
            System.out.println("2. Gerar números aleatórios");
            int escolha = scanner.nextInt();

            int[] numeros;

            if (escolha == 1) {
                numeros = carregarNumerosDeArquivo("numeros.txt");
                if (numeros == null) {
                    System.out.println("Falha ao carregar os números.");
                    return;
                }
            } else {
                numeros = gerarNumerosAleatorios();
            }

            // Bubble Sort
            int[] bubbleArray = Arrays.copyOf(numeros, numeros.length);
            long inicioBubble = System.nanoTime();
            BubbleSort.ordenar(bubbleArray);
            long fimBubble = System.nanoTime();
            System.out.println("Tempo Bubble Sort: " + (fimBubble - inicioBubble) / 1_000_000 + " ms");

            // Selection Sort
            int[] selectionArray = Arrays.copyOf(numeros, numeros.length);
            long inicioSelection = System.nanoTime();
            SelectionSort.ordenar(selectionArray);
            long fimSelection = System.nanoTime();
            System.out.println("Tempo Selection Sort: " + (fimSelection - inicioSelection) / 1_000_000 + " ms");

            // Quick Sort
            int[] quickArray = Arrays.copyOf(numeros, numeros.length);
            long inicioQuick = System.nanoTime();
            QuickSort.ordenar(quickArray);
            long fimQuick = System.nanoTime();
            System.out.println("Tempo Quick Sort: " + (fimQuick - inicioQuick) / 1_000_000 + " ms");
        }
    }

    private static int[] carregarNumerosDeArquivo(String nomeArquivo) {
        List<Integer> numerosList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                try {
                    numerosList.add(Integer.parseInt(linha.trim()));
                } catch (NumberFormatException e) {
                    System.err.println("Linha inválida no arquivo: " + linha);
                }
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
            return null;
        }
        return numerosList.stream().mapToInt(i -> i).toArray();
    }

    private static int[] gerarNumerosAleatorios() {
        Random random = new Random();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Quantos números deseja gerar? ");
            int quantidade = scanner.nextInt();

            int[] numeros = new int[quantidade];
            for (int i = 0; i < quantidade; i++) {
                numeros[i] = random.nextInt(1000);
            }
            return numeros;
        }
    }
}

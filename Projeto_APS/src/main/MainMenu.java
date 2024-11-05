package main;

import java.util.Arrays;
import java.util.Scanner;
import sorting.BubbleSort;
import sorting.QuickSort;
import sorting.SelectionSort;
import utils.GeradorNumerico;

public class MainMenu implements InterfaceProjeto {

    private int[] numerosDesordenados;
    private int[] numerosOrdenados;
    @SuppressWarnings("unused")
	private long tempoSelection;
    @SuppressWarnings("unused")
	private long tempoBubble;
    @SuppressWarnings("unused")
	private long tempoQuick;
    private Scanner leia;

    public MainMenu() {
        this.numerosDesordenados = new int[0];
        this.numerosOrdenados = new int[0];
        this.leia = new Scanner(System.in);
    }

    public void executar() {
        this.menuPrincipal();
    }

    private void menuPrincipal() {
        int opcao;

        System.out.println("\n╔══════════════════════════════════════════╗");
        System.out.println("║      SISTEMA DE ORDENAÇÃO DE NÚMEROS     ║");
        System.out.println("╚══════════════════════════════════════════╝");

        while (true) {
            System.out.println("\n═════════════ MENU PRINCIPAL ═════════════");
            System.out.println("1 - 1.000 Números");
            System.out.println("2 - 5.000 Números");
            System.out.println("3 - 10.000 Números");
            System.out.println("4 - 30.000 Números");
            System.out.println("5 - 50.000 Números");
            System.out.println("6 - 100.000 Números");
            System.out.println("7 - Digitar quantidade personalizada");
            System.out.println("0 - Sair");

            System.out.print("Entre com a opção desejada: ");
            opcao = leia.nextInt();

            switch (opcao) {
                case 1 -> quantidadeNumeros(1000);
                case 2 -> quantidadeNumeros(5000);
                case 3 -> quantidadeNumeros(10000);
                case 4 -> quantidadeNumeros(30000);
                case 5 -> quantidadeNumeros(50000);
                case 6 -> quantidadeNumeros(100000);
                case 7 -> {
                    System.out.print("Digite a quantidade de números que deseja ordenar: ");
                    int quantidade = leia.nextInt();
                    quantidadeNumeros(quantidade);
                }
                case 0 -> {
                    System.out.println("\nSISTEMA FINALIZADO!!");
                    System.exit(0);
                }
                default -> System.out.println("\nOpção Inválida, tente novamente.");
            }
            processarOrdenacao();
        }
    }

    private void quantidadeNumeros(int quantidade) {
        this.numerosDesordenados = new int[quantidade];
        GeradorNumerico geradorNumeros = new GeradorNumerico();
        geradorNumeros.gerador(numerosDesordenados);
    }

    private void processarOrdenacao() {
        int ordem = this.subMenuOrdem();

        if (ordem == 0) {
            return;
        }

        switch (this.subMenu()) {
            case 1 -> tempoBubble = ordenarComTempo(BubbleSort::ordenar, "BubbleSort", ordem);
            case 2 -> tempoSelection = ordenarComTempo(SelectionSort::ordenar, "SelectionSort", ordem);
            case 3 -> tempoQuick = ordenarComTempo(QuickSort::ordenar, "QuickSort", ordem);
            case 4 -> {
                tempoBubble = ordenarComTempo(BubbleSort::ordenar, "BubbleSort", ordem);
                tempoSelection = ordenarComTempo(SelectionSort::ordenar, "SelectionSort", ordem);
                tempoQuick = ordenarComTempo(QuickSort::ordenar, "QuickSort", ordem);
            }
        }
    }

    private int subMenu() {
        int submenu;
        do {
            System.out.println("\n════════════ SUBMENU DE ORDENAÇÃO ════════════");
            System.out.println("1 - Bubble Sort");
            System.out.println("2 - Selection Sort");
            System.out.println("3 - Quick Sort");
            System.out.println("4 - Todos os Métodos");
            System.out.println("0 - Voltar ao Menu Principal");
            System.out.print("Escolha o método de ordenação: ");
            submenu = leia.nextInt();
        } while (submenu < 0 || submenu > 4);
        return submenu;
    }

    private int subMenuOrdem() {
        int ordem;
        do {
            System.out.println("\n════════════ ORDEM DE ORDENAÇÃO ════════════");
            System.out.println("1 - Crescente");
            System.out.println("2 - Decrescente");
            System.out.println("0 - Voltar ao Menu Principal");
            System.out.print("Escolha a ordem de ordenação: ");
            ordem = leia.nextInt();
        } while (ordem < 0 || ordem > 2);
        return ordem;
    }

    private long ordenarComTempo(SortingAlgorithm algoritmo, String nome, int ordem) {
        int[] copia = Arrays.copyOf(numerosDesordenados, numerosDesordenados.length);
        long inicio = System.nanoTime();
        algoritmo.ordenar(copia);
        long fim = System.nanoTime();
        setNumerosOrdenados(copia, ordem);
        mostrarNumerosOrdenados(nome);
        return (fim - inicio) / 1_000_000;
    }

    private void mostrarNumerosOrdenados(String algoritmo) {
        System.out.println("\nSeus números ordenados em ordem (" + algoritmo + "):");
        for (int i = 0; i < numerosOrdenados.length; i++) {
            System.out.println(i + "º -> " + numerosOrdenados[i]);
        }
    }

    private void setNumerosOrdenados(int[] numeros, int ordem) {
        this.numerosOrdenados = Arrays.copyOf(numeros, numeros.length);
        if (ordem == 2) {
            inverterArray(this.numerosOrdenados);
        }
    }

    private void inverterArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }
}

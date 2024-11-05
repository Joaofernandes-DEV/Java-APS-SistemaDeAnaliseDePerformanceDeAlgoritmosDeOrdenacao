package main;

import java.util.Scanner;

public interface InterfaceProjeto {
	
	@FunctionalInterface
	public interface SortingAlgorithm {
	    void ordenar(int[] array);
	}
	
	final Scanner leia = new Scanner(System.in);

}


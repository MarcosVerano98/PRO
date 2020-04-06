package Casas;

import java.util.Scanner;

public class Casas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char salir = ' '; 
		char cat1 = ' ', cat2 = ' ';
		int casas = 0;
		int mayor = 0, menor=0;
		int pos=0, pos1=0;
		int Viviendas[] = new int[6];
		char Categorias[] = {'a','b', 'c', 'd', 'e', 's'};
		do {
			
		
		System.out.println("Introduce la categoriaenergetica. \n Categorias: \n a. Categoria A \n b. Categoria B \n c. Categoria C \n d. Categoria D \n e. Categoria E. \n s. Sin Categoria ");
		char categoria = sc.next().charAt(0);
		sc.nextLine();
		casas ++;
		switch(categoria) {
		case 'a': Viviendas[0] += 1;
		break;
		case 'b': Viviendas[1] += 1;
		break;
		case 'c' : Viviendas[2] += 1;
		break; 
		case 'd': Viviendas[3] += 1;
		break;
		case 'e': Viviendas[4] += 1;
		break;
		case 's': Viviendas[5] += 1;
		break;
		}
		
		System.out.println("Quiere salir del proceso? (y==SI, n== NO)");
		salir = sc.next().charAt(0);
		sc.nextLine();
		}while(salir=='n');
		
		
		mayor = Viviendas[0]; //metes el primer numero en una variable auxiliar 
		
		for(int i=0; i<Viviendas.length; i++) {
			
			if(Viviendas[i] > mayor) {
				mayor = Viviendas[i];
				pos = i;
				
			}
		}
		/**
		if(pos==0){
			cat1 = 'a';
		} else if(pos==1) {
			cat1= 'b';
		}else if(pos==2) {
			cat1= 'c';
		}else if(pos==3) {
			cat1= 'd';
		}else if(pos==4) {
			cat1= 'e';
		}else if(pos==5) {
			cat1= 's';
		}
		**/
		menor = Viviendas[0];
		
		for(int j=0; j<Viviendas.length; j++) {
			
			if(Viviendas[j]<menor) {
				menor = Viviendas[j];
				pos1 = j;
				
			}
		}
		/**
		if(pos1==0){
			cat2 = 'a';
		} else if(pos1==1) {
			cat2= 'b';
		}else if(pos1==2) {
			cat2= 'c';
		}else if(pos1==3) {
			cat2= 'd';
		}else if(pos1==4) {
			cat2= 'e';
		}else if(pos1==5) {
			cat2= 's';
		}
		**/

		
		System.out.println("El numero de Viviendas es: " + casas);
		System.out.println("La Catagoria que mas tiene es: " + Categorias[pos] + " Y tiene:  " + mayor);
		System.out.println("La Categoria que menos tiene es: " + Categorias[pos1] + " Y tiene: " + menor);
		
		for(int k = 0; k<Viviendas.length; k++) {
			
				System.out.println("Calificacion Categoria: " + Categorias[k] + " es: " +Viviendas[k]);
			
			
		}
		
	}
	
	
	

}

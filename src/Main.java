import java.util.Scanner;

import entities.Triangulo;

public class Main {

	public static void main(String[] args) {
		
		
		
		// Scanner sc = new Scanner(System.in);
			
//		int minutos = sc.nextInt();
//		
//		double conta = 50.00;
//		if (minutos > 100) {
//			conta += (minutos - 100) *  2.0;
//		}
//			System.out.println("Valor da conta = R$" + conta);
		//Declaração de Variáveis
//		int x = sc.nextInt();
//		
//		String dia;
//		
//		
//		
//	
//		
//			switch(x) {
//			case 1:
//				dia = "Domingo";
//				break;
//			case 2:
//				dia = "Segunda";
//				break;
//			case 3:
//				dia = "Terça";
//				break;
//			case 4:
//				dia = "Quarta";
//				break;
//			case 5:
//				dia = "Quinta";
//				break;
//			case 6:
//				dia = "Sexta";
//				break;
//			case 7:
//				dia = "Sábado";
//				break;
//			default:
//				dia = "Valor inválido";
//			}
//			sc.close();
//			System.out.println("Dia da semana: " + dia);
//	
//	
//	
//	
/*	while(condicao){
		comando 1
		comando 2
		}
		*/
		
		
		// Ex: Programa só para quando quando o usuário digitar o número 0 e depois soma todos itens digitados.
//		
//		Scanner sc = new Scanner(System.in);
//		
//		int x = sc.nextInt();
//		int soma = 0;
//		while(x != 0) {// Enquanto o que estiver dentro do () for True ele retorna aos comandos dentro da chave
//			soma += x;
//			x = sc.nextInt(); 
//		}
//		
//		System.out.println(soma);
//		sc.close();
				
		
			//Estrutura Repetitiva FOR
			//Ex: Mesmo do while, porém com número de somas determinada!
//Scanner sc = new Scanner(System.in);
//		//for(inicio(executa uma vez);condicao V: executa e volta F:Sai do loop ;incremente: executa sempre que voltar no loop) {
//			//comando 1
//			//comando 2
//		//}
////int N = sc.nextInt();
////int soma = 0;
////		
////	for(int i = 0; i < N; i++) {
////		int x = sc.nextInt();
////		soma += x;
////	}
////System.out.println(soma);
//	
//	for(int i = 0; i<=10; i++) {
//		System.out.println(i);
//	}
//sc.close();
//	
		//Estrutura repetitiva "do while" 
		
//		Scanner sc = new Scanner(System.in);
//		char Resposta;	
//	do {
//			System.out.print("Digite a temperatura em Celsius: ");
//			double C = sc.nextDouble();
//			double F = 9.0 * C / 5.0 + 32;
//			System.out.println("Equivalente em Fahrenheit: " + F);
//			System.out.println("Dejesa ver outra temperatura? (s/n)");
//			Resposta = sc.next().charAt(0); 
//	   }while(Resposta != 'n'); 
//			
//		sc.close();
//	Scanner sc = new Scanner(System.in);
//	
//// Formatação Java
//	
//	String original = "abcde FGHIJ abc abc DEFG   ";
//	
//	String s01 = original.toLowerCase();
//	
//	String s02 = original.toUpperCase();
//	
//	String s03 = original.trim(); // tira espaços
//	
//	String s04 = original.substring(2);
//	
//	String s05 = original.replace('a', 'x');
//	
//	System.out.println(s01);
//	System.out.println(original);
//	System.out.println(s02);
//	System.out.println(s03);
//	System.out.println(s04);
//	System.out.println(s05);
//	
//	//Operaçao Split
//	
//	String s = "Augusto Henrique Ferreira de Azevedo";
//	String[] vect = s.split(" ");
//	
//	System.out.println("Nome: " + vect[0] + " " + vect[1]);
//	System.out.println("Sobrenome: " + vect[2]+" "+ vect[3]+ " "+ vect[4]);
//	
//	sc.close();
	
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Digite 3 números: ");
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = sc.nextInt();
//		
//		int maior = max(a, b, c);
//		
//		mostrarResultado(maior);
//		//como fazer funções no java
//		
//		sc.close();
//		
//		
//	}
//	public static int max(int n1, int n2, int n3) {
//		int aux;
//		if(n1>n2 && n1>n3) {
//			aux = n1;
//		}
//		else if(n2>n3){
//			aux = n2;
//		}
//		else {
//			aux = n3;
//		}
//		return aux;
//	}
//
//	public static void mostrarResultado(int value) {
//		System.out.println("Maior número é o: "+value);

		
		
		
		
//	double xA, xB, xC, yA, yB, yC;
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Digite as medidas do triangulo X: ");
//	
//	xA = sc.nextDouble();
//	xB = sc.nextDouble();
//	xC = sc.nextDouble();
//	System.out.println("Digite as medidas do triangulo Y: ");
//	yA = sc.nextDouble();
//	yB = sc.nextDouble();
//	yC = sc.nextDouble();
//
//	double p = (xA + xB + xC) / 2.0;
//	double areaX = Math.sqrt(p*(p-xA)*(p-xB)*(p-xC));
//	
//	p = (yA + yB + yC) / 2.0;
//	double areaY = Math.sqrt(p*(p-yA)*(p-yB)*(p-yC));
//	
//	System.out.printf("Área do triangulo X: %4f%n", areaX);
//	System.out.printf("Área do triangulo Y: %4f%n", areaY);
//	
//	if (areaX > areaY) {
//		System.out.println("A maior area é: X");
//	}
//	else {
//		System.out.println("A maior área é o: Y");
//	}
//sc.close();
	

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite as medidas do triangulo X: ");
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();
		
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Digite as medidas do triangulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
	
		double p = (x.a + x.b + x.c) / 2.0;
		double areaX = Math.sqrt(p*(p-x.a)*(p-x.b)*(p-x.c));
		
		p = (y.a + y.b + y.c) / 2.0;
		double areaY = Math.sqrt(p*(p-y.a)*(p-y.b)*(p-y.c));
		
		System.out.printf("Área do triangulo X: %4f%n", areaX);
		System.out.printf("Área do triangulo Y: %4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("A maior area é: X");
		}
		else {
		System.out.println("A maior área é o: Y");
		}
	sc.close();
		
		
		
		
	
	
	
	
	
	
	}	


}

		  
		
		
		
		
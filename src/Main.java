import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
			
//		int minutos = sc.nextInt();
//		
//		double conta = 50.00;
//		if (minutos > 100) {
//			conta += (minutos - 100) *  2.0;
//		}
//			System.out.println("Valor da conta = R$" + conta);
		//Declara��o de Vari�veis
		int x = sc.nextInt();
		
		String dia;
		
		
		
	
		
			switch(x) {
			case 1:
				dia = "Domingo";
				break;
			case 2:
				dia = "Segunda";
				break;
			case 3:
				dia = "Ter�a";
				break;
			case 4:
				dia = "Quarta";
				break;
			case 5:
				dia = "Quinta";
				break;
			case 6:
				dia = "Sexta";
				break;
			case 7:
				dia = "S�bado";
				break;
			default:
				dia = "Valor inv�lido";
			}
			sc.close();
			System.out.println("Dia da semana: " + dia);
	
	
	
	
	
	}

}

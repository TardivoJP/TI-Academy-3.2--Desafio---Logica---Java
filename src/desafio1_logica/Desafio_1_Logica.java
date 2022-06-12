package desafio1_logica;

import java.util.Scanner;

public class Desafio_1_Logica {

	public static void main(String[] args) {
		
		double precUnit,precImp,margemLuc;
		int contador,estoque,totalEstoque=0,tEc=0,tEe=0,tEv=0;
		char categoria;
		Scanner sc = new Scanner(System.in);
		
		for (contador=1; contador<=15; contador++) {
			System.out.printf("\nDigite o preço unitário do %dº produto: ",contador);
			precUnit = sc.nextDouble();
			while (precUnit <= 0) {
				System.out.printf("\nDigite um valor maior que 0!");
				precUnit = sc.nextInt();
			}
			
			System.out.printf("\nDigite a quantidade do %dº produto: ",contador);
			estoque = sc.nextInt();			
			while (estoque <= 0) {
				System.out.printf("\nDigite um valor maior que 0!");
				estoque = sc.nextInt();
			}
			
			
			System.out.printf("\nDigite a categoria do %dº produto: ",contador);
			categoria = sc.next().charAt(0);
			categoria = Character.toUpperCase(categoria);			
			while (categoria != 'C' && categoria != 'E' && categoria != 'V') {
				System.out.printf("\nCategoria inválida!");
				System.out.printf("\nUtilize apenas C, E ou V");
				System.out.printf("\nDigite a categoria do %dº produto: ",contador);
				categoria = sc.next().charAt(0);
				categoria = Character.toUpperCase(categoria);
			}
			
			
			switch (categoria) {
			case 'C':
				tEc += estoque;
				totalEstoque += estoque;
				
				System.out.printf("\nValor do %dº produto: R$%.2f",contador,precUnit);
				
				precImp = precUnit * 0.3741;
				System.out.printf("\nValor do imposto do %dº produto: R$%.2f",contador,precImp);
				
				precUnit -= precImp;				
				margemLuc = precUnit * 0.3;
				System.out.printf("\nValor da margem de lucro do %dº produto: R$%.2f\n\n",contador,margemLuc);
				break;
				
			case 'E':
				tEe += estoque;
				totalEstoque += estoque;
				
				System.out.printf("\nValor do %dº produto: R$%.2f",contador,precUnit);
				
				precImp = precUnit * 0.4314;
				System.out.printf("\nValor do imposto do %dº produto: R$%.2f",contador,precImp);
				
				precUnit -= precImp;				
				margemLuc = precUnit * 0.35;
				System.out.printf("\nValor da margem de lucro do %dº produto: R$%.2f\n\n",contador,margemLuc);
				break;
				
			case 'V':
				tEv += estoque;
				totalEstoque += estoque;
				
				System.out.printf("\nValor do %dº produto: R$%.2f",contador,precUnit);
				
				precImp = precUnit * 0.3842;
				System.out.printf("\nValor do imposto do %dº produto: R$%.2f",contador,precImp);
				
				precUnit -= precImp;				
				margemLuc = precUnit * 0.5;
				System.out.printf("\nValor da margem de lucro do %dº produto: R$%.2f\n\n",contador,margemLuc);
				break;
			}
			
		}
		
		
		System.out.printf("\n\n\nNo estoque existem %d produtos: ",totalEstoque);
		
		if (tEc != 0) {
			System.out.printf("\n\n%d produtos da categoria cama, mesa e banho.",tEc);
		}
		
		if (tEe != 0) {
			System.out.printf("\n\n%d produtos da categoria eletrodoméstico.",tEe);
		}
		
		if (tEv != 0) {
			System.out.printf("\n\n%d produtos da categoria vestuário.",tEv);
		}	
		
		
		sc.close();

	}

}

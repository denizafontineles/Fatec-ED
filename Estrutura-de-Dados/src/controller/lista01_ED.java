package controller;
import java.util.Random;
import java.util.Arrays;

public class lista01_ED {
	
	public lista01_ED() {
		super();
	}
	
	// 1. Carregar um vetor [100] real de valores de saldos.
	
	public void exercicio01() {
				
				double vetor[] = new double[100];
				double mGeral = 0, mPositivo = 0, mNegativo = 0;
				
				Random random = new Random();
				
				for (int i = 0; i < vetor.length; i++) {
				    vetor[i] = random.nextInt(1000);					
					mGeral = mGeral + vetor[i];			

				    if(vetor[i] > 100 && vetor[i] < 1000) { 
				    	mPositivo += vetor[i];
				    }else if (vetor[i] < 100){
				    	mNegativo += vetor[i];

				    }
				}
				
				mGeral = mGeral /100;
				mPositivo = mPositivo/100;
				
				System.out.printf( "Média dos saldos positivos entre 100 à 1000: " + mPositivo );
				System.out.printf("\nMédia geral dos saldos: " + mGeral);
				System.out.printf("\nSoma dos saldos negativos: " + mNegativo);
	}
	
	// 2. Carregar um vetor [5] inteiro. Enviar cada elemento para uma função e esta irá retornar o
	// seu fatorial que será armazenado em um outro vetor. Exibir os dados dos vetores...
	
	public void exercicio02() {
		
			int [] vetorInt = new int [5];
			String resultado = "";
			int [] vetorFat = new int [5];
			
			
			for(int i = 0; i < 5; i++) {
				vetorInt[i] = (int)(1 + Math.random() * 13);
				
				resultado += "Fat " + vetorInt[i] + ": ";
				vetorFat[i] = funcaofatorial(vetorInt[i]);
				resultado += vetorFat[i] + "\n";
			}

			System.out.println(resultado);

		}

		static int funcaofatorial(int vetor) {

			int fat = 1;

			for(int i = vetor; i > 1 ; i--) {
				fat *= i;
			}

			return fat;
		}
    
    
    //3. Carregar um vetor [100] inteiros positivos ou negativos. Classificar este vetor em ordem
    // crescente e apresentar os valores...

	
	public void exercicio03() {
		int array [] = new int [100];
		Random number = new Random();
		
		for (int i = 0; i < 100; i ++) {
			array[i] = number.nextInt((1000 - 1) + 1) + 1;
		}

        Arrays.sort(array);

        System.out.println("Numeros ordenados:");
        for(int numero : array)
            System.out.println(numero);
        System.out.println();

	}
	
	// 4. Carregar uma matriz [4 x 4 inteiro]...
	
	public void exercicio04() {
		int [][] vetor = new int[4][4];
		int impares = 0;
		int div8 = 0;
		int soma = 0;
		int div3 = 0;
		int fat = 1;

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				vetor[i][j] = (int)(1 + Math.random() * 200);


				if (vetor[i][j] >= 1 && vetor[i][j] < 100) {
					soma += vetor[i][j]; 
				}

				if (vetor[i][j] >= 30 && vetor[i][j] <= 50 && vetor[i][j] % 2 == 1) {
					impares += 1; 
				}

				if (vetor[i][j] % 8 == 0) {
					div8 += 1; 
				}

				if (vetor[i][j] % 2 == 1 && vetor[i][j] % 3 == 0) {
					div3 += 1;
				}
			}
		}

		int maior = vetor[0][0];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (vetor[i][j] > maior) {
					maior = vetor[i][j];
				}
			}
		}
		
		for (int i = maior; i > 1; i--) {
			fat *= i;
		} 

		System.out.println("Soma dos valores entre 1 e 100: " + soma);
		System.out.println("Quantidade de números impares entre 30 a 50: " + impares);
		System.out.println("Quantidade de números divisíveis por 8: " + div8);
		System.out.println("Quantidade de números ímpares divisíveis por 3: " + div3);
		System.out.println("Maior número: " + maior + "   fatorial: " + fat);
	}	
	
	//  Criar e carregar uma matriz [4 x 4] inteiro, onde os valores da diagonal principal serão
	// carregados pela aplicação conforme o gráfico e os demais dados serão digitados pelo usuário.
	
	public void exercicio05() {
		
		int [][] vetor = new int [4][4];
		String stringVet = "Matriz: \n";
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				if(i == j) {
					vetor[i][j] = (int) Math.pow(3, i);
				}else {
					vetor[i][j] = (int) (Math.random() * 100) - 50;
				}
				stringVet += " [" + vetor[i][j] + "] ";
			}
			stringVet += "\n";
		}
		System.out.println(stringVet);
			
	}
	
	//	7) Realize recursivamente a soma de todos os números de 1 a 100.
	
	public void exercicio07() {
		
		int index = 100;
		int res = soma(index);
		System.out.println("Soma dos valores de 1 a 100: " +res);
	}
	
	public int soma(int index) {
		if(index == 1) {
			return 1;
		}
		else {
			return (index + soma( index-1 ));
		}
	}
	
} 


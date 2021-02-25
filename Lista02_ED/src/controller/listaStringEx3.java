package controller;

public class listaStringEx3 {

	private String[] dados; 
	private int tamanho; 

			public listaStringEx3() {
				this.dados = new String[5];
				this.tamanho = 0;
			}
				
			//Verifica se lista está vazia
			public boolean  ListaVazia() {
				if (this.dados.length == this.tamanho) {
					System.out.println("Lista Vazia");
					return true;
				}
				System.out.println("Lista Vazia");
				return false;
				
			}
			
			// Verifica se lista está cheia 
			public boolean ListaCheia() {
				if (this.dados.length > this.tamanho ) {
					System.out.println("Lista Cheia");
					return true;

				} else {
					System.out.println("Lista Vazia");
					return false;
				}
			}
			
			// Adiciona str inicio 
			public void AdicionaStrg(String e){   
				if (this.tamanho < this.dados.length){           
					for (int i= this.tamanho; i>0 ;i--){         
						this.dados[i]=dados[i-1];
					}
					this.dados[0] = e;                          
					this.tamanho++;
				}
				else{
					System.out.println("Lista cheia");        
				}
				System.out.println("'" + e + "' adicionado no inicio");
			}
			
			// Adiciona str no final
			public void adicionaStrFinal(String e) {
				if (this.tamanho < this.dados.length) {
					this.dados[this.tamanho] = e;
					this.tamanho++;
				} else {
					System.out.println("Lista cheia!");
				}
				System.out.println("'" + e + "' adicionado no final");
			}
			
			// Adiciona str qualquer posicao
			public void  AdicionaQualquerPosicao(String e, int pos ){
				int i;
				if ((pos < tamanho + 1) && (pos >= 0)){

					for (i = tamanho; i != pos; i--)
					{
						if (i != 0)
						{
							this.dados[i] = this.dados[i - 1];
						}
					}
					this.dados[i] = e;
					this.tamanho ++;
					System.out.println("'" + e + "' adicionado qualquer posição");

				}
				
			}
			
			// percorre lista concatenar
			public String MostraLista(){                    
				String str =" ";

				for (int i=0 ;i< this.tamanho;i++){
					str = str + this.dados[i];
				}
				System.out.println("Lista: " + str);
				return str;
			}	

}

	
	


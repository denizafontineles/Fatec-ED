package controller;

public class listaCaractereEx2 {
	private int[] dados; // array de strings com as temperaturas
	private int tamanho; // capacidade de elementos guardados na lista


			//  construtor
			public listaCaractereEx2() {
				this.dados = new int[5];
				this.tamanho = 0;
			}
				
			//Verifica se lista está vazia
			public boolean ListaVazia() {
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
			
			// Adiciona crt inicio 
			public void AdicionaCrt(int e){   
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
			public void adicionaCrtFinal(int e) {
				if (this.tamanho < this.dados.length) {
					this.dados[this.tamanho] = e;
					this.tamanho++;
				} else {
					System.out.println("Lista cheia!");
				}
				System.out.println("'" + e + "' adicionado no final");
			}
			
			// Adiciona str qualquer posicao
			public void  AdicionaQualquerPosicao(int e, int pos ){
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
			
			// remove caractere inicio
			
			public int RemoveInicio(){
				int retorno = 0;
				int i;
				if (this.tamanho>=1){                              
					retorno= this.dados[0];
					for (i=1;i< this.tamanho;i++){                      
						this.dados[i-1]= this.dados[i];                          
					}
					this.tamanho--;                                   
				}
				return retorno;
			}
			
			// remove caractere inicio

			public int RemoveFinal(){
				int retorno = 0;
				int i;
				if (this.tamanho>=1){                               
					retorno= this.dados[ this.tamanho-1];
					for (i=0;i< this.tamanho;i++){                       
						if (i== this.tamanho-1)                             
							this.tamanho--;                                    
					}
				}
				return retorno;
			}
			
			// remove caractere qualquer posicao
			
			public int RemoveQualquerPosicao(int pos){
				int i, retorno=0;                                         

				if ((pos< this.tamanho)&&(pos>=0)&&( this.tamanho>=1)){
					retorno = this.dados[pos];

					for (i=pos;i< this.tamanho-1;i++){                 
						this.dados[i]= this.dados[i+1];                         
					}

					this.tamanho--;                                   
				}
				return retorno;
			}

}




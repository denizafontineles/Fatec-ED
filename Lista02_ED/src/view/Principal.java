package view;
import javax.swing.*;

import controller.listaCaractereEx2;
import controller.listaStringEx3;


public class Principal {
	
	public static void main(String[]args){
		
		listaStringEx3 listaStr = new listaStringEx3();
		listaCaractereEx2 listaCrt = new listaCaractereEx2();
		
		int pos = 0;
		int opc = 0;
		int lista;
		String str, mostraListas = null;
		String msg = null;
		int el = 0;
		String op[] = {"String", "Caractere"};
		
		lista = JOptionPane.showOptionDialog(null, "Defina o tipo da lista para prosseguir:\nString: Palavra\nChar: Carácter", null, JOptionPane.DEFAULT_OPTION,
				JOptionPane.INFORMATION_MESSAGE, null, op, op[0]);
		

		
		if (lista == 0) {

		do {
			
			if (lista == 0)
			{
				mostraListas = listaStr.MostraLista();		   
			}
			else if (lista == 1)
			{
				mostraListas = listaCrt.MostraLista();		   
			}
			
			opc = Integer.parseInt(JOptionPane.showInputDialog( op[lista] + " Lista:\n" + mostraListas + "\nOpções:\n"
					+ "Adicionar itens\n1 - Adiciona letras no inicio;\n2 - Adiciona letras no final;\n3 - Adiciona letras em qualquer posição; \n\n"
					+ "\n4 - Remover letras no inicio;\n5 - Remover letras no final;\n6 - Remover letras de qualquer posição."
					+ "\n\n9 - Para encerrar."));
		    switch (opc) { 
		        
		        case 1:
		        	str = JOptionPane.showInputDialog("Adiciona no inicio da lista");
					listaStr.AdicionaStrg(str);		   
		           break;
		        case 2:
		        	str = JOptionPane.showInputDialog("Adiciona no final da lista");
		        	listaStr.adicionaStrFinal(str);		   
		           break;
		        case 3:
		        	str = JOptionPane.showInputDialog("Adiciona qualquer posição");
		        	listaStr.AdicionaQualquerPosicao(str, pos);		   
		           break;
		        case 4:
		        	listaStr.MostraLista();		   
		           break;
		        case 9:
		        	JOptionPane.showMessageDialog(null, "Processo finalizado.");
		        break;
		        default:
		            JOptionPane.showMessageDialog(null, "Opção inválida");
		            }
		} while (opc != 9);
		
		}else if (lista == 1) {
		
		do {
			
			if (lista == 0)
			{
				mostraListas = listaStr.MostraLista();		   
			}
			else if (lista == 1)
			{
				mostraListas = listaCrt.MostraLista();		   
			}
			
			opc = Integer.parseInt(JOptionPane.showInputDialog( op[lista] + "Lista:\n" + mostraListas + "\nOpções:\n"
					+ "Adicionar itens\n1 - Adiciona numero no inicio;\n2 - Adiciona numero no final;\n3 - Adiciona numero em qualquer posição; \n\n"
					+ "Remover:\n4 - Remover numero no inicio;\n5 - Remover numero no final;\n6 - Remover numero de qualquer posição."
					+ "\n\n9 - Para encerrar."));
		    switch (opc) { 

		        case 1:
		        	msg = JOptionPane.showInputDialog("Adiciona no inicio da lista");
				    listaCrt.AdicionaCrt(el); 
		      		   
		           break;
		        case 2:
		        	msg = JOptionPane.showInputDialog("Adiciona no final da lista");
		        	listaCrt.adicionaCrtFinal(el);		   
		           break;
		        case 3:
		        	msg = JOptionPane.showInputDialog("Adiciona qualquer posição");
		        	listaCrt.AdicionaQualquerPosicao(el, pos);		   
		           break;
		        case 4:
		        	listaCrt.RemoveInicio();		   
		           break;
		        case 5:
		        	listaCrt.RemoveFinal();	
			         break;
		        case 6:
		        	listaCrt.RemoveQualquerPosicao(pos);	
			        break;
		        case 9:
		        	JOptionPane.showMessageDialog(null, "Processo finalizado.");
		        break;
		        default:
		            JOptionPane.showMessageDialog(null, "Opção inválida");
		            }
		} while (opc != 9);
		}
		
	}
	}



package view;
import javax.swing.JOptionPane;

import controller.lista01_ED;

public class Principal {

	public static void main(String[] args) {

		lista01_ED m = new lista01_ED();

		int opc = 0;

		do {
		    opc = Integer.parseInt(JOptionPane.showInputDialog(" \n1 - Exerc�cio-01 \n2 - Exerc�cio-02 \n3 - Exerc�cio-03 \n4 - Exerc�cio-04 \n5 - Exerc�cio-05 \n9 - Finalizar"));
		    switch (opc) { 
		        case 1:
		            m.exercicio01();
		           break;
		        case 2:
		            m.exercicio02();
		           break;
		        case 3:
		            m.exercicio03();
		           break;
		        case 4:
		            m.exercicio04();
		           break;
		        case 5:
		            m.exercicio05();
		           break;
		       
		        case 9:
		        	JOptionPane.showMessageDialog(null, "Processo finalizado.");
		        break;
		        default:
		            JOptionPane.showMessageDialog(null, "Op��o inv�lida");
		            }
		} while (opc != 9);
		
	}

}

package view;
import javax.swing.JOptionPane;
import controller.cModulos;

public class cPrincipal {

	public static void main(String[] args) {
		cModulos mod = new cModulos();
		String palavra = JOptionPane.showInputDialog("Palavra:");
				
		String[] p = palavra.split("");
		int tamanho = (p.length)-1;
		String novap="";
		
		String retorno = mod.InverteString(tamanho, novap, p);
		System.out.println(retorno);
		

	}

}

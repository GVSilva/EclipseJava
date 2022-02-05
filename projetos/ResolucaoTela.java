package projetos;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoTela {

	public static void main (String []Args) {
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();
		System.out.println("A resolução da tela é: " + d.width +" X " + d.height);
		
	}
}

package projetos;

import java.util.Locale;

public class IdiomaSistema {

	public static void main(String[] Args) {
			Locale loc = Locale.getDefault();
			System.out.println("O idioma do sistem é: ");
			System.out.println(loc.getDisplayLanguage());
			
	}
}

import java.util.LinkedList;

public class VerificaParent {
	
	LinkedList<Character> lista = new LinkedList<Character>();

	int aux = 0;
	int aux1 = 0;
	int x = 0;
	int y = 0;
	String abrir = "(";
	String fechar = ")";
	

	public void verificar(String conta) {
		while (aux < conta.length()) {
			lista.add(conta.charAt(aux));
			aux++;
			
		}
		System.out.println(conta);
		while (!lista.isEmpty()) {
			String letra = Character.toString(lista.removeLast());
			if (letra.equalsIgnoreCase(abrir)) {
				x++;
			} else if (letra.equalsIgnoreCase(fechar)) {
				y++;
			}

		}

		if (y == x) {
			System.out.println("Está correto.");
		} else {
			System.out.println("Está incorreto.");
		}
	}

}

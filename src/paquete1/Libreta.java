package paquete1;

import java.util.ArrayList;

public class Libreta {
	
//---- Atributos ----
ArrayList<String> miLibreta;

// --- Constructor ---
public Libreta() {
	miLibreta = new ArrayList<>();
}
// --- Métodos ---
public void agregarContacto(String cont) {
	
	if( ! miLibreta.contains(cont) ) {
		
		miLibreta.add(cont);
	}
}

public void borrarPorNombre(String nom) {
	
	miLibreta.remove(nom);
	
}

public void borrarPorIndice(int ind) {
	
	ind = ind-1;
	
	if((ind>=0) && (ind < miLibreta.size() )){
		
		miLibreta.remove(ind);
	}
}

public void listarLibreta() {
	
	System.out.println("--- Libreta ---");
	
	for(int i= 0; i< miLibreta.size(); i++) {
		
		System.out.println((i+1)+" - "+miLibreta.get(i));
		
	}
}

}

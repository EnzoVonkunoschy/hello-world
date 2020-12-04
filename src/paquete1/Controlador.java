package paquete1;

public class Controlador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Libreta unaLibreta = new Libreta();
		
		unaLibreta.agregarContacto("Enzo");
		unaLibreta.agregarContacto("María");
		unaLibreta.agregarContacto("Ester");
		unaLibreta.agregarContacto("Pedro");
		
		unaLibreta.listarLibreta();
		
		unaLibreta.borrarPorIndice(2);
		unaLibreta.listarLibreta();
		
		unaLibreta.borrarPorIndice(10);
		unaLibreta.listarLibreta();
		
		unaLibreta.borrarPorNombre("Enzo");
		unaLibreta.listarLibreta();
		
		unaLibreta.borrarPorNombre("Esteban");
		unaLibreta.listarLibreta();
		
		unaLibreta.agregarContacto("Ester");
		unaLibreta.listarLibreta();

	}

}

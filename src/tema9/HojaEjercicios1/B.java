package tema9.HojaEjercicios1;

public class B extends A{
	void m2() {
        System.out.println("Soy el metodo 2 de B");
    }

	@Override
	void m1() {
		// Obviamente daba un error
		// Si no se sobre escribía el método 
		// m1 la clase B permanecia con dicho error
		// esto ocurre por que es un método abstract 
		// en una clase abstract y este método extiende de dicha clase.
		
	}
}

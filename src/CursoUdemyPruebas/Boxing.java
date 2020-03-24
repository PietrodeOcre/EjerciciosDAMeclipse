package CursoUdemyPruebas;


public class Boxing {
	
	//Autoboxing (de tipos Primitivos a tipos Object)
	static Integer enteroObjInteger = 10;
	Float floatObjFloat = 15.20F;
	Double doubleObjDouble = 40.1;
	
	//Unboxing (de tipos Object a tipos Primitivos)
	static int entero = enteroObjInteger;
	float flotante = floatObjFloat;
	double doble = doubleObjDouble;

	public static void main(String[] args) {
		
		 System.out.println(Integer.toBinaryString(entero));
		 System.out.println(entero);
		 System.out.println(enteroObjInteger.intValue());

	}

}

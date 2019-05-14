package tema10.HojaEjercicios.IICuatro;

public class Main {

	public static void main(String[] args) {

		Inmueble p1=new Inmueble("Piso1", 300_000, 6_000);//seis mil de alquiler
		Propiedad p2=new Inmueble("Piso2", 200_000);//doscientos mil, sin alquiler
		Propiedad p3=new CtaBanco("Bank$", 550_000);//quinientos cincuentamilenelbanco
		
		Imponible psin=new Patrimonio();
		
		((Patrimonio)psin).add(p1);//casting porque add no es método de Imponible
		//System.out.println(psin.id() +" "+ psin.impuestos(null));//1500 = 25%(6000)
		
		Patrimonio pat=new Patrimonio(p1,p2);
		//pat.add(p3,new Inmueble("Piso1",0));//añadep3peroPiso1noserepite
		
		System.out.println(p2.impuestos());//2000  = 1%(200000)
		System.out.println(p3.impuestos());//1000 = 2%(50000 exceso sobre5 0 0 0 0 0 )
		//System.out.println(pat.id() +" "+ pat.impuestos());//4500 = 1500 + 2000 + 1000
		
	}

	/*
	 * 
A ver te comento
Si tu el primer piso
Que son 6000 de alquiler
en el enunciado te dice que el 25% corresponde a un piso de alquiles que lo 
que vas a obtener son 1500 que son los impuestos
en cambio en el segundo
Que no es de alquiler
sino que lo compras directamente
Le tendras que aplicar el 1% de 200000
que seria 2000
y eso seria los impuestos de un piso que compras directamente
Y seria el mismo ejemplo para las cuentas bancarias lo que pasa que ahi le aplicas el 2%
	 */
}

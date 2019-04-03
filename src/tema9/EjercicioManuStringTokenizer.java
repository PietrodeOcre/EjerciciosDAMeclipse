package tema9;

import java.util.StringTokenizer;

public class EjercicioManuStringTokenizer {
	
	public static void main (String[]args){
        StringTokenizer str = new StringTokenizer("UNO DOS TRES CUATRO CINCO SEIS", " ");
        String strarray [] = {"UNO","DOS","TRES","CUATRO","CINCO","SEIS"};
        System.out.println("La cadena tiene: "+str.countTokens()+" en total.");
        
        if(str.countTokens()<5){
            System.out.println("La cadena tiene menos de 5 palabras");
        }
        else{
            System.out.println("La cadena tiene mas, de 5 palabras");
        }
        /*while(str.hasMoreTokens()) {
        	System.out.println(str.nextToken());
        }*/
        System.out.println(str.countTokens());
        for (int i = 0; i < str.countTokens(); i++) {
        	System.out.println(str.countTokens());
        	System.out.println(i);
            System.out.println(str.nextToken());
        }
        //for (int i = 0; i < strarray.length; i++) {
            //System.out.println(strarray[i]);
        //}
    }
	
}

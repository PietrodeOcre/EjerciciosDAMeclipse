package tema9;

import java.util.Arrays;
import java.util.Iterator;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal[] animal = {new Animal(null, 0, null), 
		new Animal(null, 0, null),
		new Animal(null, 0, null)};
		
		for(Animal a:animal){
			
			System.out.println(a.toString());
		}
		
		
		
	}

}

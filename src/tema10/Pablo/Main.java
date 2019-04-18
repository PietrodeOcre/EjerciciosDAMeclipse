package tema10.Pablo;

import java.util.Set;
import java.util.TreeSet;

public class Main {
  public static void main(String[] args) {
    Set<Persona> setPersona = new TreeSet<>();
    Persona persona1 = new Persona(01, "Pablo", "Hervas");
    Persona persona2 = new Persona(01, "Juan", "Perez");
    Persona persona3 = new Persona(01, "Carlos", "Rodriguez");
    Persona persona4 = new Persona(01, "Jaime", "Garcia");
    Persona[] list1 = { persona1, persona2, persona3, persona4 };
    for (Persona list : list1) {
      setPersona.add(list);
    }

    for (Persona list : setPersona) {
    System.out.println(list);
    }
  }
}
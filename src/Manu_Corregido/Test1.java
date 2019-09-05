package Manu_Corregido;

import java.util.HashSet;

public class Test1 implements Multi{

    public static void main(String... sss) {

       HashSet<Object> miSet = new HashSet<Object>();

       String s1 = new String("hola");

       String s2 = new String("hola");

       Simple s3 = new Simple("holasimple");

       Simple s4 = new Simple("holasimple");

       miSet.add(s1);

       miSet.add(s2);

       miSet.add(s3);

       miSet.add(s4);

       System.out.println(miSet);
       
       //Multi mul = (x=x*y;) -> {return x;};
       //Multi mul = (int x ,int y) -> {return x*y;};
       //Multi mul = () -> {return x*y;};
       //Multi mul = () -> return x*y;
       
       
    }

}

interface Multi{

    public int multiplicar(int p1,int p2);

}

class Simple {

    private String str;

    Simple(String str) {

       this.str = str;

    }

    public String toString() {

       return str;

    }

}
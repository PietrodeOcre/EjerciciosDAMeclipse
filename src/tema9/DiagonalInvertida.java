package tema9;

public class DiagonalInvertida {

	public static void main(String[]args){
        int matriz[][]={
            {4,6,4},
            {1,5,5},
            {9,5,9}
        };
        
        if(isMatrixSMA(matriz)==true){
            System.out.println("Es una matriz SMA");
        }
        else{
            System.out.println("No es una matriz SMA");
        }
    }
    
    public static boolean isMatrixSMA(int[][] matriz){
        String MDiagonalNormal="";
        String MDiagonalInversa="";        
        //Obtenemos la diagonal normal
        for (int i = 0; i < matriz.length; i++) {
            MDiagonalNormal += matriz[i][i];
        }
        //Obtenemos la diagonal invertida
        for (int i = 0, j = matriz.length-1; i < matriz.length; i++,j--) {
            MDiagonalInversa += matriz[i][j];
        }
        
        if(MDiagonalNormal.equals(MDiagonalInversa)){
            return true;
        }
        else{
            return false;
        }
    }

}

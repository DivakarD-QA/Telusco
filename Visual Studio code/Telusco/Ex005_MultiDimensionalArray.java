package Telusco;

public class Ex005_MultiDimensionalArray {
    public static void main(String[] args) {
        
        int num3[][] = new int [3] [4];

        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                num3[i][j] = (int) (Math.random() * 10) ; 
                System.out.println(num3[i][j]);
            }
            
        }

        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                    System.out.print(num3[i][j]);
            }
            System.out.println();
        }
    }
    
}

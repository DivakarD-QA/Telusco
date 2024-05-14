package Telusco;

public class Ex007_EnhancedForLoop {
    public static void main(String[] args) {
        int num4[] = { 23, 24, 78, 345};

        System.out.println("Normal For loop");
        for(int x=0; x<num4.length; x++){
            System.out.print( num4[x] + " ");
        }

        System.out.println();
        System.out.println("Enhanced For loop");
        for( int n : num4){
            System.out.print(n + " ");
        }

        System.out.println();
        System.out.println( " ----------- ");
        
        int num5[][] = new int[3][3];
        num5[0][0] = 62;
        num5[0][1] = 12;
        num5[0][2] = 22;
        num5[1][0] = 32;
        num5[1][1] = 42;
        num5[1][2] = 52;
        num5[2][0] = 82;
        num5[2][1] = 72;
        num5[2][2] = 92;

System.out.println("Normal For loop");
        for(int i=0; i<num5.length; i++){
            for(int j=0; j<num5.length; j++){
                    System.out.print(num5[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Enhanced For loop");
        for( int n1[] : num5){
            // System.out.println(n1);
            for(int m1 : n1){
                System.out.print(m1 + " ");
            }
            System.out.println();
        }


    }
    
}

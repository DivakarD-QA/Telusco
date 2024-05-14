package Telusco;

public class Ex004_Array {
    
    public static void main(String[] args) {
        int num[] = {1,5,4,22,77,7};
            System.out.println(num[1]);

        int num2 [] = new int[5];
        System.out.println(num2[1]);
        num2[0] = 2;
        num2[1] = 13;
        num2[2] = 99;
        num2[3] = 101;
        num2[4] = 304;
        num[1] = 25 ;
        System.out.println(num2[1]);
        System.out.println(num[1]);

        for(int i=0; i<5; i++){
            System.out.println( "Value of array at " + i + " index = " + num2[i]);
        }

    }
}

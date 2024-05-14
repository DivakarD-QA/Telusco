package Telusco;
//  Creating new class 

class Calculator{

    public int add(int n1, int n2){
        System.out.println(" Adding using a new class ----- ");
        int r = n1+ n2;
        return r ;
    }
}


public class Ex001_Class {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 15;

        Calculator calc = new Calculator();
        int result = calc.add(num1, num2);
 
    //  int result = num1 + num2 ;   // instead of adding here i am using new class
        System.out.println(result);
    }
    
}

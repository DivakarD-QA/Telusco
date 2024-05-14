package Telusco;

public class Basic {
    public static void main(String[] args) {
        

        System.out.println("Hello World");

        // // Logical Operator
        // int x = 12;
        // int y = 8;
        // int c = 12;
        // int d = 32;
    
        // boolean result1 = x > y;
        // boolean result2 = c < d;
        // boolean result3 = x > y && c<d ;
        // boolean result4 = x > y && c>d ;
    
        // boolean result5 = x > y || c>d ;
        // boolean result6 = x > y || c<d || c>13;
        // boolean result7 = x < y ;
    
        // System.out.println(result1);
        // System.out.println(result2);
        // System.out.println(result3);
        // System.out.println(result4);
        // System.out.println(result5);
        // System.out.println(result6);
        // System.out.println(!result7);
    
        // Conditional Statement
    
        // int x = 22;
        // int y = 19;
    
        // if(false) // If false it will go to else condition
        // System.out.println("Value of x");
    
        // else
        // System.out.println("Value of y");
    
        // if(x<y && x>=12 && x<100)
        // System.out.println("If condition matches for the AND");
    
        // else
        // System.out.println("Else condition matches");
    
        // if(x<y){
        // System.out.println("The value of x=" + x + " is smalller than "+ y);
        // System.out.println("If condition matches..");
        // }
    
        // else{
        // System.err.println("Else condition matches");
        // System.out.println("The value of x=" + x + " is greater than "+ y);
        // }
    
        // Comparing with three values
    
        // int a1 = 12;
        // int b = 18;
        // int c = 23;
    
        // if(a1>b && a1>c){
        // System.out.println("A is the largest value with " + a1);
        // }
        // else if (b>a1 && b>c) {
        // System.out.println("B is the largest value with " + b);
        // }
        // else
        // System.out.println("C is the largest value with " + c);
    
        // Ternary operator
        // int n = 18;
        // int result8 = 0;
        // Instead of using this if, else we can user trnary operator
        // if (n%2==0){
        // System.out.println("n is the even number..." + result8);
    
        // }
        // else
        // System.out.println("n is the odd number..." + result8);
    
        // result8 = n % 2 == 0 ? 10 : 20;
        // System.out.println(result8);
    
        // Switch Statement
        // int m = 4;
    
        // switch (m) {
        // case 1:
        // System.out.println("Monday");
        // break;
        // case 2:
        // System.out.println("Tuesday");
        // break;
        // case 3:
        // System.out.println("Wednesday");
        // break;
        // case 4:
        // System.out.println("Thursday");
        // break;
        // case 5:
        // System.out.println("Friday");
        // break;
        // case 6:
        // System.out.println("Saturday");
        // break;
        // case 7:
        // System.out.println("Sunday");
        // break;
        // default:
        // System.out.println("Please enter valid number");
        // break;
    
    // Switch case with string
    
        // String day = "Sunday";
    
        // switch (day) {
        //     case "Monday":
        //         System.out.println("7am");
        //         break;
        //     case "Saturday", "Sunday":
        //         System.out.println("10am");
        //         break;
        //     default:
        //         System.err.println("6am");
        //         break;
        // }
    
    // without using break we can use arrow and write in one line
        
    
    // String day1 = "Monday";
    
    //         switch (day1) {
    //             case "Monday" -> System.out.println("7am");
                
    //             case "Saturday", "Sunday" -> System.out.println("10am");
               
    //             default -> System.err.println("6am");
                
    //         }
    
    //Assigning the values to variable and print
    // String day2 = "Monday";
    // String result9 = "";
    
    //         switch (day2) {
    //             case "Monday" -> result9="7am";
                
    //             case "Saturday", "Sunday" -> result9="10am";
               
    //             default -> result9="6am";
                
    //         }
    //         System.out.println(result9);
    
    
    //  INstead of assigning values in case, we can use it with switch
    
    // String day3 = "Sunday";
    // String result10 = "";
    
    //         result10 = switch (day3) {
    //             case "Monday" -> "7am";
                
    //             case "Saturday", "Sunday" -> "10am";
               
    //             default -> "6am";
                
    //         };                           //here it will ask for semicolan - this is a static expression
    //         System.out.println(result10);
    
    // Instead of using arrow we can use colan and yield
    
    // String day4 = "Sunday";
    // String result11 = "";
    
    //         result11 = switch (day4) {
    //             case "Monday" : yield "7am";
                
    //             case "Saturday", "Sunday" : yield "10am";
               
    //             default : yield "6am";
                
    //         };                           //here it will ask for semicolan - this is a static expression
    //         System.out.println(result11);
    
    
    
    
    // While loop
    // int w = 1;
    // while (w <= 10) {
    //     System.out.println("Hi " + w);
    //     w++;
    // }
    
    
    // // Nested While Loop
    
    // int y = 0;
    
    
    // while (y <=5){
    //     System.out.println("Hi " + y);
    //     int z = 0;
    //     while (z<=4) {
    //         System.out.println("Hello " + z);
    //         z++;
    //     }
    //     System.out.println("Bye z=" + z);
    //     y++;
    // }
    // System.out.println("Bye y=" + y);
    
    // Do while
    
    // int j = 5;
    //     do{
    //         System.out.println("Hi " + j);
    //         j++;
    //     }while(j<=4);
    
    
    // // For Loop
    //     int f = 1;
    //     for(f=1; f<=5; f++){
    //         System.out.println("Hi " + f);
    //     }
    
    // // For loop with two condition
    //     int m ;
    //     for(m=0; m<=5;) {
    //         System.out.println("Hello " + m);
    //         m++;
    // }
    // For loop with one condition
        // int n1=0 ;
        // for( ;n1<=5;){
        //     System.out.println("Hi For loop " + n1);
        //     n1++;
        // }
    
    
    // Nested For loop
    int n2 = 1;
    for( ;n2<=5; n2++)    {
        System.out.println("DAY "+n2);
        int m2;
        for(m2=1; m2<=9; m2++){
            System.out.println( "   From " + (m2+8) + " to " + (m2+9) + " - TASK ( ---- )");
            
        }
    }
    
    
    
    
    }
    
   

}



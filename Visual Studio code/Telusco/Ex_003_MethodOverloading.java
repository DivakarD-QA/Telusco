package Telusco;


class Addition {
    public int add( int n1, int n2, int n3){
        return n1 + n2+ n3;
    }

    public int add(int n1, int n2)
    {
        return n1+n2;
    }

    public double add(double n1, double n2)
    {
        return n1 + n2;
    }

    public int add4num(int n1, int n2, int n3, int n4)
    {
        return n1+ n2+ n3+ n4;
    }

}

public class Ex_003_MethodOverloading {
    
    public static void main(String[] args) {

        Addition cal = new Addition();

        int result = cal.add(1, 4, 1223);
        int result2 = cal.add(1, 4);
        double result3 = cal.add(1.53, 4.11);
        int result4 = cal.add4num(01, 4, 1223, 8);

        System.out.println( "Total of 3 num --> " + result);
        System.out.println( "Total of 2 num --> " + result2);
        System.out.println( "Total of 2 decimal num --> " + result3);
        System.out.println( "Total of 4 num --> " + result4);
        
    }
}

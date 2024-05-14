package Telusco;

class Computer{
    public void playmusic() {
        System.out.println( " Music is playing -- >>> ");
    }

    public String getpen( int cost){
       if (cost >= 10) {
        return "PEN";
       }         // we can put else also here
       return "NOTHING";
    }
}

public class Ex002_Method {
    
    public static void main(String[] args) {

        Computer obj = new Computer();

        obj.playmusic();
        String result =  obj.getpen(10);
        System.out.println( "   " + result);
    }
}

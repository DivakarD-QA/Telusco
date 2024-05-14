package OOPS;

public class StudentMain {

    public static void main(String[] args) {
        
        Student sd = new Student();
        sd.sid = "1U17MA008";
        sd.sname = "Divakar D";
        sd.dep = "Mathematics";
        sd.grade = "A1";
        sd.printData();

System.out.println(" --------- ");


        Student sd2 = new Student();
        sd2.sid = "IU17MA15";
        sd2.sname = "Jeni";
        sd2.dep = "Biology";
        sd2.year = 2020;
        sd2.grade = "A1+";
        sd2.printData(); 
    }
    
}

import java.util.*;
public class lecture50 {
    //class-->
    public static class Student{           //Student datatype creation with properties-name,%,rno
        int rno ;
        String name;
        double percentage;
    }
    public static void main(String[] args) {
        //object-x of student class
//   Classname objectname=new Classname();     --> declaration of object
        Student    x     = new Student();        //dabba ban jata h means space diya jata h student ko to store values
        x.name="shambhavi";
        x.percentage=98.4;
        x.rno=22;
        System.out.println(x.name+"mishra");

        Scanner sc=new Scanner(System.in);


    }
}

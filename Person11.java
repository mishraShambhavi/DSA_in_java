//oops,create class,object,attributes
class Student {
     int age = 20;
     int rollno;

     String person_name;
 }
 public class Person11{
    public static void main(String[] args) {
        Student Shambhavi = new Student();  //object creation
        Shambhavi.age=21;
        Shambhavi.rollno=52;
        System.out.println(Shambhavi.age);
        System.out.println(Shambhavi.person_name);
        System.out.println(Shambhavi.rollno);

        Student Saumya = new Student();
        Saumya.rollno=51;
        Saumya.age=23;
        System.out.println(Saumya.rollno);
        System.out.println(Saumya.age);

    }
}





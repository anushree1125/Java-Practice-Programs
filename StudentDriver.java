import java.util.Scanner;
class StudentDriver{
    public static void main(String[] args){
        //Scanner sc = new Scanner(System.in);

        Student s1 = new Student(1,"Anushree",'F',"A+", 6362914901l);
        System.out.println(s1.id);
        System.out.println(s1.name);
        System.out.println(s1.gender);
        System.out.println(s1.blood_group);
        System.out.println(s1.phone_no);
        System.out.println(s1);
        
        Student s2 = new Student(2,"Anu");

        System.out.println(s2.id);
        System.out.println(s2.name);
        System.out.println(s2.gender);
        System.out.println(s2.phone_no);
        System.out.println(s2.blood_group);
        System.out.println(s2);
        
    }
}
import java.util.Scanner;
class Demo4{
    public static void main(String args[]){
        System.out.println("Enter the name, age, phone no and gender");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        long phno = sc.nextLong();
        char gender = sc.next().charAt(0);
        System.out.println("Name: "+name+"\n"+"Age: "+age+"\n"+"Phno: "+phno+"\n"+ "Gender: "+gender);
 }
}
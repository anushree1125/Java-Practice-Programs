import java.util.Scanner;
class Calculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 = sc.nextInt();
        System.out.println("Enter num2");
        int num2 = sc.nextInt();

        System.out.println("Enter your choice 1.Addition 2.Substraction 3.Multiplication 4.Division");
        int choice = sc.nextInt();

        switch(choice){
            case 1:{
                System.out.println("Sum of num1 and num2 is"+(num1+num2));
            }
            break;
            case 2:{
                System.out.println("Difference of num1 and num2 is"+(num1-num2));
            }
            break;
            case 3:{
                System.out.println("Product of num1 and num2"+(num1*num2));
            }
            break;
            case 4:{
                System.out.println("Division of num1 and num2 gives"+(num1/num2));
            }
            break;
            default:{
                System.out.println("Invalid choice");
            }
        }
    }
}
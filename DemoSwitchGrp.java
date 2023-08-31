import java.util.Scanner;
class DemoSwitchGrp{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your choice");
        int dice = sc.nextInt();
        switch(dice){
            case 1:
            case 5:
            {
                System.out.println("Dancing");
            }
            break;
            case 2:
            case 4:
            case 6:
            {
                System.out.println("Singing");
            }
            break;
            case 3:
            {
                System.out.println("Story telling");
            }
            break;
            default:
            {
                System.out.println("Invalid");
            }
        }
    }
}
import java.util.Scanner;
class HighestDig{
    public static void main(String[] args){
        int num, rem;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int temp = 0;
        while(num > 0){
            rem = num%10;
            num = num/10;
            if(rem > temp){
                temp = rem;
            }
        }
        System.out.println("Highest digit is "+temp);
    }
}
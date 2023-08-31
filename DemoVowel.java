import java.util.Scanner;
class DemoVowel{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      char in = sc.next().charAt(0);
      in = Character.toLowerCase(in);
      if(in=='a' || in =='e' || in == 'i' || in=='o' || in=='u'){
            System.out.println("Entered char is vowel");
      }else{
             System.out.println("Entered char is consonant");
      }
}
}


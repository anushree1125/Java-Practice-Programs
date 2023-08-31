import java.util.Scanner;
class DemoAlphaNum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a single valued character");
        char c= sc.next().charAt(0);
        if( (c>='a' && c<='z') || (c>='A' && c<='Z')){
             System.out.println( c +" is a alphabet");
      }
      else if(c>='1' && c<='9'){
 System.out.println( c +" is number");
     }else{
 System.out.println( c +" is special character");
     }
}
}
        


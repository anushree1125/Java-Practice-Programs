class ArmstrongNum{
    public static void main(String[] args){
          int num=153;
          int sum = 0,cube;
          int temp = num;
          while(num>0){
            int rem = num%10;
            cube = rem*rem*rem;
            sum +=cube;
            num /=10;
          }
          if(sum == temp){
            System.out.println("Armstrong Number");
          }else{
            System.out.println("Not an armstrong number");
          }
    }
}
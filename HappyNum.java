class HappyNum{
    public static void main(String args[]){
        int num=23;
        while(true){
            int sum=0,square=0, rem;
            while(num>0){
                rem = num%10;
                square = rem*rem;
                sum = sum+square;
                num = num/10;
            }
            if(sum == 1){
                System.out.println("Happy number");
                break;
            }
            if(sum == 4){
                System.out.println("Not a happy number");
                break;
            }
            num = sum;
        }
    }
}
class SunnyNumber{
    public static void main(String[] args){
        int n=5,rem;
        int sum=0;
        n=n+1;
        int square = n*n;
        while(square>0){
            rem=square%10;
            sum=sum+rem;
            square/=10;
        }
        if(sum == n){
            System.out.println("Sunny number");
        }
        else{
            System.out.println("Not a sunny number");
        }

    }
}
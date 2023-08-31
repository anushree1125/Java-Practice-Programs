class StrongNumber{
    public static void main(String args[]){
        int n=145;
        int sum=0,temp=n;
       
        int rem;
        while(n>0){
            int fact=1;
            rem=n%10;
            while(rem >0){
                fact=fact*rem;
                rem--;
            }
            sum=sum+fact;
            n=n/10;
        }
        if(temp==sum){
            System.out.println(temp+ " is a strong number");
        }else{
            System.out.println(temp+ " is not a strong number");
        }
    }
}
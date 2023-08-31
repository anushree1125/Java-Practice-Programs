class SpyNum{
    public static void main(String[] args){
        int num = 123;
        int sum=0, product=1;
        int rem;
        while(num>0){
            rem = num%10;
            num = num/10;
            sum += rem;
            product *= rem;
        }
       if(sum == product){
        System.out.println("Spy number");
       }else{
        System.out.println("Not a spy number");
       }
    }
}
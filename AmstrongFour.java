class AmstrongFour{
    public static void main(String[] args){
        int num=1234;
        int count=0,rem=0,sum=0;
        int temp=num;
        while(num>0){
            count++;
            num=num/10;
        }
        num=temp;
        while(num>0){
            rem=num%10;
            sum+=pow(rem,count);
            num/=10;
        }
        if(sum==temp){
            System.out.println("Amstrong number");
        }else{
            System.out.println("Not an amstrong number");
        }
        
    }
    public static int pow(int rem,int count){
        int result=1;
        while(count>0){
            result=rem*result;
            count--;
        }
        return result;
    }
    
}
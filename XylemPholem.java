class XylemPholem{
    public static void main(String[] args){
        int num = 1254, first_sum, sum=0, rem;
        int last = num%10;
        num = num/10;
        while(num>9){
            rem = num%10;
            sum = sum+rem;
            num = num/10;
        }
        first_sum = last + num;
        if(first_sum == sum){
            System.out.println("Xylem");
        }else{
            System.out.println("Phloem");
        }


    }
}
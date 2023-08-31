class CountFrstLast{
    public static void main(String[] args){
        int num = 459836;
        int last = num%10;
        while(num>9){
            num/=10;
        }
        int first = num;
        int res = first+last;
        System.out.println(res);

    }
}
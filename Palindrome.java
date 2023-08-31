class Palindrome{
    public static void main(String[] args){
        int num = 5125;
        int temp = num, rev=0, rem;
        while(num>0){
            rem = num%10;
            rev = rev*10 +rem;
            num = num/10;
        }
        if(temp==rev){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }
}
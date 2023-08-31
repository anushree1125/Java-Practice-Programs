class BankDriver{
    public static void main(String args[]){
        Bank b = new Bank(234554,"CNRB344","Nagara",6770000,"Dinga");
        System.out.println(b.getActno());
        System.out.println(b.getIfsc());
        System.out.println(b.getBranch());
        System.out.println(b.getBalance());
        System.out.println(b.getActholder());
        System.out.println("===================");
        b.setBalance(8000000);
        b.setBranch("Belthangady");
        System.out.println(b.getBalance());
        System.out.println(b.getBranch());


        
    }
}
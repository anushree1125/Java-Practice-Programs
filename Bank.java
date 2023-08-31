class Bank{
    private int acctNo;
    private String ifsc;
   private String branch_name;
    double balance;
    String acct_holderName;

    Bank(int acctNo){
        this.acctNo = acctNo;
    }
    Bank(int acctNo, String ifsc){
        this(acctNo);
        this.ifsc = ifsc;
    }
    Bank(int acctNo, String ifsc,String branch_name){
        this(acctNo,ifsc);
        this.branch_name = branch_name;
    }
    Bank(int acctNo,String ifsc,String branch_name, double balance){
        this(acctNo, ifsc,branch_name);
        this.balance = balance;
    }
    Bank(int acctNo,String ifsc, String branch_name,double balance,String acct_holderName){
        this(acctNo, ifsc,branch_name, balance);
        this.acct_holderName = acct_holderName;
    }
    public String getIfsc(){
        return ifsc;
    }
    public void setIfsc(String ifsc){
        this.ifsc = ifsc;
    }
    public int getActno(){
        return acctNo;
    }
    public String getBranch(){
        return branch_name;
    }
    public void setBranch(String branch_name){
        this.branch_name = branch_name;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public String getActholder(){
        return acct_holderName;
    }

}
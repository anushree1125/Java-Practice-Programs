class EmployeeDemo{
    private int id;
    private String name;
    private double salary;
    private long phone_num;
    private String gender;
    private String blood_group;
    private int age;

    EmployeeDemo(int id,String name, double salary,long phone_num,String gender,String blood_group,int age){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.phone_num = phone_num;
        this.gender = gender;
        this.blood_group = blood_group;
        this.age = age;
    }
  
    public int getId(){
        return id;
    }
    

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }

    public long getPhonenum(){
        return phone_num;
    }
    public void setPhonenum(long phone_num){
        this.phone_num = phone_num;
    }

    public String getGender(){
        return gender;
    }
    public String getBloodGroup(){
        return blood_group;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

}
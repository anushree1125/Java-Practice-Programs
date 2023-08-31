class StudentDemo{
    private int id;
    private String name;
    private int age;
    private String gender;
   
    //getter method
    public int getId(){3
        return id;
    }

    //setter method
    public void setId(int id){
        this.id=id;
    }

    public String getName(){
        return name; 
    }
    public void setName(String name){
        this.name= name;
    }
   
    public String getGender(){
        return gender;
    }
    public void setGender(String gender){
        this.gender = gender;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
         this.age = age;
    }
    StudentDemo(int id,String name, int age,String gender){
        this.id=id;
        this.name=name;
        this.age=age;
        this.gender=gender;
    }
}
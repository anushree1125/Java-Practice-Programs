class Student{
    int id;
    String name;
    char gender;
    String blood_group;
    long phone_no;
    Student(int id){
        this.id = id;
    }
    Student(int id,String name){
        this(id);
        this.name = name;
    }
    Student(int id,String name,char gender){
        this(id,name);
        this.gender = gender;
       
    }
    Student(int id,String name,char gender,String blood_group){
        this(id,name,gender);
        this.blood_group = blood_group;
    }
    Student( int id, String name,char gender,String blood_group,long phone_no){
        this(id,name,gender,blood_group);
        this.phone_no = phone_no;
    }
}


class Employee{
    int id;
    String name;
    double salary;
    String blood_group;
    long phone_num;

    Employee(int id){
        this.id = id;
    }
    Employee(int id,String name){
        this(id);
        this.name = name;
    }
    Employee(int id,String name,double salary){
        this(id,name);
        this.salary = salary;
    }
    Employee(int id,String name,double salary,String blood_group){
        this(id,name,salary);
        this.blood_group = blood_group;
    }
    Employee(int id,String name,double salary,String blood_group, long phone_num){
        this(id,name,salary,blood_group);
        this.phone_num= phone_num;
    }

}
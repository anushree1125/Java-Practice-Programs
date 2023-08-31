class EmployeeDemoDriver{
    public static void main(String[] args){
        EmployeeDemo emp = new EmployeeDemo(12, "Dino", 12000, 7865657687L, "Male", "O+",21);
        System.out.println(emp.getId());
        System.out.println(emp.getName());
        System.out.println(emp.getSalary());
        System.out.println(emp.getPhonenum());
        System.out.println(emp.getGender());
        System.out.println(emp.getBloodGroup());
        System.out.println(emp.getAge());

        System.out.println("==========================");
        emp.setSalary(50000);
        emp.setPhonenum(1234564567L);
        emp.setAge(50);

        System.out.println(emp.getId());
        System.out.println(emp.getName());
        System.out.println(emp.getSalary());
        System.out.println(emp.getPhonenum());
        System.out.println(emp.getGender());
        System.out.println(emp.getBloodGroup());
        System.out.println(emp.getAge());



    }
}
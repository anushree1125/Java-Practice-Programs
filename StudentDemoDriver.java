class StudentDemoDriver{
    public static void main(String[] args){
        StudentDemo st = new StudentDemo(1,"Anushree", 21, "Female");
        System.out.println(st.getId());
        System.out.println(st.getName());
        System.out.println(st.getAge());
        System.out.println(st.getGender());

        System.out.println("================================");
        st.setId(100);
        st.setAge(2);
        st.setName("Dinga");

        System.out.println(st.getId());
        System.out.println(st.getName());
        System.out.println(st.getAge());
        System.out.println(st.getGender());
    }
}
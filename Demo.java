class Demo{
    public static void main(String args[]) {
        int a=62,b=7,c=14;
        int d=++b- --a + ++c + ++a -b-- -c-- + ++a;
        a = ++a;
        b=b++;
        System.out.println(a+" "+b+ " "+c+ " "+d);
        
    }
}
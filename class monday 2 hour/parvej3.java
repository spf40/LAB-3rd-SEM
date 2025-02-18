class parvej3{
    void m1 (int a, int b){
        System.out.println(a+b);
    }
    void m2 (int a, double b){
System.out.println(a+b);
    }
    void m3 (byte a, int b){
System.out.println(a+b);
    }
    public static void main(String[] args) {
        parvej3 ob= new parvej3();
        ob.m1(10, 20);
        ob.m2(10,20.5);
        ob.m3((byte)100,400);

    }
}
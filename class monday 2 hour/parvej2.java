class parvej2 {
    void m1 (int a,int b){
         System.out.println(a+b);   
    }
    void m1 (int a , double b) {
        System.out.println(a+b);
    }
    public static void main(String[] args){
    parvej2 ob= new parvej2();
    ob.m1 (10,20);
    ob.m1 (5,7.5);
}
}
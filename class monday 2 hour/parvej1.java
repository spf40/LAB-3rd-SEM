class parvej1{
    void m1 (int a, int b){
    System.out.println(a+b);
   }
   void m2(int a , double b){
System.out.println(a+b);   
}
public static void main(String[] args) {
 parvej1 ob = new parvej1();
 ob.m1 (10,20); 
 ob.m2(5,7.5);
}
}
class parvej2 {
    void m1 () {
    System.out.println("diu");
    }
    class parvej3 extends parvej2{
        void m2 (){
            System.out.println("cse");
        } 
        public static void main(String[] args) {
            parvej3 ob= new parvej3();
            ob.m1();
            ob.m2();
        }
    }

}
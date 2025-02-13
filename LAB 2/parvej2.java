class parvej {
  static  int count=0;
    void show() {
        count++;
        System.out.println(count); 
    }
    public static void main(String[] args) {
        parvej ob1= new parvej ();
ob1.show();
parvej ob2 =new parvej ();
ob2.show();
parvej ob3=new parvej ();
ob3.show();
    }
    
}

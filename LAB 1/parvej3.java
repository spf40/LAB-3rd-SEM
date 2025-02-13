class parvej {
    int a= 90;
    void dis (int b){
        a=98;
        System.out.println(a);
        System.out.println(b);

    } void dis2(){
        System.out.println(a);
    } public static void main(String[] args){
        parvej ob = new parvej ();
        ob.dis(94);
        ob.dis2();
}
}
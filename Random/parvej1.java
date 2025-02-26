claas A {
    void show (int ... a); {
        int sum = 0;
        for ( i:a ) {
            sum + = i ;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        parvej1 ob = new parvej1 (); 
        ob.show (10);
        ob.show (5,7);
        ob.show (10,15,20);
        ob.show (3,10,8,13);
    }
}
class parvej {
    int a =90 ;
    void dis (int b){
        this.a =100 ;
        System.out.println(b);
        dis2 ();
    }
            void dis2 (){
                System.out.println(this.a);
            }                 public static void main(String[] args){
                    parvej ob= new parvej();
                    ob.dis(94);
                }
            }
        
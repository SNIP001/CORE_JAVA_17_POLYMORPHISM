package $17_Polymorphism;


public class MethodOverriding {
    public static void main(String[] args) {
        
        AppleLaptop m1 = new MacbookPro();  //object casting
        AppleLaptop m2 = new MacbookAir();  // upcasting
        
        m1.start();
        m1.shutdown();
        
        MacbookPro m3 =(MacbookPro)m1;  //down casting 
        m3.timer();   // when we have paticular method in macbook pro but not in macbook air then we have to down cast and access the particular method [ timer () ]
        
        m2.start();
        m2.shutdown();
    }
}

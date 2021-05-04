package $17_Polymorphism;


public class MethodOverloading {      //Compile Time or Static Binding
    void add(int a, int b){
        int result = a+b;
        System.out.println(result);
    }
    
    void add(float a, float b){
       float result = a+b;
        System.out.println(result);
    }
    
    void add(double a, double b, double c){
        double result = a+b+c;
        System.out.println(result);
    }
    public static void main(String[] args) {
        MethodOverloading m = new MethodOverloading();
        m.add(2, 9);
        m.add(30f, 50f);
        m.add(9, 5, 755);
    }
}

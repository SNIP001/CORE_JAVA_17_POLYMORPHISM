package $17_Polymorphism;

public class AutomaticPromotion {
  
//    public void print(int i){
//        System.out.println("Integer version: "+i);
//    }

       public void print(float i){
        System.out.println("float version: "+i);
    }
//       public void print(String s){
//           System.out.println("string version");
//       }
        public void print(Object s){
           System.out.println("object version");
       }
       
       public static void main(String[] args) {
        AutomaticPromotion ap = new AutomaticPromotion();
        ap.print(126);  // we pass a int value but automatically the promotion happens and outputs in float value
        ap.print(12.5f);
        ap.print("hello");
    }
}

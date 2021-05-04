package $17_Polymorphism;


public class MacbookPro extends MacBook{
     @Override
     public void start(){
        System.out.println("macbook pro start");
    }
     @Override
   public void shutdown(){
        System.out.println("macbook pro shutdown");
    }
   public void timer(){
       System.out.println("timer");
   }
}

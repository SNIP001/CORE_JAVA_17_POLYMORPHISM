package $17_Polymorphism;


public class MacBook implements AppleLaptop{
    @Override
    public void start(){
        System.out.println("macbook start");
    }
    @Override
    public void shutdown(){
        System.out.println("macbook shutdown");
    }
}

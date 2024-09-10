public class Parent {
    public Parent() {
        System.out.println("Parent Constructor");
    }
    public void run(){
        System.out.println("parent run");
    }
    static {
        System.out.println("Parent static block");
    }
    {
        System.out.println("Parent initialisation  block");
    }
}
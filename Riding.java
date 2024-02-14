package oppps;
public class Riding {
    void show() {
        System.out.println("hello i am parrent");
    }
}
 class Child extends Riding {
    void show() {
        System.out.println("hello i am child");
    }

    public static void main(String[] args) {
        Child c1 = new Child();
        c1.show();
        Riding r1 =new Child();
        r1.show();
        
    }
}
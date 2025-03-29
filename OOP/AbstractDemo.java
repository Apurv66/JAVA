abstract class Base {
    abstract void demo();
    void test() {
        System.out.println("test method");
    }
}
class Derived extends Base {
    void demo() {
        System.out.println("demo method");
    }
}

class AbstractDemo {
    public static void main(String args[]){
        Derived d = new Derived();
        d.test();
        d.demo();
    }    
}

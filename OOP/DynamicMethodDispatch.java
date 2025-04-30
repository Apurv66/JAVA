class Base{
    void method(){
        System.out.println("Base class");
    }
}
class Derived extends Base{
    void method(){
        System.out.println("Derived class");
    }
}
class DynamicMethodDispatch {
    public static void main(String[] args) {
        Base ref;

        Base b = new Base();
        ref=b;
        ref.method();

        Derived d = new Derived();
        ref=d;
        ref.method();
    }
}
class Base {
    void method(){
        System.out.println("This is Base class");
    }
}
class Derived extends Base {
    void method(){
        System.out.println("This is Derived class");
    }
}
class DynamicMethodDispatch {
    public static void main(String args[]){
        Base ref;
        Derived d = new Derived();
        Base b = new Base();
        ref = d;
        ref.method();
        ref = b;
        ref.method();
    }
}

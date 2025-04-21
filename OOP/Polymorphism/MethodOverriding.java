// Run time polymorphism
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
class MethodOverriding {
    public static void main(String args[]){
        Base ref ;
        Derived obj = new Derived();
        Base b = new Base();
        ref = obj;
        ref.method();
        ref = b;
        ref.method();
    }
}

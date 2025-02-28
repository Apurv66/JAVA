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
        Derived obj = new Derived();
        obj.method();
    }
}

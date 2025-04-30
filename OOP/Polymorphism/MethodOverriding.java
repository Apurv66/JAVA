class Base{
    void method(){
        System.out.println("Base Class");
    }
}
class Derived extends Base{
    void method(){
        System.out.println("Derived Class");
    }
}
class MethodOverridingDemo{
    public static void main(String[] args) {
        Base b = new Base();
        b.method();

        Derived d = new Derived();
        d.method();
    }
}
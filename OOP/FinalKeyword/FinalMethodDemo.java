class Base {
    final void display(){
        System.out.println("This is final method.");
    }
}
class Derived extends Base {
    // final void Display(){
    //     System.out.println("This is final method.");
    // }
}
public class FinalMethodDemo {
    public static void main(String args[]){
        Base obj = new Base();
        obj.display();
    }
}

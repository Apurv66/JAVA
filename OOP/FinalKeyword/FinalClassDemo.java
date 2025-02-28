final class FinalClass {
    void display(){
        System.out.println("This is a final class.");
    }
}

// class Child extends FinalClass {}

public class FinalClassDemo {
    public static void main(String args[]){
        FinalClass obj = new FinalClass();
        obj.display();
    }
}

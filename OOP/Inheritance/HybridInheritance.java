class Animal {
    void run(){
        System.out.println("Animal can Run");
    }
}
class Dog extends Animal {
    void bark(){
        System.out.println("Dog can Bark");
    }
}
class BullDog extends Dog {
    void guard(){
        System.out.println("BullDog can Guard");
    }
}
class Cat extends Animal {
    void drink(){
        System.out.println("Cat can Drink");
    }
}
public class HybridInheritance {
    public static void main(String args[]){
        BullDog b = new BullDog();
        b.run();
        b.bark();
        b.guard();

        Cat c = new Cat();
        c.run();
        c.drink();
    }
}

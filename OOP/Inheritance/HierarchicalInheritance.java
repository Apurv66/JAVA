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
class Cat extends Animal {
    void drink(){
        System.out.println("Cat can Drink");
    }
}
public class HierarchicalInheritance {
    public static void main(String args[]){
        Dog d = new Dog();
        d.run();
        d.bark();

        Cat c = new Cat();
        c.run();
        c.drink();
    }
}

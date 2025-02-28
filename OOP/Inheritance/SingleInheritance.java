class Animal {
    void run(){
        System.out.println("Animal can run");
    }
}
class Dog extends Animal {
    void bark(){
        System.out.println("Dog can bark");
    }
}
class SingleInheritance {
    public static void main(String args[]){
        Dog obj = new Dog();
        obj.run();
        obj.bark();
    }
}

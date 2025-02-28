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
class MultiLevelInheritance {
    public static void main(String args[]){
        BullDog obj = new BullDog();
        obj.run();
        obj.bark();
        obj.guard();
    }
}

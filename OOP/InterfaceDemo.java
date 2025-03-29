interface Animal {
    void eat();
}

class Dog implements Animal {
    public void eat() {
        System.out.println("Dog can eat");
    }
    void run() {
        System.out.println("Dog can run");
    }
}

class InterfaceDemo {
    public static void main(String args[]) {
        Dog d = new Dog();
        d.eat();
        d.run();
    }
}

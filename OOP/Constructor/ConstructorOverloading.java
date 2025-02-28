class A {
    A() {
        System.out.println(10+20);
    }
    A(int a, int b) {
        System.out.println(a+b);
    }
    A(int a, int b, int c) {
        System.out.println(a+b+c);
    }
}

class ConstructorOverloading {
    public static void main(String args[]){
        A a = new A();
        A b = new A(15,20);
        A c = new A(10,20,30);
    }    
}

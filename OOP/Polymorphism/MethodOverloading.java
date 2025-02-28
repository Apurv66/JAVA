// Compile time polymorphism
class A {
    int sum() {
        return 10+20;
    }
    int sum(int a, int b) {
        return a+b;
    }
    float sum(float a, float b) {
        return a+b;
    }
}
class MethodOverloading {
    public static void main(String args[]){
        A obj = new A();
        System.out.println(obj.sum());
        System.out.println(obj.sum(5,10));
        System.out.println(obj.sum(3.5f, 5.5f));
    }    
}

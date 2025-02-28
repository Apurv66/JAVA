class A {
    int a;
    A(int a){
        this.a = a;
    }
}
class B {
    void display(A obj){
        System.out.println("a = " + obj.a);
    }
}
class ObjectAsPara {
    public static void main(String args[]){
        A obj = new A(5);
        B obj2 = new B();
        obj2.display(obj);
    }
}

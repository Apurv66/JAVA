class A{
    int a;
    A(int a){
        this.a=a;
        System.out.println(a);
    }
    A(A ref){
        a=ref.a;
        System.out.println(a);
    }
}

class CopyConstructor {
    public static void main(String args[]){
        A ref = new A(5);
        A ref2 = new A(ref);
    }
}
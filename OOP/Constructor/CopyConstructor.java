class A {
    int eno;
    String name;
    A(int eno, String name){
        this.eno=eno;
        this.name=name;
        System.out.println("Enrollment no: " + eno);
        System.out.println("Name: " + name);
    }
    A(A ref){
        eno=ref.eno;
        name=ref.name;
        System.out.println("Enrollment no: " + eno);
        System.out.println("Name: " + name);
    }
}
class CopyConstructor {
    public static void main(String args[]){
        A ref = new A(5, "abc");
        A ref2 = new A(ref);

    }
}
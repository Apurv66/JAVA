class Student {
    int eno;
    String name;
    Student(int eno, String name) {
        this.eno = eno;
        this.name = name;
    }
    void printData() {
        System.out.println("Enrollment no = " + eno);
        System.out.println("name = " + name);
    }
}

public class ParaConstructorDemo {
    public static void main(String args[]){
        Student s = new Student(5, "abc");
        s.printData();
    }
}

class Student{
    int eno;
    String name;
    void getData(int eno, String name){
        this.eno=eno;
        this.name=name;
    }
    public String toString(){
        return eno + " - " + name;
    }
}
class ToStringDemo{
    public static void main(String args[]){
        Student s = new Student();
        s.getData(46, "abc");
        System.out.println(s);
    }
}
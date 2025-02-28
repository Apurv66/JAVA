class ClassObj {
    int enroll;
    String name;
    void getData(int e, String n){
        enroll=e;
        name=n;
    }
    void printData(){
        System.out.println("Enrollment no: "+enroll);
        System.out.println("Name: "+name);
    }
}
class ClassObjDemo {
    public static void main(String args[]){
        ClassObj obj = new ClassObj();
        obj.getData(5,"abc");
        obj.printData();
    }
}
class This {
    int a;
    void getData(int a){
        this.a = a;
    }

    void printData(){
        System.out.println("a = "+a);
    }
}

public class ThisDemo {
    public static void main(String args[]){
        This obj = new This();
        obj.getData(5);
        obj.printData();
    }
}

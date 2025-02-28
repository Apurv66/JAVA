class StaticDemo {
    int a;
    static int i;

    static {
        System.out.println("This is static block");
    }
    void print(){
        System.out.println("a = "+a);
        System.out.println("i = "+i);
    }

    static void increment(){
        i++;
    }
    public static void main(String args[]){
        StaticDemo obj1 = new StaticDemo();
        increment();
        obj1.print();

        StaticDemo obj2 = new StaticDemo();
        increment();
        obj2.print();
    }
}

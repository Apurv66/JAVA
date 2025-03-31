class MyThread extends Thread {
    public void run() {
        for(int i=1; i<=5; i++){
            System.out.println(i);
        }
    }
}
class ThreadClass {
    public static void main(String args[]) {
        MyThread mt1 = new MyThread();
        MyThread mt2 = new MyThread();

        mt1.start();
        mt2.start();
    }
}
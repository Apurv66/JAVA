class MyThread implements Runnable {
    public void run() {
        for(int i=1; i<=5; i++) {
            System.out.println(i);
        }
    }
}

class RunnableInterface {
    public static void main(String args[]){
        MyThread mt1 = new MyThread();
        MyThread mt2 = new MyThread();
        Thread t1 = new Thread(mt1);
        Thread t2 = new Thread(mt2);

        t1.start();
        t2.start();
    }    
}

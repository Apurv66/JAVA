class MyThread extends Thread {
    public void run() {
        try {
            for(int i=1; i<=5; i++) {
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + " - " + i);
            }
        }catch(Exception e) {}
    }
}

class SleepDemo {
    public static void main(String args[]) {
        MyThread mt1 = new MyThread();
        mt1.setName("one");
        MyThread mt2 = new MyThread();
        mt2.setName("two");

        mt1.start();
        mt2.start();
    }    
}

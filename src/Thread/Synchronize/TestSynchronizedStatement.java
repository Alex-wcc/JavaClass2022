package Thread.Synchronize;

public class TestSynchronizedStatement implements Runnable {
    //一共有10张票
    private int ticket = 10;

    public void run() {
        while (true) {//持续卖票，一直到票数为0
            synchronized (this) {
                if (ticket > 0) {
                    try {
                        //为了演示，线程在这里睡眠一次
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "卖票-->" + (this.ticket--));
                } else {
                    break;
                }
            }
        }
    }

    public static void main(String args[]) {
        TestSynchronizedStatement testSynchronizedStatement = new TestSynchronizedStatement();
        Thread thread = new Thread(testSynchronizedStatement);//新建线程
        thread.setName("窗口1");//命名线程
        Thread thread1 = new Thread(testSynchronizedStatement);
        thread1.setName("窗口2");
        Thread thread2 = new Thread(testSynchronizedStatement);
        thread2.setName("窗口3");
        thread.start();//线程运行
        thread1.start();
        thread2.start();
    }
}

package Thread.Synchronize;

public class TestSynchronizedMethod implements Runnable {
    //一共10张票
    private int ticket = 10;

    public void run() {
        while (ticket > 0) {//持续卖票，一直到票数为0
            sell();
        }
    }

    public synchronized void sell() {
        if (ticket > 0) {
            try {
                //为了演示产生的问题，线程在这里睡眠一次
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //睡眠结束后，继续当前的票进行销售
            System.out.println(Thread.currentThread().getName() + "卖票-->" + (this.ticket--));
        }
    }

    public static void main(String args[]) {
        TestSynchronizedMethod testSynchronizedMethod = new TestSynchronizedMethod();//创建线程
        Thread thread = new Thread(testSynchronizedMethod);
        thread.setName("窗口1");
        Thread thread1 = new Thread(testSynchronizedMethod);
        thread1.setName("窗口2");
        Thread thread2 = new Thread(testSynchronizedMethod);
        thread2.setName("窗口3");
        thread.start();//运行线程
        thread1.start();
        thread2.start();
    }
}

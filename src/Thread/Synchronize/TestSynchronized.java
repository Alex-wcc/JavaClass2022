package Thread.Synchronize;

import Thread.Controll.TestInterrupt;
import Thread.Controll.TestSleep;

public class TestSynchronized implements Runnable{
    private int ticket = 10;
    public void run()
    {
        while (true){
            if (ticket>0){
                try{
                    //为了演示产生的问题，线程在此处睡眠一次
                    Thread.sleep(10);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                //睡眠结束后，继续当前的票进行销售
                System.out.println(Thread.currentThread().getName()+"卖票-->"+(this.ticket--));
            }
            else
                break;
        }
    }
    public static void main(String args[])
    {
        TestSynchronized testSynchronized = new TestSynchronized();//创建线程
        Thread thread1 = new Thread(testSynchronized);
        thread1.setName("窗口1");//线程命名
        Thread thread2 = new Thread(testSynchronized);
        thread2.setName("窗口2");
        Thread thread3 = new Thread(testSynchronized);
        thread3.setName("窗口3");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

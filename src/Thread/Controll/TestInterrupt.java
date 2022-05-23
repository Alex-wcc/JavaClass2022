package Thread.Controll;

public class TestInterrupt extends Thread{
    public void run(){
        long start = System.nanoTime();
        System.out.println("线程睡眠");
        try{
            sleep(10000);
        }catch (InterruptedException e)
        {
            System.out.println("线程被唤醒");
        }
        long end = System.nanoTime();
        System.out.println("总的运行时间："+(end-start)/1000000+"毫秒");
    }
    public static void main(String args[])
    {
        TestInterrupt testInterrupt = new TestInterrupt();
        testInterrupt.start();
        testInterrupt.interrupt();
    }
}

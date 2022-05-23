package Thread.Controll;

public class YieldThrea extends Thread {
    int i = 0;

    public void run() {
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) { //线程运行到3的倍数次时让步一次
                System.out.println(Thread.currentThread().getName() + "第" + i + "次运行，让步");
                Thread.yield();
            } else {
                System.out.println(Thread.currentThread().getName() + "第" + i + "次运行。");
            }
        }
    }
}

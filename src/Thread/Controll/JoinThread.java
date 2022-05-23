package Thread.Controll;

public class JoinThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {//线程循环10次输出字符
            System.out.println(Thread.currentThread().getName() + "第" + i + "次输出");
        }
        System.out.println(Thread.currentThread().getName() + "运行结束");
    }

    public static void main(String args[]) {
        System.out.println("主线程开始运行");//main主线程开始运行
        JoinThread joinThread = new JoinThread();
        joinThread.setName("线程1");
        try {
            long start = System.nanoTime();
            joinThread.start();
            joinThread.join();//等待t线程运行结束
            //计算joinThread线程运行花费的时间
            long end = System.nanoTime();
            System.out.println("耗时"+(end-start)/1000000+"毫秒");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("主线程运行结束");
    }
}

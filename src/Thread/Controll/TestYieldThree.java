package Thread.Controll;

public class TestYieldThree {
    public static void main(String args[])
    {
        YieldThrea yieldThrea1 = new YieldThrea();//创建线程对象
        yieldThrea1.setName("第一个线程");//线程命名
        YieldThrea yieldThrea2 = new YieldThrea();
        yieldThrea2.setName("第二个线程");
        YieldThrea yieldThrea3 = new YieldThrea();
        yieldThrea3.setName("第三个线程");
        yieldThrea1.start();//启动线程
        yieldThrea2.start();
        yieldThrea3.start();
    }
}

package Thread;

public class TestSellTicketRunableShare {

    static public void main(String args[])
    {
        SellTicketRunable sellTicketRunable = new SellTicketRunable();//创建线程
        Thread thread1 = new Thread(sellTicketRunable);//创建线程对象
        Thread thread2 = new Thread(sellTicketRunable);
        Thread thread3 = new Thread(sellTicketRunable);
        thread1.setName("窗口1");//给线程命名
        thread2.setName("窗口2");
        thread3.setName("窗口3");
        thread1.start();//线程运行
        thread2.start();
        thread3.start();
    }



}

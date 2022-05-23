package Thread;

public class TestSellTicketRunable {
    static public void main(String args[])
    {
        SellTicketRunable str1 = new SellTicketRunable();//创建线程对象
        SellTicketRunable str2 = new SellTicketRunable();
        SellTicketRunable str3 = new SellTicketRunable();
        Thread t1s = new Thread(str1); //创建线程
        Thread t2s = new Thread(str2);
        Thread t3s = new Thread(str3);
        t1s.setName("窗口1");//给线程命名
        t2s.setName("窗口2");
        t3s.setName("窗口3");
        t1s.start();//线程运行
        t2s.start();
        t3s.start();

    }
}

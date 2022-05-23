package Thread;

public class TestSellTicket {

    static public void main(String args[])
    {
        SellTicket se1 = new SellTicket(); //创建线程对象
        SellTicket se2 = new SellTicket();
        SellTicket se3 = new SellTicket();
        se1.setName("窗口1");     //给线程命名
        se2.setName("窗口2");
        se3.setName("窗口3");
        se1.start();   //线程运行
        se2.start();
        se3.start();

    }
}

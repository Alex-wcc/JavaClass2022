package Thread;

public class SellTicketRunable implements Runnable{
    private int ticket = 10;
    public void run()
    {
        while (this.ticket>=0)//持续卖票，一直到余票数为0
        {
            System.out.println(Thread.currentThread().getName()+"卖票-->"+(this.ticket--));
        }
    }
}

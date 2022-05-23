package Thread;

public class SellTicket extends Thread {
    int ticket=10;
    //重写Thread类的run()方法;
    public void run(){
        //持续售票，一直到剩余票数为0；
        while (this.ticket>0)
            System.out.println(this.getName()+"卖票-->"+(this.ticket--));
    }


}

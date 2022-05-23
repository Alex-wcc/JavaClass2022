package Thread.Daemon;

public class DaemonThread extends Thread{
    public DaemonThread(){
        //在线程启动之前设置后台线程；
        setDaemon(true);
        start();//启动线程
    }
}

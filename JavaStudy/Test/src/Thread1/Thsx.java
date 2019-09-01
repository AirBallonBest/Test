package Thread1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Thsx extends Thread {
	
	Lock lock = new ReentrantLock();
	
	
	
	public Thsx(String name) {
		super(name);
	}
    
    public void get() {
        lock.lock();
        try {
        	  String threadName = Thread.currentThread().getName();
            System.out.println(threadName + "\t invoked set()");
            //调用下一个加锁的方法
          //  sleep(3000);
            set();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void set() {
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + "\t ######invoked set()");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    @Override
    public void run() {
    	get();
    }

}

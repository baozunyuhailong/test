package test_yhl;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class bubbleSort {
	public static CountDownLatch countDownLatch;
	public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        countDownLatch = new CountDownLatch(2);
        CallableThread c1 = new CallableThread(countDownLatch,1000);
        CallableThread c2 = new CallableThread(countDownLatch,20000);

        Future<SingletonClass> f1 = executorService.submit(c1);
        Future<SingletonClass> f2 = executorService.submit(c2);
        executorService.shutdown();
        countDownLatch.await();
        
        System.out.println(countDownLatch.getCount());
        System.out.println(f1.get() == f2.get());
        //executorService.isTerminated();
    }
    public static class CallableThread implements Callable<SingletonClass> {
    	
    	private CountDownLatch countDownLatch;
    	private int aa;
    	CallableThread(CountDownLatch countDownLatch, int aa) {
    		 this.countDownLatch = countDownLatch;
    		 this.aa = aa;
    	}
        //需要实现Callable的Call方法
        public SingletonClass call() throws Exception {
        	Thread.sleep(aa);
        	countDownLatch.countDown();
        	System.out.println(countDownLatch.getCount());
            return SingletonClass.getInstance();
        }
    }
}

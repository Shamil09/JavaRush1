package thread;

public class MyFirstThread {
    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i <10 ; i++) {
          new Thread(new MyThread(i+1));
            //thread.start();
        }
        System.out.println("DCT");
    }
}

class MyThread extends Thread {
    private static int i=0;
    private int n,m;
    MyThread(int m) {
 //       this.start();
        i++;
        this.n=i;
        this.m=m;
        start();
    }

    @Override
    public void run() {
        System.out.println(m+" запустился Пток "+ n);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(m+" Завершился Пток "+ n);
    }
}

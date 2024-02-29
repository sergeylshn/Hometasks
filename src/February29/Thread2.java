package February29;

public class Thread2 extends Thread {
    @Override
    public void run() {
        int counter = 2;
        while (counter <= 10) {
            synchronized (Monitors.MONITOR) {
                try {
                    Monitors.MONITOR.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println(counter + " - Я Поток Ричард");
            counter += 2;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (Monitors.MONITOR) {
                Monitors.MONITOR.notify();
            }
        }
    }

}


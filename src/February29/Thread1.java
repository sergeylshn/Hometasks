package February29;

public class Thread1 extends Thread {
    @Override
    public void run() {
        int counter = 1;
        while (counter <= 10) {
            System.out.println(counter + " - Я Поток Вася");
            counter += 2;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (Monitors.MONITOR) {
                Monitors.MONITOR.notify();
            }
            synchronized (Monitors.MONITOR) {
                try {
                    Monitors.MONITOR.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}

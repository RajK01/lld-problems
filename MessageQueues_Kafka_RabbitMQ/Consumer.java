// Consumer Class
class Consumer extends Thread {
    private final Broker broker;

    public Consumer(Broker broker) {
        this.broker = broker;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                Message message = broker.receiveMessage();
                System.out.println("Consumed: " + message);
                Thread.sleep(1000); // Simulate processing time
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
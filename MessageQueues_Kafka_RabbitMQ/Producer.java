// Producer Class
class Producer extends Thread {
    private final Broker broker;

    public Producer(Broker broker) {
        this.broker = broker;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            String content = "Message " + i;
            broker.sendMessage(content);
            try {
                Thread.sleep(500); // Simulate delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
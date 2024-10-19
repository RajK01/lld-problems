// Main Class to run the system
public class MessageQueueSystem {
    public static void main(String[] args) {
        Broker broker = new Broker();

        Producer producer = new Producer(broker);
        Consumer consumer = new Consumer(broker);

        producer.start();
        consumer.start();
    }
}
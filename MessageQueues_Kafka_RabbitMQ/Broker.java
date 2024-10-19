// Broker Class (Manages the queue)
class Broker {
    private final MessageQueue messageQueue;

    public Broker() {
        this.messageQueue = new MessageQueue();
    }

    public void sendMessage(String content) {
        Message message = new Message(content);
        messageQueue.enqueue(message);
    }

    public Message receiveMessage() throws InterruptedException {
        return messageQueue.dequeue();
    }
}

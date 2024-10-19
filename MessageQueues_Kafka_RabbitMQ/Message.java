/ Message Class
class Message {
    private String messageId;
    private String content;
    private long timestamp;

    public Message(String content) {
        this.messageId = UUID.randomUUID().toString();
        this.content = content;
        this.timestamp = System.currentTimeMillis();
    }

    public String getMessageId() { return messageId; }
    public String getContent() { return content; }
    public long getTimestamp() { return timestamp; }

    @Override
    public String toString() {
        return "Message{" + "ID='" + messageId + "', Content='" + content + "'}";
    }
}
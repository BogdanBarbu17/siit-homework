package siit.homework05;

public class Message {

    private final String expeditor;
    private final String content;

    public String getExpeditor() {
        return expeditor;
    }

    public Message(String expeditor, String content) {
        this.expeditor = expeditor;
        this.content = content;
    }

    @Override
    public String toString() {
        return "Message{" +
                "content='" + content + '\'' +
                '}';
    }
}

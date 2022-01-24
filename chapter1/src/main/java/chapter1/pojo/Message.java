package chapter1.pojo;

import java.util.Objects;

public class Message {
    private String text;

    public Message(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Message)) return false;
        Message message = (Message) o;
        return getText().equals(message.getText());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getText());
    }

    @Override
    public String toString() {
        return "Message{" +
                "text='" + text + '\'' +
                '}';
    }
}

package chapter1.pojo;

import java.util.Objects;

public class MessageEntity {
    Long id;
    String Text;

    public MessageEntity() {
    }

    public MessageEntity(Long id, String text) {
        this();
        this.id = id;
        Text = text;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        Text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MessageEntity)) return false;
        MessageEntity that = (MessageEntity) o;
        return getId().equals(that.getId()) && getText().equals(that.getText());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getText());
    }

    @Override
    public String toString() {
        return "MessageEntity{" +
                "id=" + id +
                ", Text='" + Text + '\'' +
                '}';
    }
}

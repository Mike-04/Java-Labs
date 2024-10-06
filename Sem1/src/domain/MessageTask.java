package domain;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MessageTask extends Task {

    private String message;
    private String from;
    private String to;
    private LocalDateTime date;

    public MessageTask(String taskID, String description,String message, String from, String to, LocalDateTime date) {
        super(taskID, description);
        this.message = message;
        this.from = from;
        this.to = to;
        this.date = date;
    }

    @Override
    public String toString() {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        return "MessageTask{" +
                //get taskID and description from the parent class
                super.toString()+
                " message='" + message + '\'' +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", date=" + date.format(format) +
                '}';
    }

    @Override
    public void execute() {
        System.out.println("Message: " + message + " date: " + date);
    }
}

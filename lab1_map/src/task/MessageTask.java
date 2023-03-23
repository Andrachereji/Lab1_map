package task;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MessageTask extends Task{
    private String from;
    private String to;
    private LocalDateTime date;

    public MessageTask(Long id, String desc, String from, String to, LocalDateTime date) {
        super(id, desc);
        this.from=from;
        this.to=to;
        this.date=date;
    }
    @Override
    public void execute() {
        System.out.println("Taskul "+super.toString()+" \n a fost executat la data de: "
                +date.format(DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm")));

    }
}


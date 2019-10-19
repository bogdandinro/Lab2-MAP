package model;

import formatter.Constants;

import java.time.LocalDateTime;

public class MessageTask extends Task {
    private String mesaj,from,to;
    private LocalDateTime date;

    public MessageTask(String taskID, String descriere, String mesaj, String from, String to, LocalDateTime date) {
        super(taskID, descriere);
        this.mesaj = mesaj;
        this.from = from;
        this.to = to;
        this.date = date;
    }
    @Override
    public String toString(){
        return super.toString() + "   |message:" + mesaj + "   |from=" + from + "   |to=" + to + "   |date=" + date.format(Constants.DATE_TIME_FORMATTER);
    }
    @Override
    public void execute(){
        System.out.println(toString());
    }

}
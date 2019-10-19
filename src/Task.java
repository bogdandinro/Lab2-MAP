

import formatter.Constants;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static formatter.Constants.DATE_TIME_FORMATTER;

public abstract class Task {
    private String taskID,descriere;

    public Task(String taskID, String descriere) {
        this.taskID = taskID;
        this.descriere = descriere;
    }

    public String getTaskID() {
        return taskID;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setTaskID(String taskID) {
        this.taskID = taskID;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    @Override
    public String toString(){
        return taskID + " " + descriere;
    }
    @Override
    public boolean equals(Object o){
        if(this == o ){
            return true;
        }
        if(! (o instanceof   Task)){
            return false;
        }
        final Task task=(Task) o;
        //aici e diferit fata de cum e la seminar
        if((this.taskID == null ) ? (task.taskID != null) : this.taskID.equals(task.taskID)){
            return false;
        }
        if((this.descriere == null ) ? (task.descriere != null ) : this.descriere.equals(task.descriere)){
            return false;
        }
        return true;
    }
    @Override
    public int hashCode(){
        int hash=3;
        hash = 53 * hash + (this.descriere !=null ? this.descriere.hashCode() : 0);
        hash = 53 * hash + (this.taskID !=null ? this.taskID.hashCode() : 0);
        return hash;
    }
     abstract void execute();
}

//o sa dea eroare clasa asta pana implementam methoda execute
public class MessageTask extends Task{
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

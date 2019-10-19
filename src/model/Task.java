package model;

public abstract class Task {
    private String taskID,descriere;

    public Task(){}

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

    public abstract void execute();
}
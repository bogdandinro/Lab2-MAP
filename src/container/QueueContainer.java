package container;

import model.Task;

public class QueueContainer extends AbstractContainer {

    @Override
    public Task remove(){
        if(!isEmpty()){
            Task task = tasks[0];
            for(int i=0;i< this.size - 1;i++){
                tasks[i] = tasks[i+1];
            }
            this.size -- ;
            return task;
        }
        return null;
    }
}

package container;

import model.Task;

public class StackContainer extends AbstractContainer {

    @Override
    public Task remove(){
        if(!isEmpty()){
            this.size--;
            return  tasks[this.size];
        }
        return null;
    }
}

package container;

import model.Task;

public abstract class AbstractContainer implements Container {
    protected Task tasks[];
    protected int size;
    protected int capacity;

    public AbstractContainer(){
        this.capacity=100;
        this.tasks=new Task[capacity];
        this.size=0;
    }

    private void resizeTasks(Task aux[]){
        tasks=new Task[capacity];
        for(int i=0;i<size;i++) {
            tasks[i] = aux[i];
        }
    }

    private void checkCapacity(){
        if(size == capacity){
            capacity=capacity + capacity / 2;
            resizeTasks(tasks);
        }
    }

    @Override
    public  void add(Task task){
        tasks[this.size] = task;
        this.size++;
    }
    @Override
    public int size(){
        return this.size;
    }
    @Override
    public boolean isEmpty(){
        if(this.size == 0 ){
            return true;
        }
        return false;
    }

}
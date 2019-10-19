package sortArray;

public abstract class AbstractSorter {
    protected int vector[];
    protected int lungime;

    public AbstractSorter(int[] vector, int lungime) {
        this.vector = vector;
        this.lungime = lungime;
    }

    public abstract void sort();

    public void print(){
        for(int i=0;i < lungime;i++){
            System.out.println(vector[i] + " ");
        }
        System.out.println();
    }
}

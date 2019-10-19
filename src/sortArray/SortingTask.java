package sortArray;

import model.Task;

public class SortingTask extends Task {
    public AbstractSorter  abstractSorter;
    public SortingStrategy sortingStrategy;
    private int vector[];
    private int lungime;

    public SortingTask(SortingStrategy sortingStrategy, int[] vector, int lungime) {
        this.sortingStrategy = sortingStrategy;
        this.vector = vector;
        this.lungime = lungime;
        this.abstractSorter = getSort();
    }

    public AbstractSorter getSort()
    {
        switch (this.sortingStrategy)
        {
            case BubleSort:
                return new BubleSort(vector, lungime);
            case MergeSort:
                return new MergeSort(vector, lungime);
            default:
                return null;
        }
    }
@Override
    public void execute(){
        abstractSorter.sort();
        abstractSorter.print();
}

}

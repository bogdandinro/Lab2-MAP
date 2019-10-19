import sortArray.SortingStrategy;
import sortArray.SortingTask;

public class Main {
    public static void main(String[] args){
        System.out.println("Cerinta 3");
        System.out.println();

        SortingTask sortingTaskBubleSort = new SortingTask(SortingStrategy.BubleSort, new int[]{1,2,8,3,7,4,6,5,9,0},10);
        System.out.println("Sortare folosind BubleSort ");
        System.out.println();
        sortingTaskBubleSort.execute();

        SortingTask sortingTaskMergeSort = new SortingTask(SortingStrategy.MergeSort, new int[]{10, 1, 9, 2, 8, 3, 7, 4, 6, 5}, 10);
        System.out.println("Sortare folosind MergeSort:");
        sortingTaskMergeSort.execute();
        System.out.println();
    }
}

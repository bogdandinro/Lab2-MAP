package sortArray;

public class BubleSort extends AbstractSorter {
    public BubleSort(int[] vector, int lungime) {
        super(vector, lungime);
    }
    @Override
    public void sort(){
        boolean sortat;
        do {
            sortat = true;
            for (int i = 0; i < lungime - 1; i++)
            {
                for (int j = i + 1; j < lungime; j++)
                {
                    if (vector[i] > vector[j])
                    {
                        int aux = vector[i];
                        vector[i] = vector[j];
                        vector[j] = aux;
                        sortat = false;
                    }
                }
            }

        }while(sortat == false);
    }

}

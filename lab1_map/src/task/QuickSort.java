package task;

public class QuickSort extends AbsSorter{

    static void QuickSort (int v[], int st, int dr)
    {
        if(st < dr)
        {
            int m = (st + dr) / 2;
            int aux = v[st];
            v[st] = v[m];
            v[m] = aux;
            int i = st , j = dr, d = 0;
            while(i < j)
            {
                if(v[i] > v[j])
                {
                    aux = v[i];
                    v[i] = v[j];
                    v[j] = aux;
                    d = 1 - d;
                }
                i += d;
                j -= 1 - d;
            }
            QuickSort(v, st , i - 1);
            QuickSort(v, i + 1 , dr);
        }
    }
    @Override
    public void sort(int nr[]){
        QuickSort(nr,0,nr.length-1);
    }
}

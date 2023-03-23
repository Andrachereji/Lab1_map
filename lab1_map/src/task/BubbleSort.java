package task;

public class BubbleSort extends AbsSorter {
    @Override
    public void sort(int nr[]) {
        int n = nr.length;
        for (int i = 0; i < n - 1; i++)
            for(int j=0;j<n-i-1;j++)
                if (nr[j]>nr[j+1]){
                    int aux=nr[j];
                    nr[j]=nr[j+1];
                    nr[j+1]=aux;
                }
    }
}

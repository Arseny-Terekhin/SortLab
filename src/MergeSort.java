import java.util.ArrayList;
import java.util.List;

public class MergeSort {

    public static void start(List<Integer> ar) {
        long startTime = System.currentTimeMillis();
        mergeSort(ar, ar.size());
        long finishedTime = System.currentTimeMillis();
        long time = finishedTime - startTime;
        System.out.println("Время сортировки " + time + " миллисекунд ");
    }

    public static void mergeSort(List<Integer> array, int n) {
        if (n < 2) {return;}
        int mid = n / 2;
        List<Integer> l = new ArrayList<>();
        List<Integer> r = new ArrayList<>();

        for (int i = 0; i < mid; i++) {
            l.add(array.get(i));
        }
        for (int i = mid; i < n; i++) {
            r.add(array.get(i));
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(array ,l, r, mid, n - mid);

    }

    public static void merge(List<Integer> a,List<Integer> l, List<Integer> r, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l.get(i) <= r.get(j)) {
                a.set(k, l.get(i));
                k++;
                i++;
            }
            else {
                a.set(k, r.get(j));
                k++;
                j++;
            }
        }
        while (i < left) {
            a.set(k, l.get(i));
            k++;
            i++;
        }
        while (j < right) {
            a.set(k, r.get(j));
            k++;
            j++;
        }
    }

    public static void startRevers(List<Integer> ar) {
        long startTime = System.currentTimeMillis();
        mergeSortRevers(ar, ar.size());
        long finishedTime = System.currentTimeMillis();
        long time = finishedTime - startTime;
        System.out.println("Время сортировки " + time + " миллисекунд ");
    }

    public static void mergeSortRevers(List<Integer> array, int n) {
        if (n < 2) {return;}
        int mid = n / 2;
        List<Integer> l = new ArrayList<>();
        List<Integer> r = new ArrayList<>();

        for (int i = 0; i < mid; i++) {
            l.add(array.get(i));
        }
        for (int i = mid; i < n; i++) {
            r.add(array.get(i));
        }
        mergeSortRevers(l, mid);
        mergeSortRevers(r, n - mid);

        mergeRevers( array,l, r, mid, n - mid);

    }

    public static void mergeRevers(List<Integer> a ,List<Integer> l, List<Integer> r, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l.get(i) >= r.get(j)) {
                a.set(k, l.get(i));
                k++;
                i++;
            }
            else {
                a.set(k, r.get(j));
                k++;
                j++;
            }
        }
        while (i < left) {
            a.set(k, l.get(i));
            k++;
            i++;
        }
        while (j < right) {
            a.set(k, r.get(j));
            k++;
            j++;
        }
    }
}

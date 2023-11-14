import java.util.ArrayList;
import java.util.List;

public class SelectionSort {

    public static List<Integer> list;

    public static void selectionSort(List<Integer> array){
        long startTime = System.currentTimeMillis();
        list = new ArrayList<>(array);
        for (int left = 0; left < list.size(); left++) {
            int minInd = left;
            for (int i = left; i < list.size(); i++) {
                if (list.get(i) < list.get(minInd)) {
                    minInd = i;
                }
            }
            swap(left, minInd);
        }
        long finishedTime = System.currentTimeMillis();
        long time = finishedTime - startTime;
        System.out.println("Время сортировки " + time + " миллисекунд ");
    }

    public static void selectionSortRevers(List<Integer> array){
        long startTime = System.currentTimeMillis();
        list = new ArrayList<>(array);
        for (int left = 0; left < list.size(); left++) {
            int maxInd = left;
            for (int i = left; i < list.size(); i++) {
                if (list.get(i) > list.get(maxInd)) {
                    maxInd = i;
                }
            }
            swap(left, maxInd);
        }
        long finishedTime = System.currentTimeMillis();
        long time = finishedTime - startTime;
        System.out.println("Время сортировки " + time + " миллисекунд ");
    }

    private static void swap(int a, int b){
        int tmp = list.get(a);
        list.set(a, list.get(b));
        list.set(b, tmp);
    }
}

import java.util.ArrayList;
import java.util.List;

public class ShelloSort {

    public static List<Integer> list;

    public static void shellSort(List<Integer> array){
        long startTime = System.currentTimeMillis();
        list = new ArrayList<>(array);
        int gap = list.size() / 2;
        while (gap >= 1) {
            for (int right = 0; right < list.size(); right++) {
                for (int c = right - gap; c >= 0; c -= gap) {
                    if (list.get(c) > list.get(c + gap)) {
                        swap(c, c + gap);
                    }
                }
            }
            gap = gap / 2;
        }
        long finishedTime = System.currentTimeMillis();
        long time = finishedTime - startTime;
        System.out.println("Время сортировки " + time + " миллисекунд ");
    }

    public static void shellSortRevers(List<Integer> array){
        long startTime = System.currentTimeMillis();
        list = new ArrayList<>(array);
        int gap = list.size() / 2;
        while (gap >= 1) {
            for (int right = 0; right < list.size(); right++) {
                for (int c = right - gap; c >= 0; c -= gap) {
                    if (list.get(c) < list.get(c + gap)) {
                        swap(c, c + gap);
                    }
                }
            }
            gap = gap / 2;
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

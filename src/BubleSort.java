import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class BubleSort {

    public static List<Integer> list;

    static public void bubleSort(List<Integer> array){
        long startTime = System.currentTimeMillis();
        list = new ArrayList<>(array);
        boolean a = true;
        while (a){
            a = false;
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i) < list.get(i - 1)) {
                    swap(i, i - 1);
                    a = true;
                }
            }
        }
        long finishedTime = System.currentTimeMillis();
        long time = finishedTime - startTime;
        System.out.println("Время сортировки " + time + " миллисекунд ");
    }

    static public void bubleSortRevers(List<Integer> array){
        long startTime = System.currentTimeMillis();
        list = new ArrayList<>(array);
        boolean a = true;
        while (a){
            a = false;
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i) > list.get(i - 1)) {
                    swap(i, i - 1);
                    a = true;
                }
            }
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
import java.util.List;

public class QuickSort{

    public static void quickSort(List<Integer> list, int low, int high) {
        if (low < high) {
            int pivotIndex = qus(list, low, high);
            quickSort(list, low, pivotIndex - 1);
            quickSort(list, pivotIndex + 1, high);
        }
    }

    private static int qus(List<Integer> list, int low, int high) {
        int pivot = list.get(high);
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (list.get(j) <= pivot) {
                i++;
                int temp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, temp);
            }
        }

        int temp = list.get(i + 1);
        list.set(i + 1, list.get(high));
        list.set(high, temp);

        return i + 1;
    }

    public static void quickSortRevers(List<Integer> list, int low, int high) {
        if (low < high) {
            int pivotIndex = qusr(list, low, high);
            quickSortRevers(list, low, pivotIndex - 1);
            quickSortRevers(list, pivotIndex + 1, high);
        }
    }

    private static int qusr(List<Integer> list, int low, int high) {
        int pivot = list.get(high);
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (list.get(j) >= pivot) {
                i++;
                int temp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, temp);
            }
        }

        int temp = list.get(i + 1);
        list.set(i+ 1, list.get(high));
        list.set(high, temp);

        return i + 1;
    }



}

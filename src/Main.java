import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        long size = in.nextLong();
        List<Integer> array = new ArrayList<>();
        for (long i = 0; i < size; i++){
            array.add(random.nextInt(1000));
        }
        System.out.println(array);

        System.out.println("\nВстроенный метод сортировки в java");
        List<Integer> arraySort = new ArrayList<>((array));
        long s = System.currentTimeMillis();
        arraySort.sort(Comparator.naturalOrder());
        long f = System.currentTimeMillis();
        System.out.println(array);
        System.out.println( "Время " + (f - s) );

        System.out.println("\nМетод пузырька ");
        System.out.println(array);
        BubleSort.bubleSort(array);
        BubleSort.bubleSortRevers(array);

        System.out.println("\nМетод выборки");
        SelectionSort.selectionSort(array);
        SelectionSort.selectionSortRevers(array);

        System.out.println("\nМетод Щелло");
        ShelloSort.shellSort(array);
        ShelloSort.shellSortRevers(array);

        System.out.println("\nМетод слиянием");
        List<Integer> arrayShelloSort = new ArrayList<>((array));
        MergeSort.start(arrayShelloSort);
        List<Integer> arrayShelloSortRevers = new ArrayList<>((array));
        MergeSort.startRevers(arrayShelloSortRevers);

        System.out.println("\n Метод быстрой сортировки");
        long startTime = System.currentTimeMillis();
        List<Integer> arrayQuickSort = new ArrayList<>((array));
        QuickSort.quickSort(arrayQuickSort,0,arrayQuickSort.size() - 1);
        long finishedTime = System.currentTimeMillis();
        long time = finishedTime - startTime;
        System.out.println("Время сортировки " + time + " миллисекунд ");
        startTime = System.currentTimeMillis();
        List<Integer> arrayQuickSortRevers = new ArrayList<>((array));
        QuickSort.quickSortRevers(arrayQuickSortRevers,0,arrayQuickSortRevers.size() - 1);
        finishedTime = System.currentTimeMillis();
        time = finishedTime - startTime;
        System.out.println("Время сортировки " + time + " миллисекунд ");
    }
}
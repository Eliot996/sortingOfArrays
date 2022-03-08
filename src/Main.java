import java.util.ArrayList;
import java.util.Collections;

public class Main {

    final private static int DATA_SIZE = 1000000;

    public static void main(String[] args) {
        Sort sorter = new Sort();

        ArrayList<Integer> intArray = generateData(DATA_SIZE);

        // selection sort
        printFirst50(intArray);

        System.out.println("Selection sorting:");

        long timeStart = System.nanoTime();
        sorter.selectionSort(intArray);
        long timeStop = System.nanoTime();

        System.out.print("Done - it took " + (timeStop - timeStart)/100000 + " timeunits");
        System.out.println();

        printFirst50(intArray);

        System.out.println();
        System.out.println();
        System.out.println();

        // remake data
        intArray = generateData(DATA_SIZE);

        // timSort
        printFirst50(intArray);

        System.out.println("Lists.sort sorting:");

        timeStart = System.nanoTime();
        Collections.sort(intArray);
        timeStop = System.nanoTime();

        System.out.print("Done - it took " + (timeStop - timeStart)/100000 + " timeunits");
        System.out.println();

        printFirst50(intArray);


    }

    private static void printFirst50(ArrayList<Integer> intArray) {
        for (int i = 0; i < 50; i++) {
            System.out.print(intArray.get(i) + "-");
        }
        System.out.println();
    }

    public static ArrayList<Integer> generateData(int amount) {
        ArrayList<Integer> list = new ArrayList<>(amount);

        for (int i = 0; i < amount; i++) {
            list.add((int) (Math.random() * 1000));
        }

        return list;
    }
}

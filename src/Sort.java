import java.util.ArrayList;
import java.util.Collections;

public class Sort {

    public ArrayList<Integer> selectionSort(ArrayList<Integer> a) {
        int min;
        int minPos;

        for (int i = 0; i < a.size(); i++) {
            min = a.get(i);
            minPos = i;

            for (int j = i+1; j < a.size(); j++) {
                if (a.get(j) < min) {
                    min = a.get(j);
                    minPos = j;
                }
            }
            Collections.swap(a, i, minPos);
        }

        return a;
    }
}

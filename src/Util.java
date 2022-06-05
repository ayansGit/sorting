import java.util.ArrayList;

public class Util {

    public static void swap(ArrayList<Integer> arrayList, int x, int y){
        int temp = arrayList.get(x);
        arrayList.set(x, arrayList.get(y));
        arrayList.set(y, temp);
    }
}

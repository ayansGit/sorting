import java.util.ArrayList;
import java.util.List;

public class MergeSort {

    ArrayList<Integer> input = new ArrayList<>();

    public MergeSort(ArrayList<Integer> input) {
        this.input = input;
    }

    public ArrayList<Integer> sort(){
        int e = input.size() - 1;
        long startTime = System.nanoTime();
        mergeSort(input, 0, e);
        long endTime = System.nanoTime();
        System.out.println("Merge Sort: Elapsed Time in nano seconds: "+ (endTime-startTime));
        return input;
    }

    /**
     *
     * @param A input array
     * @param s start index
     * @param e end index
     * @return merged array
     */
    private void mergeSort(ArrayList<Integer> A, int s, int e){
        if(s==e){
            return;
        }
        int mid = (s+e)/2;
        mergeSort(A, s, mid);
        mergeSort(A, mid+1, e);
        mergeSortedArray(A, s, mid, e);

    }

    private void mergeSortedArray(ArrayList<Integer> A, int s, int mid, int e){
        int p1 = 0;
        int p2 = 0;
        int p3= s;
        int n1 = mid - s + 1;
        int n2 = e - mid;
        ArrayList<Integer> T = new ArrayList(e-s+1);
        List<Integer> T1 =A.subList(s, mid+1);
        List<Integer> T2 =A.subList(mid+1, e+1);
        while (p1<n1 && p2<n2){
            if(T1.get(p1)< T2.get(p2)){
                A.set(p3, T1.get(p1));
                p1++;
                p3++;
            }else {
                A.set(p3, T2.get(p2));
                p3++;
                p2++;
            }
        }
        while (p1<n1){
            A.set(p3, T1.get(p1));
            p1++;
            p3++;
        }
        while (p2<n2){
            A.set(p3, T2.get(p2));
            p2++;
            p3++;
        }
//        for(int i = 0; i<(e-s+1); i++){
//            A.set((i+s), T.get(i));
//        }
    }

}

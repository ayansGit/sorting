import java.util.ArrayList;
import java.util.List;

public class MergeSort {

    ArrayList<Integer> input = new ArrayList<>();

    public MergeSort() {

    }

    public MergeSort(ArrayList<Integer> input) {
        this.input = input;
    }

    public ArrayList<Integer> sort(){
        int e = input.size() - 1;
        long startTime = System.nanoTime();
        mergeSort(input, 0, e);
        long endTime = System.nanoTime();
        System.out.println("Merge Sort: Elapsed Time in milli seconds: "+ (double)(endTime-startTime)/1000000);
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
        int p1 = s;
        int p2 = mid+1;
        List<Integer> T = new ArrayList();

        while (p1<=mid && p2<=e){
            if(A.get(p1)< A.get(p2)){
                T.add(A.get(p1));
                p1++;
            }else {
                T.add(A.get(p2));
                p2++;
            }
        }
        while (p1<=mid){
            T.add(A.get(p1));
            p1++;
        }
        while (p2<=e){
            T.add(A.get(p2));
            p2++;
        }

        for(int i = 0; i<T.size(); i++){
            A.set((i+s), T.get(i));
        }
    }

    /**
     * Merge the two sorted array to make a sorted array.
     * @param A Sorted Array
     * @param B Sorted Array
     */
    public ArrayList<Integer> question1(ArrayList<Integer> A, ArrayList<Integer> B){
        System.out.println("Merge the two sorted array to make a sorted array.");
        System.out.println("A: "+A);
        System.out.println("B: "+B);
        ArrayList<Integer> ans = new ArrayList();

        int n = A.size();
        int m = B.size();

        int p1=0;
        int p2=0;

        while (p1<n && p2<m){
            if(A.get(p1)<B.get(p2)){
                ans.add(A.get(p1));
                p1++;
            }else {
                ans.add(B.get(p2));
                p2++;
            }
        }

        while (p1<n){
            ans.add(A.get(p1));
            p1++;
        }
        while (p2<m){
            ans.add(B.get(p2));
            p2++;
        }

        return ans;
    }
}

import java.util.ArrayList;

public class BubbleSort {

    private ArrayList<Integer> input = new ArrayList<>();

    public BubbleSort() {
    }

    public BubbleSort(ArrayList<Integer> input) {
        this.input = input;
    }

    public void setInput(ArrayList<Integer> input) {
        this.input = input;
    }

    public ArrayList<Integer> sort(){
        long startTime = System.nanoTime();
        int N = input.size();
        for(int i=0; i<N-1; i++){
            boolean isSwapped = false;
            for(int j=0; j<N-i-1; j++) {
                if (input.get(j) > input.get(j + 1)) {
                    Util.swap(input, j, j + 1);
                    isSwapped = true;
                }
            }

            if(!isSwapped)
                break;
        }
        long endTime = System.nanoTime();
        System.out.println("Bubble Sort: Elapsed Time in milli seconds: "+ (double)(endTime-startTime)/1000000);
        return input;
    }
}

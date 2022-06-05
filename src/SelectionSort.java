import java.util.ArrayList;

public class SelectionSort {

    private ArrayList<Integer> input = new ArrayList<>();

    public SelectionSort(){

    }

    public SelectionSort(ArrayList<Integer> input) {
        this.input = input;
    }

    public void setInput(ArrayList<Integer> input) {
        this.input = input;
    }

    public ArrayList<Integer> sort(){
        long startTime = System.nanoTime();
        int N = input.size();
        for(int i=0; i<N; i++){
            Integer min = input.get(i);
            int index = i;
            for(int j=i+1; j<N; j++ ){
                if(min>input.get(j)){
                    min = input.get(j);
                    index = j;
                }
            }

            if(index!=i){
                Util.swap(input, i, index);
            }
        }
        long endTime = System.nanoTime();
        System.out.println("Selection Sort: Elapsed Time in nano seconds: "+ (endTime-startTime));
        return input;
    }



}

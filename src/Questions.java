import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Questions {

    /**
     * Sort the numbers in ascending order according to their factors.
     * @param A
     * @return
     */
    public static ArrayList<Integer> question1(ArrayList<Integer> A){

        Collections.sort(A, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int factor1 = getNoOfFactor(o1);
                int factor2 = getNoOfFactor(o2);
                return (factor1-factor2);
            }
        });
        return A;
    }

    private static Integer getNoOfFactor(int value){
        int count=0;
        for(int i=1; i< Math.sqrt(value); i++){

            if(value%i==0){
                count++;

                if(i!=value/i){
                    count++;
                }
            }
        }
        return count;
    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

      ArrayList<Integer> input = hardInput();

        ArrayList<Integer> ans =  new SelectionSort(input).sort();
        System.out.println("Selection Sort Output: " + ans);

        ArrayList<Integer> ans2 =  new BubbleSort(input).sort();
        System.out.println("Bubble Sort Output: " + ans2);

        ArrayList<Integer> ans3 =  new MergeSort(input).sort();
        System.out.println("Merge Sort Output:  " + ans3);

    }


    public static ArrayList<Integer> input() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> A = new ArrayList();
        System.out.println("Enter no of elements: ");
        int N = sc.nextInt();
        System.out.println("Enter elements: ");
        for (int i = 0; i < N; i++) {
            int value = sc.nextInt();
            A.add(value);
        }
        return A;
    }

    public static ArrayList<Integer> inputInString(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> A = new ArrayList();
        String input = sc.next();
        String [] strInput = input.split(", ");
        for(String str: strInput){
            try {
                A.add(Integer.valueOf(str));
            }catch (Exception e) {
                e.printStackTrace();
            }
        }

        return A;
    }

    public static synchronized ArrayList<Integer> hardInput(){
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> A = new ArrayList();
        System.out.println("Enter no of elements: ");
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            A.add(rd.nextInt(1000)) ;
        }
        Collections.sort(A);
        Collections.reverse(A);
        System.out.println("Input Array: "+A);
        System.out.println("\n\n");
        return A;
    }

}

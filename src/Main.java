import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


//        ArrayList<Integer> ans =  new SelectionSort(hardInput()).sort();
//        System.out.println("Selection Sort Output: " + ans);
//
//        ArrayList<Integer> ans2 =  new BubbleSort(hardInput()).sort();
//        System.out.println("Bubble Sort Output: " + ans2);
//
//        ArrayList<Integer> ans3 =  new MergeSort(hardInput()).sort();
//        System.out.println("Merge Sort Output:  " + ans3);
//
//        ArrayList<Integer> ans4 =  new MergeSort().question1(hardInputSorted(), hardInputSorted());
//        System.out.println("Question1 :  " + ans4);

        System.out.println("Question2 :  " + Questions.question1(inputInString()));

    }


    //Generate array with manual inputs from user
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

    //Generate array from string of integers separated by ", " from user
    public static ArrayList<Integer> inputInString(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> A = new ArrayList();
        String input = sc.next();
        String [] strInput = input.split(",");
        for(String str: strInput){
            try {
                A.add(Integer.valueOf(str.trim()));
            }catch (Exception e) {
                e.printStackTrace();
            }
        }

        return A;
    }

    //Generate random array in descending order to achieve worst case time complexity
    public static  ArrayList<Integer> hardInput(){
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> A = new ArrayList();
        System.out.println("\n");
        System.out.println("Enter no of elements: ");
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            A.add(rd.nextInt(1000)) ;
        }
        Collections.sort(A);
        Collections.reverse(A);
        System.out.println("Input Array: "+A);
        System.out.println("\n");
        return A;
    }

    // Generate random array in sorted order
    public static  ArrayList<Integer> hardInputSorted(){
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> A = new ArrayList();
        System.out.println("Enter no of elements: ");
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            A.add(rd.nextInt(1000)) ;
        }
        Collections.sort(A);
        System.out.println("Input Array: "+A);
        return A;
    }

}

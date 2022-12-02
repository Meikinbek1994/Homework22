import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer>numbers=new ArrayList<>();
        Collections.addAll(numbers,3,5,6,8,9,11,12,14,15,17,19,21,20,2,10,24,26,27,23,29,31,35,34,37,38,40,41,42,44,47,50,53,55,54,59,57,61,68,66,70,76,73,82,88,91,84,94,98,96,78);
        getOddEvenNumbers(numbers);







    }

    public static void getOddEvenNumbers(ArrayList<Integer>numbers){
        ArrayList<Integer>evenNumbers=new ArrayList<>();
        ArrayList<Integer>oddNumbers=new ArrayList<>();
        for (Integer integer:numbers
             ) {
            if(integer%2==0){
                evenNumbers.add(integer);
            }else {
                oddNumbers.add(integer);
            }
        }
        //evenNumbers.forEach(System.out::println);
        //oddNumbers.forEach(System.out::println);
        System.out.println("Even numbers: "+evenNumbers);
        System.out.println("Odd numbers: "+oddNumbers);
    }




}
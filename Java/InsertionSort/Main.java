
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] arr = getInput();
        Algorithm algorithm = new Algorithm();
        printArray(algorithm.insertionSort(arr));
    }

    public static int[] getInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPlease enter the numbers you would like to make into an array: (In this format: 5,2,1,4,...)");
        String input = scanner.nextLine();
        String[] splitInput = input.split(",");
        int[] numbers = new int[splitInput.length];
        for (int i=0; i<splitInput.length; i++){
            numbers[i] = Integer.parseInt(splitInput[i]);
        }
        System.out.print("\nYour array: ");
        printArray(numbers);
        return numbers;
    }

    public static void printArray(int[] arr){
        System.out.print("[");
        for (int i = 0; i<arr.length-1; i++){
            System.out.print(arr[i] + ", ");
        }
        System.out.println(arr[arr.length-1] + "]");
    }
}

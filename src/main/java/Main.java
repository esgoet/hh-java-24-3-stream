import java.util.ArrayList;
import java.util.List;

public class Main {
    public static  void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1,4,5,6,8,9,7,10,3,23));

        // Step 1: Filter a list of numbers to only output the even numbers
        System.out.println("Even Numbers:");
        numbers.stream().filter(number -> number % 2 == 0).forEach(System.out::println);

        // Step 2 + 6: use map to double each number and collect it into a new list
        List<Integer> doubledNumbers = numbers.stream()
                .map(number-> number * 2)
                .toList();

        // Step 3 + 6: sort the list in ascending order and collect it into a new list
        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .toList();


        // Step 4: use reduce() to calculate the sum of all numbers
        int sum = numbers.stream().reduce(0, Integer::sum);
        int doubledSum = doubledNumbers.stream().reduce(0, Integer::sum);

        // Step 5: use forEach() to output each processed Numbers
        System.out.println("Doubled Numbers:");
        doubledNumbers.stream().forEach(System.out::println);
        System.out.println("Sorted Numbers:");
        sortedNumbers.stream().forEach(System.out::println);

        System.out.println("Sum of Numbers: " + sum);
        System.out.println("Sum of doubled Numbers: " + doubledSum);


    }
}

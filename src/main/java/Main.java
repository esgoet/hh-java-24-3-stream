import java.util.ArrayList;
import java.util.List;

public class Main {
    public static  void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1,4,5,6,8,9,7,10,3,23));

        numbers.stream().filter(number -> number % 2 == 0).forEach(System.out::println);

        List<Integer> doubledNumbers = numbers.stream()
                .map(number-> number * 2)
                .sorted()
                .peek(System.out::println)
                .toList();

        int sum = doubledNumbers.stream().reduce(0, Integer::sum);
        System.out.println(sum);


    }
}

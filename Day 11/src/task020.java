import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class task020 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        Optional<Integer> sum = numbers.stream().reduce((x, y) -> x + y);
        System.out.println("Sum of all elements: " + sum.orElse(0));


        Optional<Integer> max = numbers.stream().reduce(Integer::max);
        System.out.println("Maximum element: " + max.orElse(0));

        Optional<Integer> min = numbers.stream().reduce(Integer::min);
        System.out.println("Minimum element: " + min.orElse(0));


        List<String> strings = Arrays.asList("Hello", " ", "world", "!");
        Optional<String> concatenatedString = strings.stream().reduce((x, y) -> x + y);
        System.out.println("Concatenated string: " + concatenatedString.orElse(""));
    }
}


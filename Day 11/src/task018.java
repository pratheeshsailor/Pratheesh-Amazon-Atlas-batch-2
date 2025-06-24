import java.util.stream.Stream;

public class task018 {
    public static void main(String[] args) {

        // Generate numbers from 1 onwards, limit to 20 values
        Stream<Integer> nums = Stream
                .iterate(1, n -> n + 1)
                .limit(20);

        // From those 20, limit to first 10 and print
        nums
                .limit(10)
                .forEach(System.out::println);
    }
}

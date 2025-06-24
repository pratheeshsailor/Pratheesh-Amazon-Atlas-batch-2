import java.util.stream.Stream;

public class task019 {
    public static void main(String[] args) {

        // Generate numbers from 1 to 20
        Stream<Integer> nums = Stream
                .iterate(1, n -> n + 1)
                .limit(20);

        // Skip the first 15 numbers (print 16 to 20)
        Stream<Integer> skipNums = nums.skip(15);

        // Print using forEach
        skipNums.forEach(System.out::println);
    }
}

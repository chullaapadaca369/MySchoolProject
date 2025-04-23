import java.util.ArrayList;
import java.util.List;

public class SimpleClass {
    List<Integer> numbers = new ArrayList<>();

    public void addNumber(int number) {
        numbers.add(number);
    }

    public int getSum() {
        if (numbers.isEmpty()) return 0;
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
}

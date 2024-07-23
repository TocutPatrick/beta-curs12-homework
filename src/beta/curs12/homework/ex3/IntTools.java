package beta.curs12.homework.ex3;

import java.util.ArrayList;
import java.util.List;

public record IntTools(
        int number
) {
    public IntTools {

    }

    public List<Integer> numberList(int n) {
        List<Integer> list = new ArrayList<>();
        while (n > 0) {
            list.add(n % 10);
            n /= 10;
        }
        return list.reversed();
    }

    public int digitSum() {
        List<Integer> list = numberList(number);
        int sum = 0;
        for (Integer i : list) {
            sum += i;
        }
        return sum;
    }

    public int lastDigit() {
        List<Integer> list = numberList(number);
        return list.getLast();
    }

    public int digitAt(int position) throws NumberException {
        int digit = 0;
        List<Integer> list = numberList(number);
        if (position < 0 || position > list.size() - 1) {
            throw new NumberException("Error. Searched position do not exist");
        }
        digit = list.get(position);
        return digit;
    }

}

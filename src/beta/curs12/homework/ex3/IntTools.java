package beta.curs12.homework.ex3;

import java.util.ArrayList;
import java.util.List;

public class IntTools {
    private int number;
    private List<Integer> numberList;

    public IntTools (int number){
        this.number = number;
        this.numberList = new ArrayList<>();
        while (number > 0) {
            numberList.add(number % 10);
            number /= 10;
        }
    }



    public int digitSum() {
        List<Integer> list = numberList.reversed();
        int sum = 0;
        for (Integer i : list) {
            sum += i;
        }
        return sum;
    }

    public int lastDigit() {
        List<Integer> list = numberList.reversed();
        return list.getLast();
    }

    public int digitAt(int position) throws NumberException {
        int digit = 0;
        List<Integer> list = numberList.reversed();
        if (position < 0 || position > list.size() - 1) {
            throw new NumberException("Error. Searched position do not exist");
        }
        digit = list.get(position);
        return digit;
    }

}

package sessions.session6;

import java.util.Arrays;
import java.util.List;

public class NumberCruncher{
    public static <T extends Number> void crunchNumbers(List<T> list){
        for (T item : list){
            System.out.println(item.intValue());
        }
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,2,3,4,5);
        NumberCruncher.crunchNumbers(integers);
    }
}
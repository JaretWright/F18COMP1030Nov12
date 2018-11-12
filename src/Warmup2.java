import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Warmup2 {
    public static void main(String[] args)
    {
        int[] numbers = {8, 10, 23, 88,16,-2};

        System.out.println("The smallest number is: " + min(numbers));
        System.out.println("The largest number is: " + max(numbers));
    }

    public static int min(int[] array)
    {
        //assume array has at least 1 element
        int lowest = array[0];

        for (int i=1; i<array.length; i++)
        {
            if (array[i] < lowest)
                lowest = array[i];
        }

        return lowest;
    }

    public static int max(int[] array)
    {
        int max = array[0];

        for (int num:array)
        {
            if (num > max)
                max =  num;
        }
        return max;
    }
}

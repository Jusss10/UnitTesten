package ex01_arrays;

import java.util.Arrays;

public class ArrayOfInts {
    public int sumOfInts(int[] arrayOfInts) {
        if (arrayOfInts == null) return 0;
        int sum = 0;
        for (int i : arrayOfInts)
            sum += i;
        return sum;
    }

    //Nieuwe test aanmaken
    //cntrl + shift + t

    public int sumOf3SmallestInts(int[] arrayOfInts) {
        if (arrayOfInts == null) return 0;
        int[] copy = Arrays.copyOf(arrayOfInts, arrayOfInts.length);
        Arrays.sort(copy);
        return sumOfInts(Arrays.copyOf(copy, 3));
    }

    public int sumOfEven(int[] arrayOfInts) {
        if (arrayOfInts == null) return 0;
        int[] even = new int[arrayOfInts.length];
        int evenLength = 0;
        for (int i : arrayOfInts)
            if (i % 2 == 0) even[evenLength++] = i;
        return sumOfInts(even);
    }

    public int sumOfXLargest(int[] arrayOfInts, int x) {
        if(arrayOfInts == null || arrayOfInts.length == 0) return 0;
        if(x <= 0) return 0;

        int[] copy = Arrays.copyOf(arrayOfInts, arrayOfInts.length);
        Arrays.sort(copy);

        if (arrayOfInts.length < x)
            return sumOfInts(copy);
        else
            return sumOfInts(Arrays.copyOfRange(copy, copy.length -x, copy.length));

    }
    public int countMostPopularNumber(int[] arrayOfInts) {
        if (arrayOfInts == null || arrayOfInts.length == 0) return 0;
        {

            int[] copy = Arrays.copyOf(arrayOfInts, arrayOfInts.length);
            Arrays.sort(copy);

            int maxcount = 0;
            int element_having_max_freq = 0;
            for (int i = 0; i < copy.length; i++) {
                int count = 0;
                for (int j = 0; j < copy.length; j++) {
                    if (arrayOfInts[i] == arrayOfInts[j]) {
                        count++;
                    }
                }
                if (count > maxcount) {
                    maxcount = count;
                    element_having_max_freq = arrayOfInts[i];
                }
            }
            //kijk online op github voor de rest
            return maxcount;
        }

    }

    public static void main(String[] args) {
        ArrayOfInts ex1 = new ArrayOfInts();
        int result = ex1.sumOfInts(new int[]{1, 2, 3, 4});
        System.out.println(result);
    }


}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FilterTester {
    public static void main(String[] args) {
        String[] strings = {"Different", "Ways", "Of", "Filtering"};
        int[] nums = {-1, -2, -3, -4, 0, 1, 2, 3, 4, 5, 6, 7};



        String[] filteredStrings = FilterMethods.filter(strings, x -> ((String) (x)).length() >= 9);
        int[] positiveNumbers = FilterMethods.filter(nums, x -> ((Integer) (x)) >= 0);


        System.out.print("Filtered Strings:");
        System.out.println(Arrays.toString(filteredStrings));

        System.out.println();

        System.out.print("Filtered Numbers:");
        System.out.println(Arrays.toString(positiveNumbers));
    }
}

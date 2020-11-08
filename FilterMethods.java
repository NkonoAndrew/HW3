public class FilterMethods  {
    /*
    Filters a string array
    @param a String array
    @param f
     */

    public static String[] filter(String[] a, Filter<String> f){
        int size = 0;
        for (int i = 0; i < a.length ; i++) {
            if (f.accept(a[i])) {
                size++;
            }
        }

        //new array with accepted values
        String[] newStrings = new String[size];

        int add = 0;
        for (int i = 0; i <a.length ; i++) {
            if (f.accept(a[i])) {
                newStrings[add++] = a[i];
            }
        }

        return newStrings;
    }



    public static int[] filter(int[] a, Filter<Integer> f){
        int size = 0;
        for (int i = 0; i < a.length ; i++) {
            if (f.accept(a[i])) {
                size++;
            }
        }

        //new array with accepted values
        int[] newStrings = new int[size];

        int add = 0;
        for (int i = 0; i <a.length ; i++) {
            if (f.accept(a[i])) {
                newStrings[add++] = a[i];
            }
        }

        return newStrings;

    }
}

package exercises;

public class zadanie4array {

    public static void main(String[] args) {
        int[] testArray = {12,32,4,56,345,3234,434};

        showArray(testArray);
    }

    private static void showArray(int[] array){

        for (int i = 0; i < array.length; i++){

            int x = array [i];

            System.out.println(x);
        }

    }

}

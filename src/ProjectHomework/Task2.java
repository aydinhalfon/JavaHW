package ProjectHomework;

public class Task2 {
    public static void main(String[] args) {

        /* Create an array of integer values. After the array is
created, calculate the sum of all stored elements in
that array. */
        int sum=0;
        int [] array = {5,8,7,9,15,65};
        for (int i = 0; i < array.length; i++) {
            sum=sum+array[i];

        }
        System.out.println(sum);

    }
}

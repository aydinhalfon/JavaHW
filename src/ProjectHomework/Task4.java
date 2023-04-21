

public class Task4 {
    public static void main(String[] args) {
        //Create a 2D array of integers. Develop a program which will calculate
        // the sum of even and odd numbers for that array.
        int[][] sum = {
                {1, 2, 3, 4, 5, 6},
                {7, 8, 9, 10, 11, 12, 13, 14},
                {15, 16, 17, 18, 19, 20}
        };

        int sumeven = 0;
        int sumodd = 0;
        for (int a = 0; a < sum.length; a++) {
            for (int b = 0; b < sum[a].length; b++) {
                if (sum[a][b] % 2 == 0) {
                    sumeven = sumeven+sum[a][b];
                } else if (sum[a][b] % 2 == 1) {
                    sumodd = sumodd + sum[a][b];


                }

            }

        }
        System.out.print(sumeven+" ");
        System.out.println(sumodd+" ");
    }


}

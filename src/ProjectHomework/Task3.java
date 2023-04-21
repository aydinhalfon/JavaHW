package ProjectHomework;

public class Task3 {
    public static void main(String[] args) {
        int[][] OddEven = {
                {1, 2, 3, 4, 5, 6},
                {7, 8, 9, 10, 11, 12, 13, 14},
                {15, 16, 17, 18, 19, 20}
        };
        for (int i = 0; i < OddEven.length; i++) {
            for (int j = 0; j < OddEven[i].length; j++) {
                if (OddEven[i][j] % 2 == 0) {
                    System.out.print(OddEven[i][j]+" ");
                }

            }
            System.out.println();

        }
    }
}

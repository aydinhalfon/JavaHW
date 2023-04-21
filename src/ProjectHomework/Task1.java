package ProjectHomework;

public class Task1 {
    public static void main(String[] args) {


        /* Create a program that uses an array to store a list of
temperatures for a week, and then uses a loop to find
the highest and lowest temperature for the week. */

            int [] temperature = new int[7];
            temperature[0]=25;
            temperature[1]=26;
            temperature[2]=27;
            temperature[3]=25;
            temperature[4]=29;
            temperature[5]=21;
            temperature[6]=20;

            int high = temperature[0];
            int low = temperature[0];

            for (int i = 0; i < temperature.length; i++) {
                if(temperature[i] > high )
                {
                    high = temperature[i];
                } else if (temperature[i]<low) {
                    low=temperature[i];

                }


            }

            System.out.println("High temperature is"+" "+high);
            System.out.println("Low temperature is"+" "+low);



    }
}

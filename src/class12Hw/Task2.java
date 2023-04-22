package class12Hw;

public class Task2 {
    public static void main(String[] args) {
        //Create a String and print it in reverse order (Sunday → yadnuS).

        String name="Nesrin";
        for (int i = name.length()-1; i >=0 ; i--) {
            System.out.print(name.charAt(i)+" ");

        }
    }
}

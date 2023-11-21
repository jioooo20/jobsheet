package daspro_jobsheet13;

public class perc5pert3 {

    static void displayData(String[] strings, int[] numbers) {
        System.out.println("String Array:");
        for (String str : strings) {
            System.out.print(str + " ");
        }
        System.out.println("\n\nInteger Array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String[] strings = { "Hello", "World", "Java", "Programming" };
        int[] numbers = { 1, 2, 3, 4, 5 };

        displayData(strings, numbers);
    }
}

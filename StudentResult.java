public class StudentResult {
    public static void main(String[] args) {

        String name = "Rashi";

        int English = 72;
        int Java = 78;
        int Computer = 68;

        int total = English + Java + Computer;
        double percentage = total / 3.0;

        System.out.println("----- Student Result -----");
        System.out.println("Name: " + name);
        System.out.println("English: " + English);
        System.out.println("Java: " + Java);
        System.out.println("Computer: " + Computer);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
    }
}

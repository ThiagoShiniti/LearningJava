import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (int i = 1; i < 7; i++) {
            String[] pokemon = new String[7];
            System.out.println("Enter Pokemon " + i + " :");
            pokemon[i] = scan.nextLine();
            }

        System.out.println("Your team is complete!");
        
        scan.close();
    }
}
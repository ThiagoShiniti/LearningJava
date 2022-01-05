import java.util.ArrayList;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    ArrayList pokemonList = new ArrayList();
    
    System.out.println("\n | Welcome to the TeamBuilder, to make your Pokemon team type the Pokemon's name and hit Enter.| \n");
    int i = 1;
    for (i=1; i<7; i++){
    System.out.println("<Add a Pokemon to your team:>");
    String pokemon = scan.nextLine();
    pokemonList.add(pokemon);
    System.out.printf("You added <%s> to your team! %n%n", pokemon);
        }

    System.out.println("You completed your team!\n" + pokemonList);   

    scan.close();

  }
}
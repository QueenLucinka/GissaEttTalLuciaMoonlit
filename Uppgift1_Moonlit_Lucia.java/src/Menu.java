import java.util.Scanner;

public class Menu {

    public void menu(){
        Scanner scanner = new Scanner(System.in); //om stänger då det funkar inte
        
        Game game = new Game();
        System.out.println("Vad vill du göra nu? Välj ett alternativ: ");
        System.out.println("Tryck 1 = spela. ");
        System.out.println("Tryck 2 = avsluta spel. ");
        int dittVal = scanner.nextInt();
        System.out.println();
        
        switch(dittVal){

            case 1: 
            System.out.println("Din spel börjar nu: ");
            System.out.println();
            game.game();
            break;

            case 2:
            System.out.print("Hej då!");
            System.exit(0);
            break;

            default:
            System.out.println("Ogiltig förösk. Tryck endast 1 eller 2.");

        }
    }
    
}

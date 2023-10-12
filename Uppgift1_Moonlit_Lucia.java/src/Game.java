import java.util.Scanner;
import java.util.Random;

public class Game {

    public int antalGissning;
    public int finalGissning;// variabel ligger här så jag kan använda det i anndra klass

    public void game() {
    
    Menu m1 = new Menu(); // kallar fram menu klass

    Scanner scanner = new Scanner(System.in); // kan inte stänga, annars error
    Random random = new Random();

    //array med nummer från 1 till 100
    int[] array= new int[100];
    for (int i = 0; i < 100; i++) {
        array[i] = i + 1;
    }

    /* 
    test att det funkar, index 0 visar nummer 1, index 99 visar 100
    System.out.println(array[0]);
    System.out.println();
    System.out.println(array[99]);
    */

    antalGissning = 1; // börjar räkna gissningar från nummer 1
    System.out.println("Gissa ett tal mellan 1 och  100:  " );
    System.out.println("Gissning nr. " + antalGissning);
    int gissning = scanner.nextInt();
    antalGissning++;
    int randomindex = random.nextInt(100)+1;//random väljer slump index från array
    int siffra =array[randomindex]; // siffra är på slumpad index av arrayen
    
    for(int i = 0; i < array.length; i++){
        randomindex = random.nextInt();
        // slumpar nummer
    }

    // här gör jag do while pga vi vet inte hur många ggr användare ska gissa, eventullet när hittar rätt nr

    do{
        
        if(gissning < siffra){
            System.out.println("Talet är större! ");
            System.out.println("Gissning nr. " + antalGissning++ );
            gissning = scanner.nextInt();
            }
        else if (gissning > siffra){
            System.out.println("Talet är mindre! ");
            System.out.println("Gissning nr." + antalGissning++);
            gissning = scanner.nextInt();
            }
        else if(gissning == siffra){
            finalGissning = (antalGissning-1);
            System.out.println("Du gissade rätt på " + finalGissning + " försök");
            System.out.println();
            m1.menu();
            break;

            }
          
        }while(true);

    }
}
 
 

 
    
    
    






    


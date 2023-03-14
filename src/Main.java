//Termer för övningen:
//    Array - En samling av värden som har samma datatyp
//    Sortering - Att ordna en samling av värden i en viss ordning.
//    java.util.Arrays.sort(names) - En inbyggd funktion i Java som sorterar en array.

/*Exempel på Array.Sort()
 int[] array = { 5, 2, 7, 1, 9, 3, 8, 4, 6, 10 };
*/
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = {90, 23, 5, 109, 12, 22, 67, 34, 35, 97};     //Fixa en array
        System.out.print("Den osorterade arrayen: ");  //Printa ut osorterad array, en rad skapas här
        printArray(array);              //Skapar värde för att skicka ned till en annan metod (printArray)

        Arrays.sort(array);             //Sortera Arrayen

        System.out.print("Den sorterade arrayen: ");   //Printa ut den sorterade arrayen, en till rad skapas här
        printArray(array);              //Samma här skickar ned värdet till metoden
    }

    public static void printArray(int[] array) {  //metod för att sortera arrayen mer specifikt
        for (int i = 0; i < array.length; i++) {  //loop för att sortera den ifrån 0(i = 0), beräkna hela arrayens längd(length), sortera den uppåt(i++)
            System.out.print(array[i] + ", ");    //print-loop för att printa ut hela arrayen, med text eller , emellan
        }
        System.out.println(); //Skapar en till rad(ln) utanför loop{}, för att inte värden osorterad + sorterad skall hamna på samma rad
    }
}

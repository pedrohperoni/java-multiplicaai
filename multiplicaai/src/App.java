import java.util.Scanner;

public class App {

private static String title = "Tabuada do %d";
private static String table = "%d * %d = %d";
    public static void main(String[] args) throws Exception {

         System.out.println("Insira um número: ");
         Scanner in = new Scanner(System.in);
         int number = Integer.parseInt(in.nextLine());

         System.out.println(String.format(title, number));

         for(int i = 0; i<= 10; i++){
            System.out.println(String.format(table, number, i, number*i));
         }
    }
}

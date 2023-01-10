import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
         System.out.println("Insira um número: ");
         Scanner in = new Scanner(System.in);
         int number = Integer.parseInt(in.nextLine());

         String title = "Tabuada do %d";
         String table = "%d * %d = %d";
         System.out.println(String.format(title, number));

         for(int i = 0; i<= 10; i++){
            System.out.println(String.format(table, number, i, number*i));
         }
    }
}

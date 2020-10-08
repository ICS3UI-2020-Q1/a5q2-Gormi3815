import java.util.Scanner;
/** this program will count to the positive integer provided by the user
 *
 * @author Isaac
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a positive integer.");
    int num = input.nextInt();
    for (int count = 1; count < num + 1; count++){
      System.out.print(count);

  }
}
}

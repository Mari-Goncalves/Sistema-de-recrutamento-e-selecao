import java.util.Scanner;
public class Main {

  public static final Scanner leitor = new Scanner(System.in);
  public void main(String[] args) {
        
    
    Menu menu = new Menu();
    menu.displayMainMenu();
  }
  public static Scanner getLeitor(){
    return leitor;
    
  }
  
}

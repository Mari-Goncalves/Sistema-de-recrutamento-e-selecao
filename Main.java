import java.util.Scanner;
public class Main {

  public static final Scanner leitor = new Scanner(System.in);
  public void main(String[] args) {
        
    Vaga rh = new Vaga();
    Menu menu = new Menu(rh);
    menu.displayMainMenu();
  }
  public static Scanner getLeitor(){
    return leitor;
    
  }
  
}

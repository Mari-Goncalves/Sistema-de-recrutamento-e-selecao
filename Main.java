import java.util.Scanner;
public class Main {

  public static final Scanner leitor = new Scanner(System.in); //criado main scanner na main branch, lê todas as classes desde que o mesmo seja chamado usando o getLeito(); metodo.
  public void main(String[] args) {
        
    Vaga rh = new Vaga();
    Menu menu = new Menu(rh);
      
    Mainmenu.displayMenu();
  }
  public static Scanner getLeitor(){
    return leitor;
    
  }
  
}

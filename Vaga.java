import java.util.ArrayList;
import java.util.Scanner;
public class Vaga{




    private ArrayList<DescricaoVaga> Vaga = new ArrayList<DescricaoVaga>();


    public Vaga(){
      Vaga = new ArrayList<DescricaoVaga>();
    }
  
      public void addVaga(DescricaoVaga vaga){
        Vaga.add(vaga);
    }

      public void RemoveVaga(DescricaoVaga vaga){
        Vaga.remove(vaga);
      }

      public int getDisplayVagas(){
        return displayVagas();
      }

  
  public int displayVagas(){
    Scanner leitor = Main.getLeitor();
    int choice = leitor.nextInt();
    System.out.println("1 - Ver todas as vagas\n2 - Procurar Vagas\n__");
    switch(choice){
      case 1:    
    System.out.println("Vagas disponiveis: " + Vaga.size());
    for (DescricaoVaga vaga : Vaga){
      System.out.println("\n(" + vaga.getId() + ")  " + vaga.getTitulo() + "\nRemuneração: " + vaga.getSalario() + "     Modalidade:  " + vaga.getModalidade() + "\n");
    }
      System.out.println("ID: ");
        int show = leitor.nextInt();
        for (DescricaoVaga vaga : Vaga){
          
          if(vaga.getId() == show){
            System.out.println(vaga.getId() + " - " + vaga.getTitulo() + "\n$ " + vaga.getSalario() + "    🏃‍♂️ "  + vaga.getModalidade() + "   ⏱︎ " + vaga.getCargaHoraria() + "\n☝ " + vaga.getRequisito() + "    👥 " + vaga.getTipoContratacao() + "\n" + vaga.getDescricao() + "\n");
            System.out.println("\nCandidatar-se? \n1 - Sim\n2 - Nao");
            choice = leitor.nextInt();
            if(choice == 1){
                
              //metodo para enviar curriculo
                
            }else{
              return displayVagas();
            }

          }else{
            System.out.println("Nenhuma vaga encontrada.");
            return Search();
          }
        
          
        case 2:
          Search();
  }
    

  public int Search(){
    Scanner leitor = Main.getLeitor();
    int choice = leitor.nextInt();
    System.out.print("Procurar por vaga por...\n1 - Titulo\n2 - Salario\n3 - Modalidade\n__");
    switch(choice){
      case 1:
      String porNome = leitor.nextLine();
      System.out.println("Titulo: ");
      for (DescricaoVaga vaga : Vaga){
        if(vaga.getTitulo().equals(porNome)){
          System.out.println("\n(" + vaga.getId() + ")  " + vaga.getTitulo() + "\nRemuneração: " + vaga.getSalario() + "     Modalidade:  " + vaga.getModalidade() + "\n");
          System.out.println("\nCandidatar-se? \n1 - Sim\n2 - Nao");
          choice = leitor.nextInt();
          if(choice == 1){
              
            //metodo para enviar curriculo
              
          }else{
            return displayVagas();
          }
        
        }else{
          System.out.println("Não foi encontrado nenhuma vaga com esse titulo");
          return Search();
        }
      }
      case 2:
      String valor = leitor.nextLine();
      System.out.println("Remuneração desejada: ");
        for (DescricaoVaga vaga : Vaga){
          if(vaga.getSalario().equals(valor)){
            System.out.println("\n(" + vaga.getId() + ")  " + vaga.getTitulo() + "\nRemuneração: " + vaga.getSalario() + "     Modalidade:  " + vaga.getModalidade() + "\n");
            System.out.println("\nCandidatar-se? \n1 - Sim\n2 - Nao");
            choice = leitor.nextInt();
            if(choice == 1){
                
              //metodo para enviar curriculo
                
            }else{
              return displayVagas();
            }
 
          }else{
            System.out.println("Não foi encontrado nenhuma vaga com esse titulo");
            return Search();
          }
          case 3:
          String mod = leitor.nextLine();
          System.out.println("Modalidade: ");
          for (DescricaoVaga vaga : Vaga){
            if(vaga.getSalario().equals(mod)){
              System.out.println("\n(" + vaga.getId() + ")  " + vaga.getTitulo() + "\nRemuneração: " + vaga.getSalario() + "     Modalidade:  " + vaga.getModalidade() + "\n");
              System.out.println("\nCandidatar-se? \n1 - Sim\n2 - Nao");
              choice = leitor.nextInt();
              if(choice == 1){
                  
                //metodo para enviar curriculo
                  
              }else{
                return displayVagas();
              }
            }else{
              System.out.println("Não foi encontrado nenhuma vaga com esse titulo");
              return Search();
            }
         
        }
  }    
    
    
}

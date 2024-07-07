mport java.lang.Math;
import java.util.Scanner;

public class Menu {
  private Vaga rh;
  Scanner leitor = Main.getLeitor();
  public Menu(Vaga rh){
    this.rh = rh;
    
  }
      
      public void displayMainMenu(){
        boolean sair = false;
        while(!sair){
        System.out.println("Bem vindo ao Vaga Feliz!/n1 - Cadastro candidato/n2 - Cadastro Recrutador        /n3 - Login\n4 - Sair");
         int choice = leitor.nextInt();
          switch(choice){
            case 1:
              //if candidato, vai para cadastro e upload de curriculo, pós volta para menu abaixo
              System.out.println("1 - Ir para entrevistas\n2 - Acompanhe Candidaturas\n3 - Procurar Vagas\n 4 - Sair");
              int input = leitor.nextInt();
              if(input == 1){
                //vai para entrevista, se não tem nenhuma, tela em branco, opção de voltar.
              }else if(input == 2){
                //vai para as candidaturas, se nao tem nenhuma, tela em branco, opção de voltar.
              }if(input == 3){
                 displayVagas();           
              }else{
                sair = true;
              }
            case 2:
              //if recrutador, vai para cadastro de empresa, e após vai para o menu abaixo
              System.out.println("1 - Gerenciamento de Vagas\n2 - Candidaturas\n3 - Entrevistamento\n 4 - Sair");

              input = leitor.nextInt();
              if(input == 1){
                    displayCDV();
              }else if(input == 2){
                //vai para candidaturas, se nao tem nenhuma, tela em branco, opção de voltar.
              }if(input == 3){
                //vai para entrevistamento, se não tem nenhuma, tela em branco, opção de voltar.
              }else{
                sair = true;
              }
              
            case 3:  
              //Login leva para um dos menus. 
            case 4:
              System.out.println("*close the app*");
              sair = true;        
          }
        }
        
        

      public DescricaoVaga displayCDV(){
        //CDV = criador de vaga

      Scanner leitor = Main.getLeitor();
      int id = (int)(Math.random() * 1000);
      System.out.println(id);
      String titulo = leitor.nextLine();
      System.out.println("Titulo: ");
      String salario = leitor.nextLine();
      System.out.println("\nSalario: ");
      String descricao = leitor.nextLine();
      System.out.println("\nDescricao: ");
      String requisito = leitor.nextLine();
      System.out.println("\nRequisitos: ");
      String cargaHoraria = leitor.nextLine();
      System.out.println("\nCarga Horaria: ");
      String tipoContratacao = leitor.nextLine();
      System.out.println("\nTipo de Contratacao: ");
      String modalidade = leitor.nextLine();
      System.out.println("\nModalidade: ");
      DescricaoVaga vaga = new DescricaoVaga(id, titulo, descricao, requisito, salario, cargaHoraria, tipoContratacao, modalidade);
      int choice = leitor.nextInt();
      System.out.println("Confirmar? \n1 - Sim\n2 - Nao");
          if(choice == 1){
          //salva vaga em arquivo txt
          rh.addVaga(vaga);
            return vaga;
      }else{
      System.out.println("Vaga excluída.");
        return vaga;
        
        
      }
    
      
    
    }
  }
  
  

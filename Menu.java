import java.lang.Math;
import java.util.Scanner;

public class Menu {
  private Vaga vg;
  private Notificacao ntf;
  private Empresa ugh;
  Scanner leitor = Main.getLeitor();
  boolean sair = false;
  
  //public Menu(Vaga rh){
    //this.rh = rh;

  //}
  
      
      public void displayMainMenu(){
        
        while(!sair){
        System.out.println("Bem vindo ao Vaga Feliz!/n1 - Cadastro candidato/n2 - Cadastro Recrutador/n3 - Login\n4 - Sair");
         int choice = leitor.nextInt();
          switch(choice){
            case 1:
              //candidato, vai para cadastro e upload de curriculo, pós volta para menu abaixo
              MenuCandidato();
            case 2:
              //if recrutador, vai para cadastro de empresa, e após vai para o menu abaixo
              MenuRecrutador();
            case 3: 
              //metodo do login
              //Login leva para um dos menus. 
            case 4:
              System.out.println("*close the app*");
              sair = true;        
          }
        }




      private void CadastramentoCandidato(){

        //metodo de login
        // id e senha percorrem ambas listas, se id e senha match com algum dos logins do sistema (array list), ele entra
        //se o login e senha estiverem na lista de candidatos, menu de candidato. E vice versa
        
      }

      private void CadastramentoRecrutador(){
        
        //metodo login acima
        
      }

      public void MenuCandidato(){

        System.out.println("1 - Ir para entrevistas\n2 - Acompanhe Candidaturas\n3 - Procurar Vagas\n4 - Notificações\n5 - Sair");
        int input = leitor.nextInt();
        switch(input){
          case 1:
            //vai para entrevista, se não tem nenhuma, tela em branco, opção de voltar.
          case 2:
          //vai para as candidaturas, se nao tem nenhuma, tela em branco, opção de voltar.
          case 3:
          vg.displayVagas();          
          case 4: 
          ntf.displayNotificacoes();
          case 5:
            System.out.println("Fechando aplicativo...");
            sair = true;
            
        }
        
      }

      private void MenuRecrutador(){

      System.out.println("1 - Gerenciamento de Vagas\n2 - Candidaturas\n3 - Entrevistamento\n4 - Notificações \n5 - Sair");
        int input = leitor.nextInt();
        switch(input){
          case 1:
            displayGerenciador(); //criar um menu/metodo para gerenciar a entrada e saida de vagas
            //gerenciamento de vagas vai para adicionar ou excluir vagas.
            break;
          case 2:
            System.out.println("a");
          //vai para as candidaturas, se nao tem nenhuma, tela em branco, opção de voltar.
            break;
          case 3:
          vg.displayVagas();
            break;
          case 4: 
          ntf.displayNotificacoes();
            break;
          case 5:
            System.out.println("Fechando aplicativo...");
            sair = true;
            break;
          default:
            System.out.println("Opção inválida. Tente novamente.\n");
            MenuRecrutador();

        }
        
      }
      public void displayGerenciador(){
        
        System.out.println("_GERENCIADOR DE VAGAS_\n1 - Adicionar Vaga\n2 - Excluir Vaga\n3 - Editar Vaga\n4 - Voltar");
        int choice = leitor.nextInt();
        switch(choice){
          case 1:
            vg.getDisplayCDV();
            break;
          case 2:
            vg.getDeletarVaga(); 
            break;
          case 3:
            vg.getEditarVaga();
            break;
          case 4:
            MenuRecrutador();
            
          default:
            System.out.println("Opção inválida");
             MenuRecrutador();
            
        }
                
    }

        
        public void getDisplayGerenciador(){
          displayGerenciador();       
        }
        public void getMenuRecrutador(){
          MenuRecrutador();       
        }
        

     
  }
  
  

  

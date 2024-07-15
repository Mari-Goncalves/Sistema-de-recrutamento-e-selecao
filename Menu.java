import java.util.Scanner;

public class Menu extends Main{
  private Vaga vg;
  private Notificacao ntf;
  private Empresa ugh;
  private Cadastro cad;
  private Login log;
  private Candidatura cand;
  Scanner leitor = Main.getLeitor();
  boolean sair = false;
  
      
      public void MainMenu(){
        
        while(!sair){
        System.out.println("Bem vindo ao Vaga Feliz!/n1 - Cadastro candidato/n2 - Cadastro Recrutador/n3 - Login\n4 - Sair");
         int choice = leitor.nextInt();
          switch(choice){
            case 1:
              cad.CadastroCND();
            case 2:
              cad.CadastroRH();
            case 3: 
              log.login();
              //Login leva para um dos menus. 
            case 4:
              System.out.println("*close the app*");
              sair = true;        
          }
        }

      }

        //visualizar perfil



      public void MenuCandidato(){

        System.out.println("1 - Ir para entrevistas\n2 - Acompanhe Candidaturas\n3 - Procurar Vagas\n4 - Notificações\n5 - Sair");
        int input = leitor.nextInt();
        switch(input){
          case 1:
            //vai para entrevista, se não tem nenhuma, tela em branco, opção de voltar.
          case 2:
          //vai para as candidaturas, se nao tem nenhuma, tela em branco, opção de voltar.
          case 3:
          vg.Vagas();          
          case 4: 
          ntf.NotificacoesCnd();
          case 5:
            System.out.println("Fechando aplicativo...");
            sair = true;
            
        }
        
      }

      public void MenuRecrutador(){

      System.out.println("1 - Gerenciamento de Vagas\n2 - Candidaturas\n3 - Entrevistamento\n4 - Notificações \n5 - Perfil da  Empresa\n6 - Sair\n__");
        int input = leitor.nextInt();
        switch(input){
          case 1:
            displayGerenciador(); //criar um menu/metodo para gerenciar a entrada e saida de vagas
            //gerenciamento de vagas vai para adicionar ou excluir vagas.
            break;
          case 2:
            cand.Candidaturas();
            break;
          case 3:
          vg.Vagas();
            break;
          case 4: 
          ntf.NotificacoesRh();
            break;
          case 5: 
            ugh.toString();
            //opção editar perfil
          case 6:
            System.out.println("Login off...");
            sair = true;
            break;
          default:
            System.out.println("Opção inválida. Tente novamente.\n");
            MenuRecrutador();
            break;

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
  
  

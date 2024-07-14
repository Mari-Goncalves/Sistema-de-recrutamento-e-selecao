import java.util.Scanner;

public class Entrevista {

    Scanner leitor = Main.getLeitor();
   
    private String horario;
    
    private String data;
    
    private Recrutador recrutador;

    public Entrevista(){


    }

    
    public static void agendar() {
        Scanner leitor = Main.getLeitor();


            while (true) {            

            System.out.print("##--Teste Estrutura de Menu--##\n\n");
            System.out.print("|----------------------------------|\n");
            System.out.print("| Opção 1 - Agendar entrevista     |\n");
            System.out.print("| Opção 2 - Sair                   |\n");
            System.out.print("|----------------------------------|\n");
            System.out.print("Digite uma opção: ");

            int opcao = leitor.nextInt();

            if (opcao == 2) {
                System.out.print("\nAté logo!");
                leitor.close(); 
            }

            switch (opcao) {
            case 1:
                System.out.print("\nOpção Novo Cadastro Selecionado");
                break;

            default:
                System.out.print("\nOpção Inválida!");
                break;
        }
       
        }
    }
 



    

}

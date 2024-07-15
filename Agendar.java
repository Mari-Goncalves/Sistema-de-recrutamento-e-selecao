import java.util.Scanner;
public class Agendar {

    Scanner leitor = new Scanner(System.in);

    private String horario;

    private String data;

    public Agendar(){
        this.horario = horario;
        this.data = data;
    }

    public void agendar() {

            while (true) {

            System.out.print("|----------------------------------|\n");
            System.out.print("| Opção 1 - Agendar entrevista     |\n");
            System.out.print("| Opção 2 - Cancelar               |\n");
            System.out.print("|----------------------------------|\n");
            System.out.print("Digite uma opção: ");

                int opcao = leitor.nextInt();

            if(opcao == 1){
                System.out.print("Digite a data: ");
                data = leitor.next();
                System.out.print("\nDigite o horario: ");
                horario = leitor.next();

                break;
            }else{
                System.out.print("\nAté mais");
                break;
            }
        }
    }

    public String getEntrevista(){

        System.out.println("data:"+ data +"\nhorario: "+ horario);
        return this.data + " " + this.horario;

    }

 
}

import java.util.Scanner;

public class GchFunc {
    
    static Scanner scanner = new Scanner(System.in);

    public void menuFunc(){

        int op;

        do{
            System.out.println("\n -----------Gerenciar Coloboradores----------");
            System.out.println("1) Calcular salario.");
            System.out.println("2) Gerenciar tarefas.");
            System.out.println("3) Avaliar Desempenho.");
            System.out.println("4) Cadastrar novo coloborador.");
            System.out.println("0) Voltar.");
            System.out.println("Escolha uma opção: ");

            op = scanner.nextInt();
            switch (op) {
                case 1:
                    calSalario();
                    break;

                case 2:
                    gerenciaTarefa();
                    break;
                
                case 3:
                    avaliarDesempenho();
                    break;
                
                case 4:
                    adicionarColoborador();
                    break;
                
                case 0:
                    System.out.println("\nVoltando...\n");
                    break;

                default:
                    System.out.println("\n Opção Inválida!\n");
                    break;
            }       
        } while (op != 0);
            
    }

    private void avaliarDesempenho() {
        System.out.println("Avalia");
    }

    private void gerenciaTarefa() {
        System.out.println("...");
    }

    private void calSalario() {
       System.out.println("...");
    }

    private void adicionarColoborador() {
        System.out.println("...");
    }
}



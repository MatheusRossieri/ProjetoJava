import java.util.Scanner;

public class Salario {

    private Scanner scanner = new Scanner(System.in);
    private Lider l = new Lider();
    private Subor s = new Subor();

    public void menu(){
        int op;
        do{
            System.out.println("\n------ Calcular Salário ------");
            System.out.println("");

            op = scanner.nextInt();
        } while(op != 0);
    }
}

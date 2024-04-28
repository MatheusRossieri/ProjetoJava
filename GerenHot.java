import java.util.Scanner;

public class GerenHot {

    static GchFunc f = new GchFunc();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int op;

        do{
            op = scanner.nextInt();
            switch (op) {
                case 1:
                    f.menuFunc();
                    break;
            
                default:
                    break;
            }
        } while (op != 0);
    }
}

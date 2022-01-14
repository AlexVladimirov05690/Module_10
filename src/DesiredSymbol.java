import java.util.Scanner;

public class DesiredSymbol {
    private char symbol;

    public char find(){
        System.out.println("Введите искомый символ");
        Scanner scanner = new Scanner(System.in);
        return scanner.next().charAt(0);
    }
}


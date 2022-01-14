public class Main {
    public static void main(String[] args) {
        WorkWithFiles originalFile = new WorkWithFiles("src", "OriginalText.txt");
        WorkWithFiles outFile = new WorkWithFiles("src\\Files", "OutFile.txt");
        outFile.createFile();
        DesiredSymbol desiredSymbol =new DesiredSymbol();
        SoughtChar soughtChar = new SoughtChar("src\\OriginalText.txt", desiredSymbol.find(), "src\\Files\\OutFile.txt");
        soughtChar.counter();
    }
}

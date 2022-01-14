import java.io.*;

public class SoughtChar {
    private char soughtChar;
    private String source;
    private String outFile;
    private int number = 0;

    public SoughtChar(String source, char soughtChar, String outFile) {
        this.source = source;
        this.soughtChar = soughtChar;
        this.outFile = outFile;
    }

    public void counter() {
        try (Reader fis = new InputStreamReader(new FileInputStream(source));
             Writer fos = new OutputStreamWriter(new FileOutputStream(outFile))){
            int i;
            while ((i = fis.read()) != -1) {
                if ((char) i == soughtChar) number++;
            }
            fos.write(("Символ " + "'" + soughtChar + "'" + " - встречается " + number + " раз(а)"));
            System.out.println("Символ " + "'" + soughtChar + "'" + " - встречается " + number + " раз(а)");
        } catch (FileNotFoundException ex) {
            System.out.println("Файл " + source + " не найден");
        } catch (IOException ex) {
            System.out.println("Проблемы с чтением данных");
        }

    }
}

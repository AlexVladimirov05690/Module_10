import java.io.File;
import java.io.IOException;

public class WorkWithFiles {
    private String name;
    private String dir;

    public WorkWithFiles(String dir, String name) {
        this.dir = dir;
        this.name = name;
    }

    public void createFile() {
        File file = new File(dir, name);
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("Не удаётся создать файл - отсутствует директория");
            File file1 = new File(dir);
            if(file1.mkdir()) {
                System.out.println("Исклюние перехвачено - создана новая директория");
                try {
                    file.createNewFile();
                } catch (IOException ex) {
                    System.out.println("Не удаётся создать файл - отсутствует директория");
                }
            }
        }
        if(file.exists()) {
            System.out.println("Файл " + name + " создан");
        }
    }
    void deleteFile() {
        File file = new File(dir, name);
        if(file.exists()) {
            file.delete();
            System.out.println("Файл  " + name + "  удалён");
        } else System.out.println("Файл " + name + "  не найден");
    }
}



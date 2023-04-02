// 2 Создать файл file.txt. Если файл уже создан, ничего делать не надо.
// Записать в файл слово TEXT 100 раз: TEXTTEXTTEXTTEXTTEXTTEXT...
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
public class task2 {
    public static void main(String[] args) {
        Path path = Path.of("file.txt");
        try {
            Files.createFile(path);
        } catch (IOException e) {
        }

        StringBuilder str = new StringBuilder("TEXT".repeat(100));
        System.out.print(str);

        try {
            Files.writeString(path, str);
        } catch (IOException e) {
        }
    }
}


import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Persister {
    public static void s(UserList list) throws IOException {
        Path path = Path.of("users.txt");
        try (BufferedWriter bw = Files.newBufferedWriter(path, StandardCharsets.UTF_8)) {
            for (User u : list.getAll()) {
                String address = u.getAddress() == null ? "" : u.getAddress();
                bw.write(u.getName() + ";" + u.getId() + ";" + address);
                bw.newLine(); // <-- korrekt linjeskift
            }
        }
    }
}



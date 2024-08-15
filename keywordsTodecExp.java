import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            readFromFile("nonExistingFile.txt");
        } catch (IOException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }

    public static void readFromFile(String fileName) throws IOException {
        if (!fileName.equals("existingFile.txt")) {
            throw new IOException("File not found: " + fileName);
        }
        System.out.println("File found: " + fileName);
    }
}
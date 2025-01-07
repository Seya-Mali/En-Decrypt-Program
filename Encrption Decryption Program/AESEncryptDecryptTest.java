import java.io.File;

public class AESEncryptDecryptTest {

    public static void main(String[] args) {

        // Define your secret key and salt (keep these secure and don't hardcode in production)
        String secretKey = "MySecretKey";
        String salt = "MySalt";

        // Define input, encrypted, and decrypted files
        File inputFile = new File("sample.txt");
        File encryptedFile = new File("encrypted.dat");
        File decryptedFile = new File("decrypted.txt");

        // Encrypt the file
        AES256File.encryptFile(inputFile, encryptedFile, secretKey, salt);

        // Decrypt the file
        AES256File.decryptFile(encryptedFile, decryptedFile, secretKey, salt);
    }
}

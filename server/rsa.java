import java.io.*;
import java.nio.file.Files;
import java.security.*;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;

public class rsa {
    private static final String PUBLIC_KEY_FILE = "public_key.der";
    private static final String PRIVATE_KEY_FILE = "private_key.der";

    // Generate a new RSA key pair
    public static void generateKeyPair() throws Exception {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(2048);
        KeyPair keyPair = keyPairGenerator.generateKeyPair();

        // Write the public key to a file
        try (FileOutputStream fos = new FileOutputStream(PUBLIC_KEY_FILE)) {
            fos.write(keyPair.getPublic().getEncoded());
        }

        // Write the private key to a file
        try (FileOutputStream fos = new FileOutputStream(PRIVATE_KEY_FILE)) {
            fos.write(keyPair.getPrivate().getEncoded());
        }
    }

    // Encrypt a file using the public key
    public static void encryptFile(String inputFilePath, String outputFilePath) throws Exception {
        try (FileInputStream fis = new FileInputStream(inputFilePath);
             FileOutputStream fos = new FileOutputStream(outputFilePath)) {

            byte[] inputBytes = fis.readAllBytes();
            PublicKey publicKey = readPublicKeyFromFile(PUBLIC_KEY_FILE);

            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(Cipher.ENCRYPT_MODE, publicKey);
            byte[] encryptedBytes = cipher.doFinal(inputBytes);

            fos.write(encryptedBytes);
        }
    }

    // Decrypt a file using the private key
    public static void decryptFile(String inputFilePath, String outputFilePath) throws Exception {
        try (FileInputStream fis = new FileInputStream(inputFilePath);
             FileOutputStream fos = new FileOutputStream(outputFilePath)) {

            byte[] encryptedBytes = fis.readAllBytes();
            PrivateKey privateKey = readPrivateKeyFromFile(PRIVATE_KEY_FILE);

            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(Cipher.DECRYPT_MODE, privateKey);
            byte[] decryptedBytes = cipher.doFinal(encryptedBytes);

            fos.write(decryptedBytes);
        }
    }

    // Read the public key from a file
    private static PublicKey readPublicKeyFromFile(String fileName) throws Exception {
        byte[] keyBytes = Files.readAllBytes(new File(fileName).toPath());
        X509EncodedKeySpec spec = new X509EncodedKeySpec(keyBytes);
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        return keyFactory.generatePublic(spec);
    }

    // Read the private key from a file
    private static PrivateKey readPrivateKeyFromFile(String fileName) throws Exception {
        byte[] keyBytes = Files.readAllBytes(new File(fileName).toPath());
        PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(keyBytes);
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        return keyFactory.generatePrivate(spec);
    }

    // Example usage
    public static void main(String[] args) throws Exception {
        // Generate a new RSA key pair
        generateKeyPair();

        // Encrypt a file using the public key
        encryptFile("E:\\New folder\\db.txt", "D:\\2nd IA 5th sem\\danu.txt");

        // Decrypt a file using the private key
        decryptFile("D:\\2nd IA 5th sem\\danu.txt", "D:\\2nd IA 5th sem\\dan.txt");
    }
}


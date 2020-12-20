import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.login.LoginException;
import java.io.*;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class MyEnigma {
    public static void main(String fileName1, String text) throws LoginException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException, FileNotFoundException {

        File file = new File("C://Text/text");
        PrintWriter out = new PrintWriter(file.getAbsoluteFile());
        exist(fileName1);
        StringBuilder sb = new StringBuilder();

        try {
            //Объект для чтения файла в буфер
            BufferedReader in = new BufferedReader(new FileReader( file.getAbsoluteFile()));
            try {
                String s;
                while ((s = in.readLine()) != null) {
                    sb.append(s);
                    sb.append("\n");
                }
            } finally {
                //Также не забываем закрыть файл
                in.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }









        System.out.println("Введите ключ состоящий из 16 символов");
        Scanner scan = new Scanner(System.in);
        String b = scan.nextLine();
        Cipher cipher = Cipher.getInstance("AES");
        SecretKeySpec key = new SecretKeySpec(b.getBytes(), "AES");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        System.out.println(key);
        byte[] bytes = cipher.doFinal(b.getBytes());
        System.out.print(new String(bytes));
        System.out.println(" Хотите расшифровать? yes/no");
        Scanner hhr = new Scanner(System.in);
        String g = hhr.nextLine();
        if (g.equals("yes")) {
            System.out.println("Введите ключ:");
            Scanner scann = new Scanner(System.in);
            String f = scann.nextLine();
            if (f.equals(b)) {
                Cipher descriptCipher = Cipher.getInstance("AES");
                descriptCipher.init(Cipher.DECRYPT_MODE, key);
                byte[] descriptedBytes = descriptCipher.doFinal(bytes);
                System.out.print(new String(descriptedBytes));
            } else {
                System.out.println("Неверный ключ");
            }
        } else {
            System.out.println("Досвидания");
        }

    }

    private static void exist(String fileName1) {
    }
}

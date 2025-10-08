import java.util.Scanner;
public class Tugas3 {

    public static void main(String[] args) {
        Scanner faf = new Scanner(System.in);
        String ktm05,regis05;
        System.out.print("Apakah Anda Membawa KTM : ");
        ktm05=faf.next();
        System.out.print("Apakah Anda Sudah Registrasi : ");
        regis05=faf.next();
        if (ktm05.equalsIgnoreCase("ya")&&regis05.equalsIgnoreCase("ya")) {
            System.out.println("boleh masuk");
        }else{
            System.out.println("dilarang masuk");
        }
    }
}
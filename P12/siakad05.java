package P12;
import java.util.Scanner;
public class siakad05 {
    public static void main(String[] args) {
        Scanner faf=new Scanner(System.in);
        int [][]nilai05=new int[4][3];
        for (int i = 0; i < nilai05.length; i++) {
            System.out.println("Input Nilai Mahasiswa ke-"+(i+1));
            for (int j = 0; j < nilai05[i].length; j++) {
                System.out.print("Nilai Mata Kuliah "+(j+1)+": ");
                nilai05[i][j]=faf.nextInt();
            }
        } 
        faf.close();
    }
    
}

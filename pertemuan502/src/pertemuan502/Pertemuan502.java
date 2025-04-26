package pertemuan502;

import java.util.Scanner;

/**
 *
 * @author Wihelmina Guman
 * TGL : 26-04-2025
 */
public class Pertemuan502 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner insi = new Scanner(System.in);
        
            System.out.print("Nilai Sisi");
            int nsisi = insi.nextInt();
            
            
        LuasPersegi PP = new LuasPersegi (nsisi);
        //PP.sisi = 4;
        
        System.out.println("Hitung Luas Persegi");
        System.out.printf("Luas = SISI X SISI\n");
        System.out.printf("     =%d\n", nsisi,nsisi );
        System.out.printf("     = %d\n", PP.HL() );


    }
    
}

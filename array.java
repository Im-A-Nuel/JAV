// import java.util.ArrayList;
import java.lang.String;
import java.util.Scanner;

public class array {

    public static void coba(int[] data){
        for(int i=0; i<data.length;i++){
            data[i] = data[i] + i;
        }
    }

    public static void main(String[] args) {
        
    int[] angka = new int[20];
    for(int x = 0;x<20;x++){
        angka[x] = x+1; 
    }
    for(int y = 0; y<20;y++){
        System.out.print(angka[y] + " ");
    }
    System.out.println(" ");
    for (int i : angka) {
        System.out.print(i + " ");
    }

    System.out.println("");

    int[] num = new int[]{2,3,4,5};
    coba(num);
    for (int i : num) {
        System.out.print(i + " ");
    }
 
    String str = new String("Imanuel");
    System.out.println("\n" + str.charAt(0));
 
    char[] nama = {'P', 'u', 't', 'r', 'a'};
    nama.toString();
    System.out.println(nama);
    System.out.println(str.substring(0, 3));

    StringBuilder strb = new StringBuilder();
    strb.append(str);
    System.out.println(strb.reverse());
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Nama : ");
    String x = sc.nextLine();
    String name = new String(x);

    System.out.print("Nim : ");
    String y = sc.nextLine();
    String nim = new String(y);
    String result = name.replace(name.substring(name.length()-3), nim.substring(nim.length()-3));
    System.out.println(result);
    sc.close();

    }
}

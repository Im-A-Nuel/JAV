import java.util.Scanner;
import java.util.ArrayList;

public class io {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        String siswa[] = {"Imanuella"};
        

        @SuppressWarnings("rawtypes")
        ArrayList arrayList = new ArrayList<>();
        for(int x=0;x<11;x+=2){
            arrayList.add(x);
        }

        for(int x=0;x<arrayList.size();x++){
            System.out.println(arrayList.get(x)); 
        }



        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter Username : ");

        // String username = sc.nextLine();
        // System.out.println("Username : " + username);

        Scanner obj = new Scanner(System.in);
        System.out.print("Masukkan nama : ");
        String inputname = obj.nextLine();
        System.out.print("Masukkan umur : ");
        int inputage = obj.nextInt();
        System.out.print("Masukkan pendapatan : ");
        double inputpend = obj.nextDouble();
        System.out.println("Saya "+ inputname);
        System.out.println("Umur saya " + inputage + " tahun");
        System.out.println("Pendapatan saya sebesar Rp." + inputpend);

        obj.close();

    }
}

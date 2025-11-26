import java.util.Scanner;

public class actividad7 {
     public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int fr;
    System.out.println(" Cuantos grados farenhait ? ");
    fr = sc.nextInt();
    int grados = fr -32;
    int fr1 = fr * 5;
    double gradoscelcius =(double) fr1 /9;
    System.out.println(  " Tus grados celcius son " + gradoscelcius );


}
   }

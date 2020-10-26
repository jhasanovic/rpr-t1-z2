package ba.unsa.etf.rpr;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Unesite broj n:");
        Scanner ulaz=new Scanner(System.in);
        int n=ulaz.nextInt();

        for(int i=1;i<=n;i++){
            if(i%sumaCifara(i)==0)
                System.out.println(i);
        }
    }

    private static int sumaCifara(int n) {
        int cifra=0;
        int suma=0;
        while(n!=0){
            cifra=n%10;
            suma=suma+cifra;
            n=n/10;
        }
        return suma;
    }
}

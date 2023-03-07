import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nama : Muhammad Fairus Ramadhani");
        System.out.println("NPM : 21081010090");
        System.out.println("\nCalculator String(+,-,*,/)\n");
        System.out.println("Masukkan ekspresi:");

        String ekspresi = input.nextLine();
        Calc calcultatorObj = new Calc(ekspresi);
        System.out.println("Hasil : ");
        System.out.println(calcultatorObj.calc()); // Output: 11
    }


}
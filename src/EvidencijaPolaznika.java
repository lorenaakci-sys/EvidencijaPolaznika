import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class EvidencijaPolaznika {

    static ArrayList<Polaznik> polaznici = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void unesiPolaznika() {
        System.out.println("Ime: ");
        String ime = scanner.nextLine();
        System.out.println("Prezime: ");
        String prezime = scanner.nextLine();
        System.out.println("Email: ");
        String email = scanner.nextLine();

        Polaznik polaznik = new Polaznik(ime, prezime, email);
        polaznici.add(polaznik);
    }

    public static void main(String[] args) {

        unesiPolaznika();
    }
}

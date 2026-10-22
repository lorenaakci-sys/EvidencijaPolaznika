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

        System.out.println("Polaznik je upisan.");
    }

    public static void ispisPolaznika() {
        if (polaznici.isEmpty()) {
            System.out.println("Nema polaznika.");
        } else {
            for (Polaznik polaznik : polaznici) {
                polaznik.ispisiPodatke();
            }
        }

    }

    public static void pretraziEmail() {
        System.out.println("Unesite email: ");
        String pretraga = scanner.nextLine();

        boolean postoji = false;

        for (Polaznik polaznik : polaznici) {
            if (polaznik.getEmail().equalsIgnoreCase(pretraga)) {
                polaznik.ispisiPodatke();
                postoji = true;
            }
        }

        if (!postoji) {
            System.out.println("Korisnik nije pronadjen.");
        }

    }
    public static void main(String[] args) {

        unesiPolaznika();
        ispisPolaznika();
        pretraziEmail();
    }
}

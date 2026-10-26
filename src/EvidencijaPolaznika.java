import java.util.*;

public class EvidencijaPolaznika {

    static TreeSet<Polaznik> polaznici = new TreeSet<>();
    static Scanner scanner = new Scanner(System.in);

    public static void unesiPolaznika() {
        String odgovor = "da";

        while(odgovor.equalsIgnoreCase("da")) {
            System.out.println("Ime: ");
            String ime = scanner.nextLine();
            System.out.println("Prezime: ");
            String prezime = scanner.nextLine();
            System.out.println("Email: ");
            String email = scanner.nextLine();

            boolean postoji = false;

            for (Polaznik polaznik : polaznici) {
                if (polaznik.getEmail().equalsIgnoreCase(email)) {
                    postoji = true;
                }
            }

            if (postoji) {
                System.out.println("Korisnik već postoji. Pokušajte ponovno.");
            } else {

                Polaznik polaznik = new Polaznik(ime, prezime, email);
                polaznici.add(polaznik);

                System.out.println("Polaznik je upisan. Želite li dodati još korisnika? da/ne");
                odgovor = scanner.nextLine();
            }
        }
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

    public static void main(String[] args) {

        unesiPolaznika();
        ispisPolaznika();
    }
}

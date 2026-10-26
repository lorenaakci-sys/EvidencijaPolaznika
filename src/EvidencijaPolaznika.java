import java.util.*;

public class EvidencijaPolaznika {

    static TreeMap<String, Polaznik> polaznici = new TreeMap<>();
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

            if (polaznici.containsKey(email)) {
                System.out.println("Polaznik već postoji.");
            } else {
                Polaznik polaznik = new Polaznik(ime, prezime, email);
                polaznici.put(email, polaznik);

                System.out.println("Polaznik je upisan. Želite li dodati još korisnika? da/ne");
                odgovor = scanner.nextLine();
            }
        }
    }

    public static void ispisPolaznika() {
        if (polaznici.isEmpty()) {
            System.out.println("Nema polaznika.");
        } else {
            for (String email : polaznici.keySet()) {
                polaznici.get(email).ispisiPodatke();
            }

        }

    }

    public static void main(String[] args) {

        unesiPolaznika();
        ispisPolaznika();
    }
}

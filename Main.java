import java.util.Random;

public class Main {
    public static void main(String[] args) {

        GestorePrenotazioni gestorePrenotazioni = new GestorePrenotazioni();
        gestorePrenotazioni.addStanza(new Desk("Desk", 10));
        gestorePrenotazioni.addStanza(new MeetingRoom("Meeting Room", 50, 10));
        gestorePrenotazioni.addStanza(new PrivateOffice("Private Office", 15));

        InterfacciaUtente interfacciaUtente = new InterfacciaUtente(gestorePrenotazioni);

        String[] tipologie = {"Meeting Room", "Private Office", "Desk"};

        //Simulazione
        for (int i = 0; i < 10; i++){
            interfacciaUtente.richiestaPrenotazione("Efra", new Random().nextInt(12), tipologie[new Random().nextInt(3)], 10);
        }

        System.out.println(interfacciaUtente.getLog());
    }
}

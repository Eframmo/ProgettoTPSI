import java.util.ArrayList;

public class InterfacciaUtente {

    private GestorePrenotazioni gestorePrenotazioni;
    private ArrayList<String> log;

    public InterfacciaUtente(GestorePrenotazioni gestorePrenotazioni) {
        this.gestorePrenotazioni = gestorePrenotazioni;
        this.log = new ArrayList<>();
    }

    public void richiestaPrenotazione(String nome, int numeroPersone, String tipologia, int ore) {

        try {
            gestorePrenotazioni.prenota(nome, numeroPersone, tipologia, ore);
            log.add("Prenotazione fatta con successo");
        } catch (StanzaOccupataException | IllegalArgumentException | OverBookingException e) {
            log.add(e.getMessage());
        }
    }
}

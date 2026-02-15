import java.util.ArrayList;

public class InterfacciaUtente {

    private GestorePrenotazioni gestorePrenotazioni;
    private ArrayList<String> log;

    public InterfacciaUtente(GestorePrenotazioni gestorePrenotazioni) {
        this.gestorePrenotazioni = gestorePrenotazioni;
        this.log = new ArrayList<>();
    }

    public void richiestaPrenotazione(String nome, int numeroPersone, int tipologia, int ore){

    }
}

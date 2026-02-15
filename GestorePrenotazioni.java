import java.util.ArrayList;

public class GestorePrenotazioni {

    private ArrayList<Stanza> stanze;

    public void addStanza(){

    }

    public void prenota(String nomeCliente, int numeroPersone, String tipologia, int ore) throws StanzaOccupataException {
        if (nomeCliente == null){
            throw new IllegalArgumentException("Nome non valido");
        }

        for (int i = 0; i < stanze.size(); i++){

            if (tipologia.equals("Desk") && stanze.get(i) instanceof Desk){
                stanze.get(i).assegna();
                break;
            }else if (tipologia.equals("Meeting Room") && stanze.get(i) instanceof MeetingRoom){
                stanze.get(i).assegna();
                break;
            }else if (tipologia.equals("Private Office") && stanze.get(i) instanceof PrivateOffice){
                stanze.get(i).assegna();
                break;
            }else {
                throw new IllegalArgumentException("Stanza non riconosciuta");
            }
        }
    }
}

import java.util.ArrayList;

public class GestorePrenotazioni {

    private ArrayList<Stanza> stanze;

    public void addStanza(Stanza stanza){
        stanze.add(stanza);
    }

    public void prenota(String nomeCliente, int numeroPersone, String tipologia, int ore) throws StanzaOccupataException, OverBookingException {
        if (nomeCliente == null){
            throw new IllegalArgumentException("Nome non valido");
        }

        for (int i = 0; i < stanze.size(); i++){

            if (tipologia.equals("Desk") && stanze.get(i) instanceof Desk){
                stanze.get(i).assegna();
                break;
            }else if (tipologia.equals("Meeting Room") && stanze.get(i) instanceof MeetingRoom){
                if (numeroPersone > ((MeetingRoom) stanze.get(i)).getMaxPersone()){
                    throw new OverBookingException("La stanza non è abbastanza grande");
                }
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

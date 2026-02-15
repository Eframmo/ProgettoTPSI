public class MeetingRoom extends Stanza{

    public MeetingRoom(String tipologia, double prezzo) {
        super(tipologia, prezzo);
    }

    @Override
    public boolean assegna() throws IllegalArgumentException, StanzaOccupataException {
        return true;
    }
}

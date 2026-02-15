public class Desk extends Stanza{

    public Desk(String tipologia, double prezzo) {
        super(tipologia, prezzo);
    }

    @Override
    public boolean assegna() throws IllegalArgumentException, StanzaOccupataException {
        return true;
    }
}

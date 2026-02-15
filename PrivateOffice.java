public class PrivateOffice extends Stanza{

    public PrivateOffice(String tipologia, double prezzo) {
        super(tipologia, prezzo);
    }

    @Override
    public boolean assegna() throws IllegalArgumentException, StanzaOccupataException {
        return true;
    }
}

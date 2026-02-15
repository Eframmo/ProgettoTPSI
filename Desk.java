public class Desk extends Stanza{

    public Desk(String tipologia, double prezzo) {
        super(tipologia, prezzo);
    }

    @Override
    public boolean assegna() throws StanzaOccupataException {
        if (isDisponibile()){
            setDisponibile(false);
            return true;
        }else {
            throw new StanzaOccupataException("Stanza Occupata");
        }
    }
}

public class MeetingRoom extends Stanza{

    private int maxPersone;

    public MeetingRoom(String tipologia, double prezzo, int maxPersone) {
        super(tipologia, prezzo);
        this.maxPersone = maxPersone;
    }

    @Override
    public boolean assegna() throws StanzaOccupataException {
        if (this.isDisponibile()){
            this.setDisponibile(false);
            return true;
        }else {
            throw new StanzaOccupataException("Stanza Occupata");
        }
    }

    public int getMaxPersone() {
        return maxPersone;
    }
}

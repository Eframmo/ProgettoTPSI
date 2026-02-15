public abstract class Stanza {

    private String tipologia;
    private double prezzo;
    private boolean disponibile;

    public Stanza(String tipologia, double prezzo) {
        this.tipologia = tipologia;
        this.prezzo = prezzo;
        this.disponibile = true;
    }

    public abstract boolean assegna() throws StanzaOccupataException;

    public String getTipologia() {
        return tipologia;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public boolean isDisponibile() {
        return disponibile;
    }

    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public void setDisponibile(boolean disponibile) {
        this.disponibile = disponibile;
    }
}

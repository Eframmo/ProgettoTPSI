import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class GestorePrenotazioniTest {

    @BeforeAll
    static void setUp() throws OverBookingException, StanzaOccupataException {
        GestorePrenotazioni.addStanza(new MeetingRoom("Meeting Room", 10, 2));
        GestorePrenotazioni.addStanza(new PrivateOffice("Private Office", 10));

        GestorePrenotazioni.prenota("Efra", 10, "Private Office", 10);
    }

    @Test
    void prenota() {
        assertAll(
                () -> assertThrows(IllegalArgumentException.class, () -> GestorePrenotazioni.prenota(null,10,"Office", 10)),
                () -> assertThrows(OverBookingException.class, () -> GestorePrenotazioni.prenota("Efra", 13, "Meeting Room", 12)),
                () -> assertThrows(StanzaOccupataException.class, () -> GestorePrenotazioni.prenota("Efra", 10, "Private Office", 10))
        );
    }
}
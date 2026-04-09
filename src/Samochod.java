public class Samochod implements Pojazd, Silnikowy {
    private String nazwa;
    private int pojemnoscSilnika;
    private boolean silnikWlaczony;
    public Samochod(String nazwa, int pojemnoscSilnika) {
        this.nazwa = nazwa;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.silnikWlaczony = false;
    }
    // ── Implementacja metod interfejsu Pojazd ───────────────────────────
    @Override
    public void jedz() {
        if (silnikWlaczony) {
            System.out.println(nazwa + ": Jadę! Vrrrr...");
        } else {
            System.out.println(nazwa + ": Nie mogę jechać — silnik jest wyłączony!");
        }
    }
    @Override
    public void zatrzymajSie() {
        System.out.println(nazwa + ": Hamuję... Zatrzymałem się.");
    }
    @Override
    public String getNazwa() {
        return nazwa;
    }
    // ── Implementacja metod interfejsu Silnikowy ─────────────────────────
    @Override
    public void uruchomSilnik() {
        silnikWlaczony = true;
        System.out.println(nazwa + ": Silnik uruchomiony! (pojemność: "
                + pojemnoscSilnika + " cm³)");
    }
    @Override
    public int getPojemnoscSilnika() {
        return pojemnoscSilnika;
    }
}
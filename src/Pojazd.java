public interface Pojazd {
    void jedz();
    void zatrzymajSie();
    String getNazwa();
    default void wyswietlStatus() {
        System.out.println("Pojazd: " + getNazwa() + " jest gotowy do jazdy.");
    }
}
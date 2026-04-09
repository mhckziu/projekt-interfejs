public class MainInterfejs {
    public static void main(String[] args) {
        System.out.println("=== Interfejsy — przykład ===\n");
// ── Polimorfizm przez interfejs ───────────────────────────────
// Zmienna typu Pojazd może przechowywać KAŻDY obiekt
// który implementuje interfejs Pojazd.
        Pojazd auto = new Samochod("Toyota Corolla", 1800);
        Pojazd elektryk = new SamochodElektryczny("Tesla Model 3", 80);
        auto.wyswietlStatus();
        elektryk.wyswietlStatus();
        System.out.println();

        Silnikowy silnikowy = (Silnikowy) auto;
        silnikowy.uruchomSilnik();
        auto.jedz();
        auto.zatrzymajSie();
        System.out.println();
        Elektryczny el = (Elektryczny) elektryk;
        System.out.println("Poziom naładowania: " + el.getPoziomNaladowania() + "%");
        elektryk.jedz();
        elektryk.jedz();
        System.out.println("Poziom po jeździe: " + el.getPoziomNaladowania() + "%");
        el.naladujAkumulator();
        System.out.println("\n--- instanceof ---");
        System.out.println("auto instanceof Pojazd: " + (auto instanceof Pojazd));
        System.out.println("auto instanceof Silnikowy: " + (auto instanceof Silnikowy));
        System.out.println("auto instanceof Elektryczny: " + (auto instanceof Elektryczny));
    }
}
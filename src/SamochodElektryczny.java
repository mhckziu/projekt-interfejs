public class SamochodElektryczny implements Pojazd, Elektryczny {
    private String nazwa;
    private int poziomNaladowania;
    public SamochodElektryczny(String nazwa, int poziomNaladowania) {
        this.nazwa = nazwa;
        this.poziomNaladowania = poziomNaladowania;
    }
    @Override
    public void jedz() {
        if (poziomNaladowania > 0) {
            System.out.println(nazwa + ": Jadę cicho... (bateria: " +poziomNaladowania + "%)");
                    poziomNaladowania -= 10;
        } else {
            System.out.println(nazwa + ": Bateria rozładowana! Ładuj mnie!");
        }
    }
    @Override
    public void zatrzymajSie() {
        System.out.println(nazwa + ": Zatrzymałem się (odzysk energii aktywny).");
    }
    @Override
    public String getNazwa() {
        return nazwa;
    }
    @Override
    public void naladujAkumulator() {
        poziomNaladowania = 100;
        System.out.println(nazwa + ": Naładowano do 100%!");
    }
    @Override
    public int getPoziomNaladowania() {
        return poziomNaladowania;
    }
}
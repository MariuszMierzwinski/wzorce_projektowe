// abstrakcyjna klasa dekorator - implementuje interfejs Okno
abstract class OknoDekorator implements Okno {
    protected Okno dekorowaneOkno; // dekorowane Okno

    public OknoDekorator(Okno dekorowaneOkno) {
        this.dekorowaneOkno = dekorowaneOkno;
    }
}

// pierwszy dekorator dodający pionowe paski przewijania
class PionowePrzewijanieDekorator extends OknoDekorator {
    public PionowePrzewijanieDekorator (Okno dekorowaneOkno) {
        super(dekorowaneOkno);
    }

    public void rysuj() {
        rysujPionowyPasekPrzewijania();
        dekorowaneOkno.rysuj();
    }

    private void rysujPionowyPasekPrzewijania() {
        // rysuj pionowy pasek przewijania
    }

    public String pobierzOpis() {
        return dekorowaneOkno.pobierzOpis() + ", z pionowym paskiem przewijania";
    }
}
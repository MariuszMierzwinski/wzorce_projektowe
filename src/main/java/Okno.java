// interfejs Okno
interface Okno {
    public void rysuj(); // rysuje Okno na ekranie
    public String pobierzOpis(); // zwraca opis Okna
}

// implementacja zwykłego okna bez pasków przewijania
class ZwykłeOkno implements Okno {
    public void rysuj() {
        // rysuj okno
    }

    public String pobierzOpis() {
        return "zwykłe okno";
    }
}
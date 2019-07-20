 
public class Rechteck {
    
    // Attribute
    private int laenge;
    private int breite;
    private int flaeche;
    
    // Konstruktor
    public Rechteck(int startLaenge, int startBreite){
        laenge = startLaenge;
        breite = startBreite;
    }
    
    // Methoden
    public int getLaenge(){
        return laenge;
    }
    
    public void setLaenge(int neueLaenge){
        laenge = neueLaenge;
        laeche = laenge * breite;
    }
    
    public int flaeche(){
        return flaeche;
    }
    
    public boolean istGroesserAls(Rechteck vergleichsRechteck){
        return flaeche() > vergleichsRechteck.flaeche();
    }
}

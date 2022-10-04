public class Stadtrad extends Fahrrad{

    boolean lichtAn = false;
    public static void main ( String [] args ) {
        Stadtrad stadtrad = new Stadtrad("Flitzer", "schwarz", false);
        stadtrad.lenke(10);
        stadtrad.beschleunige(0.3, 9.8);
        stadtrad.lichtAn();
        System.out.println(stadtrad);
    }

    public Stadtrad(String a, String b, boolean c) {
        super(a, b);
        lichtAn = c;
    }

     public void lichtAn() {
        lichtAn = true;
     }

     public void lichAus() {
        lichtAn = false;
     }

     public boolean istLichtAn() {
        return lichtAn;
     }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Name: " + getName() + ", Farbe: " + getFarbe() + ", Richtung: " + getRichtung() + ", km/h: " + getKmh()*3.6 + ", Licht ");
        if(lichtAn) {
            str.append("an");
        } else {
            str.append("aus");
        }
        return str.toString();
    }
}

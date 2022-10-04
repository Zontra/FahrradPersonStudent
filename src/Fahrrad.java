public class Fahrrad {
    private String name;
    private String farbe;
    private int richtung;
    private double geschwindigkeit;


    public static void main ( String args []) {
        Fahrrad fahrrad = new Fahrrad ("Strampler", "blau");
        fahrrad.lenke (10);
        fahrrad.beschleunige (.3 , 9.8); // v = v + 0.3 * 9.8
        System.out.println (fahrrad);
    }

    public Fahrrad(String a, String b) {
        name = a;
        farbe = b;
    }

    public void lenke(int delta) {
        if (delta + richtung > 45) {
            richtung = 45;
        } else if (delta + richtung < -45) {
            richtung = -45;
        } else {
            richtung += delta;
        }
    }

    public void beschleunige(double a, double sec) {
        geschwindigkeit = geschwindigkeit + a*sec;
    }

    public double getKmh() {
        return geschwindigkeit;
    }

    public void setRichtung(int a) {
        richtung = a;
    }

    public int getRichtung() {
        return richtung;
    }

    public String getName() {
        return name;
    }

    public String getFarbe() {
        return farbe;
    }
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Name: " + name + ", Farbe: " + farbe + ", Richtung: " + richtung + ", km/h: " + geschwindigkeit*3.6);
        return str.toString();
    }
}

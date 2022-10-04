public class Konto extends Person {
    private double kontostand;
    private Person inhaber;

    public static void main(String[] args) {
        Konto konto1 = new Konto("Schmidt", "Hans", 500.0);
        Konto konto2 = new Konto("Krause", "Peter", 1500.0);
        Konto konto3 = new Konto("Bauer", "Harald", 500.0);
        Konto.vergleich(konto1, konto2);
        Konto.vergleich(konto2, konto3);
        Konto.vergleich(konto1, konto3);
    }

    public Konto(String a, String b, double c) {
        inhaber = new Person(a, b);
        kontostand = c;
    }



    public static void vergleich(Konto k1, Konto k2) {
        if (k1.kontostand == k2.kontostand) {
            System.out.println(k1.inhaber + " und " + k2.inhaber + " haben den gleichen Kontostand");
        } else if (k2.kontostand < k1.kontostand) {
            System.out.println(k1.inhaber + " hat mehr Geld auf dem Konto als " + k2.inhaber);
        } else {
            System.out.println(k2.inhaber + " hat mehr Geld auf dem Konto als " + k1.inhaber);
        }
    }
}

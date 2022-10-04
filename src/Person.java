public class Person {
    private String vorname ;
    private String nachname ;
    public static void main ( String [] args ) {
        Person p1 = new Person ();
        p1.setNachname ("Lothar");
        p1.setVorname ("Friedl");
        System.out.println ("Vorname: " + p1 . getVorname ());
        System.out.println ("Name: " + p1.getNachname ());
        Person p2 = new Person ("Klammer", "Franz");
        System.out.println( p2 ); // Ausgabe : " Klammer Franz "
    }

    public Person() {
    }

    public Person(String a, String b) {
        vorname = b;
        nachname = a;
    }

    public void setVorname(String a) {
        vorname = a;
    }

    public void setNachname(String a) {
        nachname = a;
    }

    public String getNachname() {
        return nachname;
    }

    public String getVorname() {
        return vorname;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append(nachname + " " + vorname);
        return str.toString();
    }
}

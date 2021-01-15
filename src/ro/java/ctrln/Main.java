package ro.java.ctrln;

public class Main {

    /**
     * Metoda main este metoda apelata de masina virtuala Java si care porneste o aplicatie java
     * Putem sa trasmitem argumente aditionale prin parametrul <b>args</b>
     * @param args Acesta este parametrul cu care transmitem argumente programului nostru
     * @author Bianca Vasile
     */
    public static void main(String[] args) {
        if(args.length != 4) {
            System.out.println("USAGE:  java ro.java.ctrln.Main 1 2 3 4");
            return;
        }
        if (!args[0].equals ("1")) {
            System.out.println("USAGE:  java ro.java.ctrln.Main 1 2 3 4");
            return;

        }
        System.out.println("Invat Limbajul Java si despre masina virtuala Java");
        ro.java.misc.Main.main(args);
    }
}

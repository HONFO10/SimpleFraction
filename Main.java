public class Main {
    public static void main(String[] args) {
        // Tests des constructeurs
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(3);
        Fraction f3 = new Fraction();

        // Tests des constantes
        Fraction zero = Fraction.ZERO;
        Fraction un = Fraction.UN;

        // Assertions pour tester les constructeurs et constantes
        assert f1.toString().equals("1/2") : "Erreur sur f1";
        assert f2.toString().equals("3/1") : "Erreur sur f2";
        assert f3.toString().equals("0/1") : "Erreur sur f3";
        assert zero.toString().equals("0/1") : "Erreur sur ZERO";
        assert un.toString().equals("1/1") : "Erreur sur UN";

        // Tests des getters
        assert f1.getNumerateur() == 1 : "Erreur sur le numérateur de f1";
        assert f1.getDenominateur() == 2 : "Erreur sur le dénominateur de f1";

        // Tests de la conversion en double
        assert f1.doubleValue() == 0.5 : "Erreur sur doubleValue() de f1";
        assert f2.doubleValue() == 3.0 : "Erreur sur doubleValue() de f2";

        // Affichage des résultats
        System.out.println("Tous les tests sont réussis !");
    }
}



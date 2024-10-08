public class Main {
    public static void main(String[] args) {
        // Tests des constructeurs
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 3);
        Fraction f3 = new Fraction(2, 3);
        Fraction f4 = new Fraction(3, 6); // équivalent à 1/2

        // Assertions pour tester l'addition
        Fraction sum = f1.add(f2);
        assert sum.toString().equals("5/6") : "Erreur sur l'addition";

        // Assertions pour tester l'égalité
        assert f1.equals(f4) : "Erreur sur l'égalité"; // f1 et f4 doivent être égales
        assert !f1.equals(f3) : "Erreur sur l'égalité"; // f1 et f3 ne doivent pas être égales

        // Assertions pour tester la comparaison
        assert f1.compareTo(f3) < 0 : "Erreur sur la comparaison"; // f1 < f3
        assert f1.compareTo(f2) > 0 : "Erreur sur la comparaison"; // f1 > f2
        assert f1.compareTo(f4) == 0 : "Erreur sur la comparaison"; // f1 == f4

        // Vérifier avec java.math.BigDecimal
        Number aNumber = java.math.BigDecimal.ONE;
        Number anotherNumber = new Fraction(1, 2);
        assert java.lang.Math.abs(aNumber.doubleValue() + anotherNumber.doubleValue() - 1.5) < 1e-10 : "Erreur sur la somme avec BigDecimal";

        // Affichage des résultats
        System.out.println("Tous les tests sont réussis !");
    }
}

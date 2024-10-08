public class Fraction {
    // Attributs
    private int numerateur;
    private int denominateur;

    // Constantes
    public static final Fraction ZERO = new Fraction(0, 1);
    public static final Fraction UN = new Fraction(1, 1);

    // Constructeurs
    public Fraction(int numerateur, int denominateur) {
        if (denominateur == 0) {
            throw new IllegalArgumentException("Le dénominateur ne peut pas être zéro.");
        }
        this.numerateur = numerateur;
        this.denominateur = denominateur;
    }

    public Fraction(int numerateur) {
        this(numerateur, 1); // Appelle le constructeur avec le dénominateur par défaut à 1
    }

    public Fraction() {
        this(0, 1); // Initialisation par défaut à 0/1
    }

    // Getters
    public int getNumerateur() {
        return numerateur;
    }

    public int getDenominateur() {
        return denominateur;
    }

    // Méthode pour obtenir la valeur en virgule flottante
    public double doubleValue() {
        return (double) numerateur / denominateur;
    }

    // Méthode toString
    @Override
    public String toString() {
        return numerateur + "/" + denominateur;
    }
}


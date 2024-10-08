public class Fraction extends Number implements Comparable<Fraction> {
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
        // Réduire la fraction
        int gcd = gcd(numerateur, denominateur);
        this.numerateur = numerateur / gcd;
        this.denominateur = denominateur / gcd;
        // S'assurer que le dénominateur est positif
        if (this.denominateur < 0) {
            this.numerateur = -this.numerateur;
            this.denominateur = -this.denominateur;
        }
    }

    public Fraction(int numerateur) {
        this(numerateur, 1); // Appelle le constructeur avec le dénominateur par défaut à 1
    }

    public Fraction() {
        this(0, 1); // Initialisation par défaut à 0/1
    }

    // Méthode pour additionner deux fractions
    public Fraction add(Fraction other) {
        int newNumerateur = this.numerateur * other.denominateur + other.numerateur * this.denominateur;
        int newDenominateur = this.denominateur * other.denominateur;
        return new Fraction(newNumerateur, newDenominateur); // Retourne la somme sous forme de fraction
    }

    // Méthode pour vérifier l'égalité
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Fraction)) return false;
        Fraction other = (Fraction) obj;
        return this.numerateur == other.numerateur && this.denominateur == other.denominateur;
    }

    // Méthode pour comparer les fractions
    @Override
    public int compareTo(Fraction other) {
        return Integer.compare(this.numerateur * other.denominateur, this.denominateur * other.numerateur);
    }

    // Méthodes héritées de Number
    @Override
    public double doubleValue() {
        return (double) numerateur / denominateur;
    }

    @Override
    public int intValue() {
        return (int) doubleValue();
    }

    @Override
    public long longValue() {
        return (long) doubleValue();
    }

    @Override
    public float floatValue() {
        return (float) doubleValue();
    }

    // Getters
    public int getNumerateur() {
        return numerateur;
    }

    public int getDenominateur() {
        return denominateur;
    }

    // Méthode toString
    @Override
    public String toString() {
        return numerateur + "/" + denominateur;
    }

    // Méthode pour trouver le plus grand commun diviseur
    private int gcd(int a, int b) {
        if (b == 0) return Math.abs(a);
        return gcd(b, a % b);
    }
}

public class Ravenclaw extends HoghwartsStudents{
    private int wize;
    private int wity;
    private int smart;
    private int creativ;

    public Ravenclaw(String name, int powerOfMagic, int transgression, int wize, int wity, int smart, int creativ) {
        super(name, powerOfMagic, transgression);
        this.wize = wize;
        this.wity = wity;
        this.smart = smart;
        this.creativ = creativ;
    }

    public int getWize() {
        return wize;
    }

    public int getWity() {
        return wity;
    }

    public int getSmart() {
        return smart;
    }

    public int getCreativ() {
        return creativ;
    }
    public int sumOfRavenclaw () {
        return wity+wize+smart+creativ;
    }
    public static void bestRavenclaw (Ravenclaw ravenclawStudent1, Ravenclaw ravenclawStudent2) {
        if (ravenclawStudent1.sumOfRavenclaw() > ravenclawStudent2.sumOfRavenclaw()) {
            System.out.println("Студент Когтеврана " + ravenclawStudent1 + " сильнее студента Когтеврана " + ravenclawStudent2);
        } else if (ravenclawStudent1.sumOfRavenclaw() < ravenclawStudent2.sumOfRavenclaw()) {
            System.out.println("Студент Когтеврана " + ravenclawStudent1 + " сильнее студента Когтеврана " + ravenclawStudent2);
        } else {
            System.out.println("Студенты равны");
        }

    }

    @Override
    public String toString() {
        return super.toString() +
                "wize=" + wize +
                ", wity=" + wity +
                ", smart=" + smart +
                ", creativ=" + creativ +
                '}';
    }
}

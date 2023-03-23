public class Gryffindor extends HoghwartsStudents {

    private int nobility;
    private int honor;
    private int courage;

    public Gryffindor(String name, int powerOfMagic, int transgression, int nobility, int honor, int courage) {
        super(name, powerOfMagic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getCourage() {
        return courage;
    }
    public int sumOfGryffindor () {
        return nobility+honor+courage;
    }
    public static void bestGryffindor (Gryffindor gryffindorStudent1, Gryffindor gryffindorStudent2) {
        if (gryffindorStudent1.sumOfGryffindor() > gryffindorStudent2.sumOfGryffindor()) {
            System.out.println("Студент Гриффиндора " + gryffindorStudent1 + " сильнее студента Гриффиндора " + gryffindorStudent2);
        } else if (gryffindorStudent1.sumOfGryffindor() < gryffindorStudent2.sumOfGryffindor()) {
            System.out.println("Студент Гриффиндора " + gryffindorStudent2 + " сильнее студента Гриффиндора " + gryffindorStudent1);
        } else {
            System.out.println("Студенты равны");
        }

    }

    public Gryffindor(String name, int powerOfMagic, int transgression) {
        super(name, powerOfMagic, transgression);
    }

    @Override
    public String toString() {
        return super.toString() +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", courage=" + courage +
                '}';

    }

}

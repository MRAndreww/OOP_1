public class Hufflepuff extends HoghwartsStudents {

    private int hardwork;
    private int loyal;
    private int honest;

    public Hufflepuff(String name, int powerOfMagic, int transgression, int hardwork, int loyal, int honest) {
        super(name, powerOfMagic, transgression);
        this.hardwork = hardwork;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardwork() {
        return hardwork;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHonest() {
        return honest;
    }
    public int sumOfHufflepuff () {
        return hardwork+loyal+honest;
    }
    public static void bestHufflepuff (Hufflepuff hufflepuffStudent1, Hufflepuff hufflepuffStudent2) {
        if (hufflepuffStudent1.sumOfHufflepuff() > hufflepuffStudent2.sumOfHufflepuff()) {
            System.out.println("Студент Пуффендуя " + hufflepuffStudent1 + " сильнее студента Пуффендуя " + hufflepuffStudent2);
        } else if (hufflepuffStudent1.sumOfHufflepuff() < hufflepuffStudent2.sumOfHufflepuff()) {
            System.out.println("Студент Пуффендуя " + hufflepuffStudent1 + " сильнее студента Пуффендуя " + hufflepuffStudent2);
        } else {
            System.out.println("Студенты равны");
        }

    }

    @Override
    public String toString() {
        return super.toString() +
                "hardwork=" + hardwork +
                ", loyal=" + loyal +
                ", honest=" + honest +
                '}';
    }
}

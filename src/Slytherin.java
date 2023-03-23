public class Slytherin extends HoghwartsStudents{
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String name, int powerOfMagic, int transgression, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, powerOfMagic, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }
    public int sumOfSlytherin () {
        return determination + ambition + resourcefulness + lustForPower;
    }
    public static void bestSlytherin (Slytherin slytherinStudent1, Slytherin slytherinStudent2) {
        if (slytherinStudent1.sumOfSlytherin() > slytherinStudent2.sumOfSlytherin()) {
            System.out.println("Студент Слизерина " + slytherinStudent1 + " сильнее студента Слизерина " + slytherinStudent2);
        } else if (slytherinStudent1.sumOfSlytherin() < slytherinStudent2.sumOfSlytherin()) {
            System.out.println("Студент Слизерина " + slytherinStudent1 + " сильнее студента Слизерина " + slytherinStudent2);
        } else {
            System.out.println("Студенты равны");
        }

    }

    @Override
    public String toString() {
        return super.toString() +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", lustForPower=" + lustForPower +
                '}';
    }
}

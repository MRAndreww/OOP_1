abstract public class HoghwartsStudents {

    private String name;
    private int powerOfMagic;

    private int transgression;

    public HoghwartsStudents(String name, int powerOfMagic, int transgression) {
        this.name = name;
        this.powerOfMagic = powerOfMagic;
        this.transgression = transgression;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public int getTransgression() {
        return transgression;
    }
    public String getName () {
        return name;
    }

    public int sumOfAbilities() {
        return powerOfMagic + transgression;
    }

    public static void bestStudent (HoghwartsStudents hogwartsStudent1, HoghwartsStudents hoghwartsStudent2) {
        if (hogwartsStudent1.sumOfAbilities() > hoghwartsStudent2.sumOfAbilities()) {
            System.out.println("Студент " + hogwartsStudent1 + " сильнее студента " + hoghwartsStudent2);
        } else if (hogwartsStudent1.sumOfAbilities() < hoghwartsStudent2.sumOfAbilities()) {
            System.out.println("Студент " + hoghwartsStudent2 + " сильнее студента " + hogwartsStudent1);
        } else {
            System.out.println("Студенты равны");
        }

    }

    @Override
    public String toString() {
        return "HoghwartsStudents{" +
                "name='" + name + '\'' +
                ", powerOfMagic=" + powerOfMagic +
                ", transgression=" + transgression +
                '}';
    }
}

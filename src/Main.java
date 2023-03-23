public class Main {
    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor("Harry Potter", 25, 30, 50, 50, 75);
        Gryffindor hermioneGranger = new Gryffindor("Hermione Granger",80,50,50,55,60);
        Gryffindor ronWeasley = new Gryffindor("Ron Weasley", 40, 50,50,60,45);

        Hufflepuff zachariasSmee = new Hufflepuff("Zacharias Smee", 40, 50, 60,70, 80);
        Hufflepuff cedricDiggory = new Hufflepuff("Cedric Diggory", 55, 50, 65,40, 75);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Justin Finch-Fletchley", 74, 60, 50,70, 55);

        Slytherin dracoMalfoy = new Slytherin("Draco Malfoy", 70, 60, 90, 70, 90, 70, 90);
        Slytherin grahamMontagu = new Slytherin("Graham Montagu", 65, 50, 80, 65, 65, 85, 70);
        Slytherin gregoryGoyle = new Slytherin("Gregory Goyle", 50, 50, 80, 80, 50, 45, 90);

        Ravenclaw zhouChang = new Ravenclaw("Zhou Chang", 70, 50, 50, 70, 65, 80);
        Ravenclaw padmaPatil = new Ravenclaw("Padma Patil", 50, 60, 80, 80, 75, 55);
        Ravenclaw marcusBelby = new Ravenclaw("Marcus Belby", 55, 55, 45, 85, 65, 75);

        printGryffindor(dracoMalfoy);
        HoghwartsStudents.bestStudent(harryPotter, cedricDiggory);
        Gryffindor.bestGryffindor(hermioneGranger,harryPotter);

    }

    public static void printGryffindor (HoghwartsStudents hoghwartsStudents)
    {
        System.out.println(hoghwartsStudents);
    }


}
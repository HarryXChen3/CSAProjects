package labs.trackinggrades;

public class Grades {
    public static void main(final String[] args) {
        final Student mary = new Student("Mary");
        //create student2, "Mike"
        final Student mike = new Student("Mike");

        //input grades for Mary
        mary.inputGrades();
        //print average for Mary
        System.out.println(mary.getAverage());

        //input grades for Mike
        mike.inputGrades();
        //print average for Mike
        System.out.println(mike.getAverage());

        System.out.println(mary);
        System.out.println(mike);
    }
}

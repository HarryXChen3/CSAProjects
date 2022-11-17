package labs.monster;

import java.util.Scanner;

public class MonsterRunner {
    public static void main(final String[] args) {
        final Scanner inputScanner = new Scanner(System.in);

        System.out.println("Enter 1st monster's name:");
        final String name_1 = inputScanner.nextLine();
        System.out.println("Enter 1st monster's size:");
        final int size_1 = inputScanner.nextInt();

        inputScanner.nextLine();
        System.out.println("Enter 2nd monster's name:");
        final String name_2 = inputScanner.nextLine();
        System.out.println("Enter 2nd monster's size:");
        final int size_2 = inputScanner.nextInt();

        final Monster monster_1 = new Monster(name_1, size_1);
        final Monster monster_2 = new Monster(name_2, size_2);

        System.out.println("Monster 1 - " + monster_1);
        System.out.println("Monster 2 - " + monster_2);

        System.out.println(
                monster_1.eq(monster_2) ?
                        "Monster one is the same size as Monster two." :
                        (monster_1.gt(monster_2) ?
                                "Monster one is larger than Monster two." :
                                "Monster two is larger than Monster one."
                        )
        );

        System.out.println(
                monster_1.eq(monster_2) ?
                        "Monster one has the same name as Monster two." :
                        "Monster one does not have the same name as Monster two."
        );
    }
}

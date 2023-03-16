package labs.inheritance_labs.lunch;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Trio extends SimpleLunchItem {
    private final List<SimpleLunchItem> items;

    public Trio(final Sandwich sandwich, final Salad salad, final Drink drink) {
        super(String.format("%s/%s/%s", sandwich.getName(), salad.getName(), drink.getName()), 0);
        this.items = new ArrayList<>(List.of(sandwich, salad, drink));
        this.items.sort(Comparator.comparingDouble(SimpleLunchItem::getPrice));

        final int n_items = this.items.size();
        this.setPrice(this.items.get(n_items - 1).getPrice() + this.items.get(n_items - 2).getPrice());
    }

    public static void main(String[] args) {
        Sandwich burger = new Sandwich("Cheeseburger",2.75);
        Sandwich club = new Sandwich("Club Sandwich", 2.75);
        Salad spinachSalad = new Salad("Spinach Salad",1.25);
        Salad coleslaw = new Salad("Coleslaw", 1.25);
        Drink orange = new Drink("Orange Soda", 1.25);
        Drink cap = new Drink("Cappuccino", 3.50);
        Trio trio1 = new Trio(burger,spinachSalad, orange);

        System.out.println("It should print Cheeseburger/Spinach Salad/Orange Soda and it prints: " + trio1.getName());
        System.out.println("It should print 4.0 and it prints: " + trio1.getPrice());

        Trio trio2 = new Trio(club,coleslaw,cap);
        System.out.println("It should print Club Sandwich/Coleslaw/Capuccino and it prints: " + trio2.getName());
        System.out.println("It should print 6.25 and it prints: " + trio2.getPrice());
    }
}

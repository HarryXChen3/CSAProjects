package labs.arraylist_labs.mountain_climbing;

import java.util.ArrayList;
import java.util.List;

public class ClimbingClub {
    private final List<ClimbInfo> climbInfoList = new ArrayList<>();

    public ClimbingClub() {}

    public void addClimb(final String name, final int time) {
        climbInfoList.add(new ClimbInfo(name, time));
    }

    @Override
    public String toString() {
        final StringBuilder stringBuilder = new StringBuilder();
        final String separator = "\n";
        for (final ClimbInfo climbInfo : climbInfoList) {
            stringBuilder.append(climbInfo).append(separator);
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        final ClimbingClub hikerClub = new ClimbingClub();
        hikerClub.addClimb("Monadnock", 274);
        hikerClub.addClimb("Whiteface", 301);
        hikerClub.addClimb("Algonquin", 225);
        hikerClub.addClimb("Monadnock", 344);

        System.out.println(hikerClub);
    }
}

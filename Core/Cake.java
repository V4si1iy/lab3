package Core;

import Util.ThingAb;
import Util.ThingType;

public class Cake extends ThingAb {
    private String name;
    private final ThingType TYPE = ThingType.CAKE;

    public Cake() {
        super(true);
        name = "Кекс";
        joinStory();
    }

    public Cake(String name) {
        super(true);
        this.name = name;
        joinStory();
    }

    public Cake(String name, boolean black) {
        super(black);
        this.name = name;
        joinStory();
    }


    private void joinStory() {
        if (isBlack()) {
            System.out.println("Почерневший кекс '" + name + "' присоединилось к истории.");
        } else {
            System.out.println("Кекс '" + name + "' присоединилось к истории.");
        }
    }



    @Override
    public String getName() {
        return name;
    }

    @Override
    public ThingType getType() {
        return TYPE;
    }

    @Override
    public String toString() {
        if (isBlack()) return "Почерневший кекс '" + name + "'";
        return "Кекс '" + name + "'";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Cake) {
            return name.equals(((Cake) obj).getName()) && isBlack() == ((Cake) obj).isBlack();
        }
        return false;
    }

    @Override
    public int hashCode() {
        if (isBlack()) return name.hashCode() + name.length();
        return name.hashCode();
    }
}
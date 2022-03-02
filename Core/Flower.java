package Core;

import Util.ThingAb;
import Util.ThingType;

public class Flower extends ThingAb {
    private String name;
    private final ThingType TYPE = ThingType.FLOWERS;

    public Flower() {
        super(true);
        name = "цветы";
        joinStory();
    }

    public Flower(String name) {
        super(true);
        this.name = name;
        joinStory();
    }



    private void joinStory() {
        System.out.println("Цветы '" + name + "' присоединилось к истории.");
    }
    public void laydownf() {
        System.out.println("и букет цветов '" + name + "' .");
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
        return "Цветы '" + name + "'";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Flower) {
            return name.equals(((Flower) obj).getName());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}

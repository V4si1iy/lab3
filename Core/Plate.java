package Core;

import Util.ThingAb;
import Util.ThingType;

public class Plate extends ThingAb {
    private String name;
    private final ThingType TYPE = ThingType.PLATES;

    public Plate() {
        super(true);
        name = "Тарелки";
        joinStory();
    }

    public Plate(String name) {
        super(true);
        this.name = name;
        joinStory();
    }



    private void joinStory() {
            System.out.println("Тарелки '" + name + "' присоединилось к истории.");
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
        return "Тарелки '" + name + "'";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Plate) {
            return name.equals(((Plate) obj).getName());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}

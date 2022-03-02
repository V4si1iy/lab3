package Core;

import Util.AllInt;

import Util.ThingAb;
import Util.ThingType;

public class Cup extends ThingAb {
    private String name;
    private final ThingType TYPE = ThingType.CUPS;

    public Cup() {
        super(true);
        name = "стаканы";
        joinStory();
    }

    public Cup(String name) {
        super(true);
        this.name = name;
        joinStory();
    }




    private void joinStory() {
        System.out.println("Стаканы '" + name + "' присоединилось к истории.");
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
        return "Стаканы '" + name + "'";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Cup) {
            return name.equals(((Cup) obj).getName());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}

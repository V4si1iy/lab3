package Core;

import Util.AllInt;

public class Ding implements AllInt {
    private String name;

    public Ding() {
        name = "колокольчик";
        joinStory();
    }

    public Ding(String name) {
        this.name = name;
        joinStory();
    }

    private void joinStory() {
        System.out.println("Колокольчик '" + name + "' присоединился к истории.");
    }

    public void loud() {
        System.out.println("Колокольчик '" + name + "' звякнул (всего один печальный звук).");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Колокольчик '" + name + "'";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Ding) {
            return name.equals(((Ding) obj).getName());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}

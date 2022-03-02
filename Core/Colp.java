package Core;

import Util.AllInt;

public class Colp implements AllInt {
    private String name;

    public Colp() {
        name = "Колпачок";
        joinStory();
    }

    public Colp(String name) {
        this.name = name;
        joinStory();
    }

    private void joinStory() {
        System.out.println("Колпачок '" + name + "' присоединился к истории.");
    }

    public void fall() {
        System.out.println("Колпачок '" + name + "' съехал ей на лоб.");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Колпачок '" + name + "'";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Colp) {
            return name.equals(((Colp) obj).getName());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}

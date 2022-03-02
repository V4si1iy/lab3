package Core;

import Util.AllInt;

public class Fili implements AllInt {
    private String name;

    public Fili() {
        name = "Филифьонка";
        joinStory();
    }

    public Fili(String name) {
        this.name = name;
        joinStory();
    }

    private void joinStory() {
        System.out.println("Филифьонка '" + name + "' присоединилась к истории.");
    }

    public void sadfili() {
        System.out.println("Филифьонка '" + name + "' взглянула на часы и гирлянды листьев над дверью, потом посмотрела на себя в зеркало, оперлась руками о стол и заплакала.");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Филифьонка '" + name + "'";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Fili) {
            return name.equals(((Fili) obj).getName());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}

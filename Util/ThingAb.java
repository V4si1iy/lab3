package Util;

public abstract class ThingAb implements ThingInt {
    private boolean black;

    public ThingAb(boolean black) {
        this.black = black;
    }

    @Override
    public boolean isBlack() {
        return black;
    }

    @Override
    public void setBlack(boolean black) {
        this.black = black;
    }
}


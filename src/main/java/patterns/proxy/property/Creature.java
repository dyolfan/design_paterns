package patterns.proxy.property;

class Creature {
    private final Property<Integer> agility = new Property<>(10);

    public int getAgility() {
        return this.agility.getValue();
    }

    public void setAgility(int agility) {
        this.agility.setValue(agility);
    }
}

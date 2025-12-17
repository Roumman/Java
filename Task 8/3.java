interface Bird {
    String getName();
}

interface Flyable {
    void fly();
}

class Sparrow implements Bird, Flyable {
    @Override
    public String getName() {
        return "Sparrow";
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flying");
    }
}

class Penguin implements Bird {
    @Override
    public String getName() {
        return "Penguin";
    }
}

class Eagle implements Bird, Flyable {
    @Override
    public String getName() {
        return "Eagle";
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flying");
    }
}

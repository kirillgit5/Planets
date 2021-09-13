public enum Planets {
    EARTH("Earth", 2121131313, 12000, 13313131),
    Saturn("Saturn", 1331313, 3131, 4242424),
    Mars("Mars", 3131333, 10222, 31414414);

    public final String name;
    public final int weight;
    public final int radius;
    public final int age;

    Planets(String name, int weight, int radius, int age) {
        this.name = name;
        this.weight = weight;
        this.radius = radius;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Weight: " + weight + "\n" +
                "radius: " + radius + "\n" +
                "Live: " + age;
    }
}

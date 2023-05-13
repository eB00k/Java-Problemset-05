package P10;

public class SpaceAge {
    private static final double EARTH_YEAR_IN_SECONDS = 31557600.0;
    private static final double MERCURY_ORBITAL_PERIOD = 0.2408467;
    private static final double VENUS_ORBITAL_PERIOD = 0.61519726;
    private static final double MARS_ORBITAL_PERIOD = 1.8808158;
    private static final double JUPITER_ORBITAL_PERIOD = 11.862615;
    private static final double SATURN_ORBITAL_PERIOD = 29.447498;
    private static final double URANUS_ORBITAL_PERIOD = 84.016846;
    private static final double NEPTUNE_ORBITAL_PERIOD = 164.79132;

    private double age;

    SpaceAge(double age) {
        this.age = age;
    }

    public double onEarth() {
        return age / EARTH_YEAR_IN_SECONDS;
    }

    public double onMercury() {
        return age / (EARTH_YEAR_IN_SECONDS * MERCURY_ORBITAL_PERIOD);
    }

    public double onVenus() {
        return age / (EARTH_YEAR_IN_SECONDS * VENUS_ORBITAL_PERIOD);
    }

    public double onMars() {
        return age / (EARTH_YEAR_IN_SECONDS * MARS_ORBITAL_PERIOD);
    }

    public double onJupiter() {
        return age / (EARTH_YEAR_IN_SECONDS * JUPITER_ORBITAL_PERIOD);
    }

    public double onSaturn() {
        return age / (EARTH_YEAR_IN_SECONDS * SATURN_ORBITAL_PERIOD);
    }

    public double onUranus() {
        return age / (EARTH_YEAR_IN_SECONDS * URANUS_ORBITAL_PERIOD);
    }

    public double onNeptune() {
        return age / (EARTH_YEAR_IN_SECONDS * NEPTUNE_ORBITAL_PERIOD);
    }

    @Override
    public String toString() {
        return "SpaceAge{" +
                "ageInSeconds=" + age +
                '}';
    }

}

package hrudin.hw_5;

public class SportCar {
    private final String name;
    private final String color;
    private final ModelType model;
    private final int year;
    private final double engineValue;

    private SportCar(String name, String color, ModelType model, int year, double engineValue) {
        this.name = name;
        this.color = color;
        this.model = model;
        this.year = year;
        this.engineValue = engineValue;
    }

    public static BuilderSportCar builder() {
        return new BuilderSportCar();
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public ModelType getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getEngineValue() {
        return engineValue;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", engineValue=" + engineValue +
                '}';
    }

    public static class BuilderSportCar {
        private String name;
        private String color;
        private ModelType model;
        private int year;
        private double engineValue;


        public SportCar build() {
            return new SportCar(this.name, this.color, this.model, this.year, this.engineValue);
        }

        private BuilderSportCar() {
        }

        public BuilderSportCar name(String name) {
            this.name = name;
            return this;
        }

        public BuilderSportCar color(String color) {
            this.color = color;
            return this;
        }

        public BuilderSportCar model(ModelType model) {
            this.model = model;
            return this;
        }

        public BuilderSportCar year(int year) {
            this.year = year;
            return this;
        }

        public BuilderSportCar engineValue(double engineValue) {
            this.engineValue = engineValue;
            return this;
        }
    }

    public enum ModelType {
        BMW, Mercedes, Lexus
    }
}

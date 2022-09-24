public class Car {
    private String brand;
    private String model;
    private float engineVolume;
    private String color;
    private int productionYear;
    private String productionCountry;

    public Car(String brand, String model, float engineVolume, String color, int productionYear, String productionCountry) {
        if (brand =="") {
            this.brand = "default";
        } else {
            this.brand = brand;;
        }

        if (model =="") {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (productionCountry =="") {
            this.productionCountry = "default";
        } else {
            this.productionCountry =productionCountry;
        }
        if (engineVolume ==0) {
            this.engineVolume = 1.5f;
        } else {
            this.engineVolume =engineVolume;
        }
        if (productionYear ==0) {
            this.productionYear = 2000;
        } else {
            this.productionYear =productionYear;
        }

        if (color =="") {
            this.color = "Белый";
        } else {
            this.color =color;
        }



    }

    @Override
    public String toString() {
        return "Автомбиль { " +
                "марка='" + brand + '\'' +
                ", модель='" + model + '\'' +
                ", объем двигателя=" + engineVolume +
                ", цвет кузова='" + color + '\'' +
                ", год выпуска=" + productionYear +
                ", страна сборки='" + productionCountry + '\'' +
                '}';
    }
}

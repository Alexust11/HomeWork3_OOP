package transport;

public class Car {
    private String brand;// марка
    private String model;// модель
    private float engineVolume;// объем двигателя
    private String color;// цвет
    private int productionYear;// год выпуска
    private String productionCountry;// страна производитель
    private String kpp;// кпп автомат/механика
    private String typeBody;// тип кузова
    private String regNumber;// рег.номер
    private int numberSeats; // количество мест
    private String tireSeason;//тип резины летняя/зимняя




    public Car(String brand, String model, float engineVolume, String color, int productionYear, String productionCountry, String kpp, String typeBody, String regNumber, int numberSeats, String tireSeason) {
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

        if (kpp == "") {
            this.kpp = "default";
        } else {
            this.kpp=kpp;
        }
        if (typeBody =="") {
            this.typeBody = "default";
        } else {
            this.typeBody =typeBody;
        }
        if (regNumber.length() != 9) {
            this.regNumber="Номер неустановленного образца";
        }
        char[] chars = regNumber.toCharArray();// объявляется массив типа char в который передаетя стока с рег.номеров.
        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5]) || !Character.isDigit(chars[1]) || !Character.isDigit(chars[2]) || !Character.isDigit(chars[3]) || !Character.isDigit(chars[6]) || !Character.isDigit(chars[7]) || !Character.isDigit(chars[8])) //проверяет если элемент массива типа char не букво
        {
            this.regNumber = "Номер неустановленного образца";
        } else {
            this.regNumber = regNumber;
        }
        if (numberSeats ==0) {
            this.numberSeats = 5;
        } else {
            this.numberSeats =numberSeats;
        }
        if (tireSeason =="") {
            this.tireSeason = "default";
        } else {
            this.tireSeason =tireSeason;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getTypeBody() {
        return typeBody;
    }

    public int getNumberSeats() {
        return numberSeats;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getKpp() {
        return kpp;
    }

    public void setKpp(String kpp) {
        this.kpp = kpp;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getTireSeason() {
        return tireSeason;
    }

    public void setTireSeason(String tireSeason) {
        this.tireSeason = tireSeason;
    }
    // метод смены резины
    public void changeTireSeason() {
        if (this.tireSeason == "летняя") {
            this.tireSeason = "зимняя";
        } else {
            this.tireSeason = "летняя";
        }
    }

    // проверка номера
    public boolean correctRegNumber() {
        if (regNumber.length() != 9) {
            return false;
            }
        char[] chars = regNumber.toCharArray();// объявляется массив типа char в который передаетя стока с рег.номеров.
        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])) //проверяет если элемент массива типа char не букво
        {
            return false;
        }
        // проверка элементов массива char если не цифра
        if (!Character.isDigit(chars[1]) || !Character.isDigit(chars[2]) || !Character.isDigit(chars[3]) || !Character.isDigit(chars[6]) || !Character.isDigit(chars[7]) || !Character.isDigit(chars[8])) {
            return false;
        }
        return true;
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
                ", тип кпп='" + kpp + '\'' +
                ", тип кузова='" + typeBody + '\'' +
                ", рег.номер='" + regNumber + '\'' +
                ", количество мест='" + numberSeats + '\'' +
                ", тип резины='" + tireSeason + '\'' +
                '}';
    }
}

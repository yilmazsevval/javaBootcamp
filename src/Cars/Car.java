package Cars;

public abstract class Car {
    private String brand;
    private String model;
    private String color;
    private int dailyPrice;
    private int monthlyPrice;

    public Car(String brand, String model, String color, int dailyPrice, int monthlyPrice) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.dailyPrice = dailyPrice;
        this.monthlyPrice = monthlyPrice;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDailyPrice() {
        return dailyPrice;
    }

    public void setDailyPrice(int dailyPrice) {
        this.dailyPrice = dailyPrice;
    }

    public int getMonthlyPrice(int monthlyPrice) {
        int total = dailyPrice *30;
        return total;
    }

    public void setMonthlyPrice(int monthlyPrice) {
        this.monthlyPrice = monthlyPrice;
    }

    public abstract int dailyPrice();

    public abstract int monthlyPrice();
}

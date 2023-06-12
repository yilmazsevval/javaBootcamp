package Cars;

import Payment.Payment;

public class Sedan extends Car {
    public Sedan(String brand, String model, String color, int dailyPrice, int monthlyPrice) {
        super(brand, model, color, dailyPrice, monthlyPrice);
    }

    @Override
    public int dailyPrice() {
        return Payment.SEDAN_PRICE;
    }

    @Override
    public int monthlyPrice() {
        return (dailyPrice() * 30);
    }

}

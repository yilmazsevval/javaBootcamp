package Cars;

import Payment.Payment;

public class Hatchback extends Car {
    public Hatchback(String brand, String model, String color, int dailyPrice, int monthlyPrice) {
        super(brand, model, color, dailyPrice, monthlyPrice);
    }

    @Override
    public int dailyPrice() {
        return Payment.HATCHBACK_PRICE;
    }

    @Override
    public int monthlyPrice() {
        return (dailyPrice() * 30);
    }

}

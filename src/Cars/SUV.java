package Cars;

import Payment.Payment;

public class SUV extends Car {

    public SUV(String brand, String model, String color, int dailyPrice, int monthlyPrice) {
        super(brand, model, color, dailyPrice, monthlyPrice);
    }

    @Override
    public int dailyPrice() {
        return Payment.SUV_PRICE;
    }

    @Override
    public int monthlyPrice() {
        return (dailyPrice() * 30);
    }

}

import Cars.*;
import User.*;
import Payment.Payment;

public class Main {
    public static void main(String[] args) {
        Sedan sedan = new Sedan("Toyota", "Camry", "Silver", 250, 6000);
        Hatchback hatchback = new Hatchback("Volkswagen", "Golf", "Blue", 200, 5000);
        SUV suv = new SUV("Ford", "Explorer", "Black", 300, 7000);

        System.out.println("Sedan Details:" +
                "\nBrand: " + sedan.getBrand() +
                "\nModel: " + sedan.getModel() +
                "\nColor: " + sedan.getColor() +
                "\nDaily Price: $" + sedan.getDailyPrice() +
                "\nMonthly Price: $" + sedan.getMonthlyPrice(0));

        System.out.println();

        System.out.println("Hatchback Details:" +
                "\nBrand: " + hatchback.getBrand() +
                "\nModel: " + hatchback.getModel() +
                "\nColor: " + hatchback.getColor() +
                "\nDaily Price: $" + hatchback.getDailyPrice() +
                "\nMonthly Price: $" + hatchback.getMonthlyPrice(0));

        System.out.println();

        System.out.println("SUV Details:" +
                "\nBrand: " + suv.getBrand() +
                "\nModel: " + suv.getModel() +
                "\nColor: " + suv.getColor() +
                "\nDaily Price: $" + suv.getDailyPrice() +
                "\nMonthly Price: $" + suv.getMonthlyPrice(0));

        System.out.println();

        Citizen citizen = new Citizen(1, "123456789", "Taylor", "Doe", "taylor@doe.com", "password123");
        Company company = new Company(2, "ABC Company", "Swift", "info@abccompany.com", "company123", "123456789");

        System.out.println("Citizen Details:" +
                "\nID: " + citizen.getId() +
                "\nName: " + citizen.getName() +
                "\nSurname: " + citizen.getSurname() +
                "\nEmail: " + citizen.getEmail() +
                "\nPassword: " + citizen.getPassword() +
                "\nTC No: " + citizen.getTcNo());

        System.out.println();

        System.out.println("Company Details:" +
                "\nID: " + company.getId() +
                "\nName: " + company.getName() +
                "\nSurname: " + company.getSurname() +
                "\nEmail: " + company.getEmail() +
                "\nPassword: " + company.getPassword() +
                "\nTax No: " + company.getTaxNo());
    }
}
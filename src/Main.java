import Cars.*;
import User.*;
import Payment.Payment;

public class Main {
    public static void main(String[] args) {
        Sedan sedan = new Sedan("Toyota", "Camry", "Silver", 250, 6000);
        Hatchback hatchback = new Hatchback("Volkswagen", "Golf", "Blue", 200, 5000);
        SUV suv = new SUV("Ford", "Explorer", "Black", 300, 7000);

        System.out.println("Sedan Details:");
        System.out.println("Brand: " + sedan.getBrand());
        System.out.println("Model: " + sedan.getModel());
        System.out.println("Color: " + sedan.getColor());
        System.out.println("Daily Price: $" + sedan.getDailyPrice());
        System.out.println("Monthly Price: $" + sedan.getMonthlyPrice(0));

        System.out.println();

        System.out.println("Hatchback Details:");
        System.out.println("Brand: " + hatchback.getBrand());
        System.out.println("Model: " + hatchback.getModel());
        System.out.println("Color: " + hatchback.getColor());
        System.out.println("Daily Price: $" + hatchback.getDailyPrice());
        System.out.println("Monthly Price: $" + hatchback.getMonthlyPrice(0));

        System.out.println();

        System.out.println("SUV Details:");
        System.out.println("Brand: " + suv.getBrand());
        System.out.println("Model: " + suv.getModel());
        System.out.println("Color: " + suv.getColor());
        System.out.println("Daily Price: $" + suv.getDailyPrice());
        System.out.println("Monthly Price: $" + suv.getMonthlyPrice(0));

        System.out.println();

        Citizen citizen = new Citizen(1, "123456789", "Taylor", "Doe", "taylor@doe.com", "password123");
        Company company = new Company(2, "ABC Company", "Swift", "info@abccompany.com", "company123", "123456789");

        System.out.println("Citizen Details:");
        System.out.println("ID: " + citizen.getId());
        System.out.println("Name: " + citizen.getName());
        System.out.println("Surname: " + citizen.getSurname());
        System.out.println("Email: " + citizen.getEmail());
        System.out.println("Password: " + citizen.getPassword());
        System.out.println("TC No: " + citizen.getTcNo());

        System.out.println();

        System.out.println("Company Details:");
        System.out.println("ID: " + company.getId());
        System.out.println("Name: " + company.getName());
        System.out.println("Surname: " + company.getSurname());
        System.out.println("Email: " + company.getEmail());
        System.out.println("Password: " + company.getPassword());
        System.out.println("Tax No: " + company.getTaxNo());
    }
}
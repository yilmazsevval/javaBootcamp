package User;

public class Company extends User {
    public String taxNo;

    public Company(int id, String name, String surname, String email, String password, String taxNo) {
        super(id, name, surname, email, password);
        this.taxNo = getTaxNo();
    }
    public String getTaxNo() {
        return taxNo;
    }

    public void setTaxNo(String taxNo) {
        this.taxNo = taxNo;
    }
}

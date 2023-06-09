package User;

public class Citizen extends User {
    private String tcNo;

    public Citizen(int id, String tcNo, String name, String surname, String email, String password) {
        super(id, name, surname, email, password);
        this.tcNo = tcNo;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

}

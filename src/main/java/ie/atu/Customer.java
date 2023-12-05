package ie.atu;

public class Customer extends Person {
    private String custNumber;
    private Boolean mail;

    public Customer() {
    }

    public Customer(String custNumber) {
        this.custNumber = custNumber;
    }

    public Customer(String name, String address, String number, String custNumber) {
        super(name, address, number);
        this.custNumber = custNumber;
    }

    public String getCustNumber() {
        return custNumber;
    }

    public void setCustNumber(String custNumber) {
        this.custNumber = custNumber;
    }

    public Boolean getMail() {
        return mail;
    }

    public void setMail(Boolean mail) {
        this.mail = mail;
    }
}

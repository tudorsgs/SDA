package Laborator_2.Problema3;

public class Customer {
    private Adress adress;
    private PaymentMethod paymentMethod;
    private String lastName;
    private String firstName;
    private int age;

    public Customer(Adress adress, PaymentMethod paymentMethod, String lastName, String firstName, int age) {
        this.adress = adress;
        this.paymentMethod = paymentMethod;
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
    }

    public Adress getAdress() {
        return adress;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public String getCompleteName(){
        return getFirstName()+" "+getLastName();
    }
}

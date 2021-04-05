package Laborator_2.Problema3;

public class Main {
    public static void main(String[] args) {
        Adress adress = new Adress("Podei","Sighisoara",33);
        PaymentMethod pm = new PaymentMethod("VISA");
        Customer c = new Customer(adress,pm,"Diaconescu","Tudor",22);
        System.out.println(c.getCompleteName());
        System.out.println(c.getAdress().getFullAdress());
        System.out.println(c.getPaymentMethod().getType());
        System.out.println(c.getFirstName()+" are "+c.getAge()+" ani.");
    }
}

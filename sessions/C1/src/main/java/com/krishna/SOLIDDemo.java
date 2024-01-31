package com.krishna;
interface PaymentGateway{
    boolean performPayment();
}
class UPIPayment implements PaymentGateway{
    @Override
    public boolean performPayment() {
        //business logic for UPI payment
        return false;
    }
}
class CCPayment implements PaymentGateway{
    @Override
    public boolean performPayment() {
        //business logic for CC payment
        return false;
    }
}
class CODPayment implements PaymentGateway{
    @Override
    public boolean performPayment() {
        //business logic for COD payment
        return false;
    }
}
class PaypalPayment implements PaymentGateway{
    @Override
    public boolean performPayment() {
        //implement Paypal
        return false;
    }
}
class PaymentGatewayFactory{
    public static PaymentGateway getPaymentGateway(String paymentChoice){
        switch (paymentChoice){
            case "UPI":
                return new UPIPayment();
            case "CC":
                return new CCPayment();
            case "COD":
                return new CODPayment();
            case "Paypal":
                return new PaypalPayment();
            default:
                System.out.println("Invalid choice");
        }
        return null;
    }
}
public class SOLIDDemo {
    public static void main(String[] args) {
        PaymentGateway pg = new CODPayment();
        pg.performPayment();
    }
}

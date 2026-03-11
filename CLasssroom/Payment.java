class Payment {
    void paymentMethod() {
        System.out.println("Payment by Cash");
    }
}

class UPI extends Payment {
    void paymentMethod() {
        System.out.println("Payment by UPI");
    }
}

class Cheque extends Payment {
    void paymentMethod() {
        System.out.println("Payment by Cheque");
    }
}

class NEFT extends Payment {
    void paymentMethod() {
        System.out.println("Payment by NEFT");
    }
}

public class Payment {
    public static void main(String[] args) {

        Payment p;

        p = new Payment();
        p.paymentMethod();

        p = new UPI();
        p.paymentMethod();

        p = new Cheque();
        p.paymentMethod();

        p = new NEFT();
        p.paymentMethod();
    }
}  





































}

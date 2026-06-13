import org.w3c.dom.ls.LSOutput;

import java.net.SocketTimeoutException;
import java.security.spec.RSAOtherPrimeInfo;

class Request {
    String name;
     String date;
     String reason;

    Request(String name, String date, String reason) {
        this.name = name;
        this.date = date;
        this.reason = reason;
    }

    void approve() {
        System.out.println("Approved");
    }

    void reject() {
        System.out.println("Rejected");
    }
}

class LeaveRequest extends Request {
    LeaveRequest(String name, String date, String reason) {
        super(name, date, reason);
    }
}
/*
class OnDutyRequest extends Request {
    OnDutyRequest(String name, String date, String reason) {
        super(name, date, reason);
    }
}

public class day7 {
    public static void main(String[] args) {

        LeaveRequest l = new LeaveRequest("supriya", "12-06-2026", "Sick Leave");
        System.out.println(l.name + " " + l.date + " " + l.reason);
        l.approve();

        OnDutyRequest o = new OnDutyRequest("surya", "13-06-2026", "Workshop");
        System.out.println(o.name + " " + o.date + " " + o.reason);
        o.reject();
    }
}
 */
/*
class Payment {
    void transfer(int amount) {
        System.out.println("Payment: " + amount);
    }
}

class UpiPayment extends Payment {
    void transfer(int amount) {
        System.out.println("UPI Payment: " + amount);
        System.out.println(" ");
    }
}

class CardPayment extends Payment {
    void transfer(int amount) {
        System.out.println("Card Payment: " + amount);
        System.out.println(" ");
    }
}

class NetBankingPayment extends Payment {
    void transfer(int amount) {
        System.out.println("Net Banking Payment: " + amount);
        System.out.println(" ");
    }
}

public class day7 {
    public static void main(String[] args) {
        Payment p;

        p = new UpiPayment();
        p.transfer(500);

        p = new CardPayment();
        p.transfer(1000);

        p = new NetBankingPayment();
        p.transfer(2000);
    }
}

 */

 public class day7 {
     static class Payment {
         int Amount;

         void transfer() {
             System.out.println("Amount is success");
         }
     }

     static class UPIPayment extends Payment {
         @Override
         void transfer() {
             System.out.println("UPIpayment is success");
         }
     }

     static class CardPayment extends Payment {
         @Override
         void transfer() {
             System.out.println("Cardpayment is success");
         }
     }

     static class NBPayment extends Payment {
         @Override
         void transfer() {
             System.out.println("NBpayment is success");
         }
     }

     public static void main(String[] args) {
         UPIPayment UPI = new UPIPayment();
         UPI.transfer();
         CardPayment Card = new CardPayment();
         Card.transfer();
         NBPayment NB = new NBPayment();
         NB.transfer();
         Payment Pay = new Payment();
         Pay.transfer();
     }
 }











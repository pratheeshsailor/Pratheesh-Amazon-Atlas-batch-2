// Interface for OTP notifications
interface BankNotifications2 {
    void sendOTP();
}

// Email notification implementation
class EmailNotify implements BankNotifications2 {
    public void sendOTP() {
        System.out.println("OTP sent to your email.");
    }
}

// SMS notification implementation
class MobileNotify implements BankNotifications2 {
    public void sendOTP() {
        System.out.println("OTP sent to your mobile.");
    }
}

// WhatsApp notification implementation
class WhatsappNotify implements BankNotifications2 {
    public void sendOTP() {
        System.out.println("OTP sent to your WhatsApp.");
    }
}

// Physical letter notification (extending system without modifying existing classes)
class PhysicalNotify implements BankNotifications2 {
    public void sendOTP() {
        System.out.println("OTP sent via physical mail.");
    }
}

// Main class to use any notification
public class OCP_Example {
    public static void main(String[] args) {
        BankNotifications2 notify1 = new EmailNotify();
        BankNotifications2 notify2 = new MobileNotify();
        BankNotifications2 notify3 = new WhatsappNotify();
        BankNotifications2 notify4 = new PhysicalNotify();

        notify1.sendOTP();
        notify2.sendOTP();
        notify3.sendOTP();
        notify4.sendOTP();
    }
}

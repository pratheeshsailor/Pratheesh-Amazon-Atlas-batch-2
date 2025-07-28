public class BankNotifications {
    public void sendOTP(String via) {
        if (via.equals("email")) {
            System.out.println("Email sent to your mail ID");
        } else if (via.equals("sms")) {
            System.out.println("OTP sent via SMS");
        } else if (via.equals("whatsapp")) {
            System.out.println("OTP sent via WhatsApp");
        }
    }

    public static void main(String[] args) {
        BankNotifications notify = new BankNotifications();
        notify.sendOTP("email");
        notify.sendOTP("sms");
        notify.sendOTP("whatsapp");
    }
}

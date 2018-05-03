package poly;

public class Main {

    public static void main(String[] args) {
//        poly.MessageSender messageSender = new poly.MessageSender();
//        messageSender.setFrom("ali");
//        messageSender.setTo("ismail");
//        messageSender.setMsg("hey bro!!");

//        messageSender.sendMessage();

//        poly.SMSSender smsSender = new poly.SMSSender("b", "a", "oke");
//        poly.EmailSender emailSender = new poly.EmailSender("a@gmail.com", "b@gmail.com", "hello");

        MessageSender[] messageSenders = new MessageSender[2];
        messageSenders[0] = new SMSSender("08123","089765", "Hey love!");
        messageSenders[1] = new EmailSender("b@gmail.com","a@gmail.com", "good night!", "my sbj");

        for (int i = 0; i < messageSenders.length; i++) {
            messageSenders[i].sendMessage();
        }
    }
}

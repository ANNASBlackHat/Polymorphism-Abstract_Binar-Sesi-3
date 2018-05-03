package poly;

public class EmailSender extends MessageSender {

    private String subject;

    public EmailSender(String to, String from, String msg, String subject) {
        super(to, from, msg);
        this.subject = subject;
    }

    @Override
    void sendMessage() {
        //....
        System.out.println(String.format("Mengirim EMAIL dari %s ke %s. Subject : %s Pesan : %s",
                getFrom(), getTo(), subject, getMsg()));
    }
}

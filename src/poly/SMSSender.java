package poly;

public class SMSSender extends MessageSender {

    public SMSSender(String to, String from, String msg) {
        super(to, from, msg);
    }

    @Override
    void sendMessage() {
        //doing complex stuf...
        System.out.println(String.format("Mengirim SMS dari %s ke %s. Pesan : %s", getFrom(), getTo(), getMsg()));
    }
}

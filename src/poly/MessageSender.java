package poly;

public class MessageSender {
    private String to;
    private String from;
    private String msg;

    public MessageSender(String to, String from, String msg) {
        this.to = to;
        this.from = from;
        this.msg = msg;
    }

    void sendMessage(){
        //melakukan proses pengiriman pesan dengan code yg kompleks
        System.out.println(String.format("Mengirim pesan dari %s ke %s dengan pesan : %s", from, to, msg));
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

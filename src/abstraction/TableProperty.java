package abstraction;

public class TableProperty {
    private String warna;
    private String type; //bold //italic //reguler
    private int fontSize;

    public TableProperty(String warna, String type, int fontSize) {
        this.warna = warna;
        this.type = type;
        this.fontSize = fontSize;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }
}

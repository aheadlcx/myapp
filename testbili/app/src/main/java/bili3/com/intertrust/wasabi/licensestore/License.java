package bili3.com.intertrust.wasabi.licensestore;

/* compiled from: BL */
public class License {
    private String data;
    private int expirationData;
    private int id;
    private int insertionDate;
    private int priority;
    private String tag;

    private static String snippet(String str) {
        if (str.length() > 100) {
            return str.substring(0, 20) + "..." + str.substring(str.length() - 20);
        }
        return str;
    }

    public String toString() {
        return ((((("License=\n" + "\tid=" + this.id + "\n") + "\tdata=" + snippet(this.data)) + "\texpirationData=" + this.expirationData + "\n") + "\tpriority=" + this.priority + "\n") + "\tinsertionDate=" + this.insertionDate + "\n") + "\ttag=" + this.tag + "\n";
    }

    public License(int i, String str, int i2, int i3, int i4, String str2) {
        this.id = i;
        this.data = str;
        this.expirationData = i2;
        this.priority = i3;
        this.insertionDate = i4;
        this.tag = str2;
    }

    public int getId() {
        return this.id;
    }

    public String getData() {
        return this.data;
    }

    public int getExpirationData() {
        return this.expirationData;
    }

    public int getPriority() {
        return this.priority;
    }

    public int getInsertionDate() {
        return this.insertionDate;
    }

    public String getTag() {
        return this.tag;
    }
}

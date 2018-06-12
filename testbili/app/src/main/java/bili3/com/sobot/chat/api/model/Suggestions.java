package bili3.com.sobot.chat.api.model;

import java.io.Serializable;

/* compiled from: BL */
public class Suggestions implements Serializable {
    private String answer;
    private String docId;
    private String question;

    public String a() {
        return this.question;
    }

    public void a(String str) {
        this.question = str;
    }

    public String b() {
        return this.docId;
    }

    public void b(String str) {
        this.docId = str;
    }

    public void c(String str) {
        this.answer = str;
    }

    public String toString() {
        return "Suggestions{question='" + this.question + '\'' + ", docId='" + this.docId + '\'' + ", answer='" + this.answer + '\'' + '}';
    }
}

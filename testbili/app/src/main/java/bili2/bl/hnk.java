package bili2.bl;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: BL */
class hnk implements XmlSerializer {
    private static final String[] a = new String[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "&quot;", null, null, null, "&amp;", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "&lt;", null, "&gt;", null};
    private static String b = "                                                              ";
    private final char[] c = new char[8192];
    private int d;
    private Writer e;
    private OutputStream f;
    private CharsetEncoder g;
    private ByteBuffer h = ByteBuffer.allocate(8192);
    private boolean i = false;
    private boolean j;
    private int k = 0;
    private boolean l = true;

    hnk() {
    }

    private void a(char c) throws IOException {
        int i = this.d;
        if (i >= 8191) {
            flush();
            i = this.d;
        }
        this.c[i] = c;
        this.d = i + 1;
    }

    private void a(String str, int i, int i2) throws IOException {
        if (i2 > 8192) {
            int i3 = i + i2;
            while (i < i3) {
                int i4 = i + 8192;
                a(str, i, i4 < i3 ? 8192 : i3 - i);
                i = i4;
            }
            return;
        }
        int i5 = this.d;
        if (i5 + i2 > 8192) {
            flush();
            i5 = this.d;
        }
        str.getChars(i, i + i2, this.c, i5);
        this.d = i5 + i2;
    }

    private void a(char[] cArr, int i, int i2) throws IOException {
        if (i2 > 8192) {
            int i3 = i + i2;
            while (i < i3) {
                int i4 = i + 8192;
                a(cArr, i, i4 < i3 ? 8192 : i3 - i);
                i = i4;
            }
            return;
        }
        int i5 = this.d;
        if (i5 + i2 > 8192) {
            flush();
            i5 = this.d;
        }
        System.arraycopy(cArr, i, this.c, i5, i2);
        this.d = i5 + i2;
    }

    private void a(String str) throws IOException {
        a(str, 0, str.length());
    }

    private void a(int i) throws IOException {
        int i2 = i * 4;
        if (i2 > b.length()) {
            i2 = b.length();
        }
        a(b, 0, i2);
    }

    private void b(String str) throws IOException {
        int i = 0;
        int length = str.length();
        char length2 = (char) a.length;
        String[] strArr = a;
        int i2 = 0;
        while (i2 < length) {
            char charAt = str.charAt(i2);
            if (charAt < length2) {
                String str2 = strArr[charAt];
                if (str2 != null) {
                    if (i < i2) {
                        a(str, i, i2 - i);
                    }
                    i = i2 + 1;
                    a(str2);
                }
            }
            i2++;
        }
        if (i < i2) {
            a(str, i, i2 - i);
        }
    }

    private void b(char[] cArr, int i, int i2) throws IOException {
        char length = (char) a.length;
        String[] strArr = a;
        int i3 = i + i2;
        int i4 = i;
        while (i < i3) {
            char c = cArr[i];
            if (c < length) {
                String str = strArr[c];
                if (str != null) {
                    if (i4 < i) {
                        a(cArr, i4, i - i4);
                    }
                    i4 = i + 1;
                    a(str);
                }
            }
            i++;
        }
        if (i4 < i) {
            a(cArr, i4, i - i4);
        }
    }

    public XmlSerializer attribute(String str, String str2, String str3) throws IOException, IllegalArgumentException, IllegalStateException {
        a(' ');
        if (str != null) {
            a(str);
            a(':');
        }
        a(str2);
        a("=\"");
        b(str3);
        a('\"');
        this.l = false;
        return this;
    }

    public void cdsect(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    public void comment(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    public void docdecl(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    public void endDocument() throws IOException, IllegalArgumentException, IllegalStateException {
        flush();
    }

    public XmlSerializer endTag(String str, String str2) throws IOException, IllegalArgumentException, IllegalStateException {
        this.k--;
        if (this.j) {
            a(" />\n");
        } else {
            if (this.i && this.l) {
                a(this.k);
            }
            a("</");
            if (str != null) {
                a(str);
                a(':');
            }
            a(str2);
            a(">\n");
        }
        this.l = true;
        this.j = false;
        return this;
    }

    public void entityRef(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    private void a() throws IOException {
        int position = this.h.position();
        if (position > 0) {
            this.h.flip();
            this.f.write(this.h.array(), 0, position);
            this.h.clear();
        }
    }

    public void flush() throws IOException {
        if (this.d > 0) {
            if (this.f != null) {
                CharBuffer wrap = CharBuffer.wrap(this.c, 0, this.d);
                CoderResult encode = this.g.encode(wrap, this.h, true);
                while (!encode.isError()) {
                    if (encode.isOverflow()) {
                        a();
                        encode = this.g.encode(wrap, this.h, true);
                    } else {
                        a();
                        this.f.flush();
                    }
                }
                throw new IOException(encode.toString());
            }
            this.e.write(this.c, 0, this.d);
            this.e.flush();
            this.d = 0;
        }
    }

    public int getDepth() {
        throw new UnsupportedOperationException();
    }

    public boolean getFeature(String str) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        throw new UnsupportedOperationException();
    }

    public String getNamespace() {
        throw new UnsupportedOperationException();
    }

    public String getPrefix(String str, boolean z) throws IllegalArgumentException {
        throw new UnsupportedOperationException();
    }

    public Object getProperty(String str) {
        throw new UnsupportedOperationException();
    }

    public void ignorableWhitespace(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    public void processingInstruction(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    public void setFeature(String str, boolean z) throws IllegalArgumentException, IllegalStateException {
        if (str.equals("http://xmlpull.org/v1/doc/features.html#indent-output")) {
            this.i = true;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public void setOutput(OutputStream outputStream, String str) throws IOException, IllegalArgumentException, IllegalStateException {
        if (outputStream == null) {
            throw new IllegalArgumentException();
        }
        try {
            this.g = Charset.forName(str).newEncoder();
            this.f = outputStream;
        } catch (Throwable e) {
            throw ((UnsupportedEncodingException) new UnsupportedEncodingException(str).initCause(e));
        } catch (Throwable e2) {
            throw ((UnsupportedEncodingException) new UnsupportedEncodingException(str).initCause(e2));
        }
    }

    public void setOutput(Writer writer) throws IOException, IllegalArgumentException, IllegalStateException {
        this.e = writer;
    }

    public void setPrefix(String str, String str2) throws IOException, IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    public void setProperty(String str, Object obj) throws IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    public void startDocument(String str, Boolean bool) throws IOException, IllegalArgumentException, IllegalStateException {
        a("<?xml version='1.0' encoding='utf-8' standalone='" + (bool.booleanValue() ? "yes" : "no") + "' ?>\n");
        this.l = true;
    }

    public XmlSerializer startTag(String str, String str2) throws IOException, IllegalArgumentException, IllegalStateException {
        if (this.j) {
            a(">\n");
        }
        if (this.i) {
            a(this.k);
        }
        this.k++;
        a('<');
        if (str != null) {
            a(str);
            a(':');
        }
        a(str2);
        this.j = true;
        this.l = false;
        return this;
    }

    public XmlSerializer text(char[] cArr, int i, int i2) throws IOException, IllegalArgumentException, IllegalStateException {
        boolean z = false;
        if (this.j) {
            a(">");
            this.j = false;
        }
        b(cArr, i, i2);
        if (this.i) {
            if (cArr[(i + i2) - 1] == '\n') {
                z = true;
            }
            this.l = z;
        }
        return this;
    }

    public XmlSerializer text(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        boolean z = false;
        if (this.j) {
            a(">");
            this.j = false;
        }
        b(str);
        if (this.i) {
            if (str.length() > 0 && str.charAt(str.length() - 1) == '\n') {
                z = true;
            }
            this.l = z;
        }
        return this;
    }
}

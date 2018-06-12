package bili4.tv.danmaku.frontia.ext;

import android.content.Context;
import bl.mrm;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import tv.danmaku.frontia.SoLibPlugin;

/* compiled from: BL */
public class ShareLibrary {

    /* compiled from: BL */
    public interface SoLibBehavior extends mrm {
        Set<File> getLibrary();

        void loadLibrary();
    }

    /* compiled from: BL */
    public static class a extends SoLibPlugin<SoLibBehavior> {
        public /* synthetic */ mrm createBehavior(Context context) throws Exception {
            return a(context);
        }

        public a(String str) {
            super(str);
        }

        public SoLibBehavior a(Context context) {
            return new ShareLibrary$SoLibPackage$1(this);
        }

        protected void installSoLib(Context context, File file, File file2) throws IOException {
            super.installSoLib(context, file, file2);
            this.mSoLibDir = null;
        }
    }
}

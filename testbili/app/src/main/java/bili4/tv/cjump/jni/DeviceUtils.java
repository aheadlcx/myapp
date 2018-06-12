package bili4.tv.cjump.jni;

import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Log;
import bl.ibn;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import u.aly.dd;
import u.aly.j;

/* compiled from: BL */
public class DeviceUtils {
    private static ARCH a = ARCH.Unknown;

    /* compiled from: BL */
    public enum ARCH {
        Unknown,
        ARM,
        X86,
        MIPS,
        ARM64
    }

    public static synchronized ARCH a() {
        RandomAccessFile randomAccessFile;
        Throwable e;
        ARCH arch;
        synchronized (DeviceUtils.class) {
            byte[] bArr = new byte[20];
            File file = new File(Environment.getRootDirectory(), "lib/libc.so");
            if (file.canRead()) {
                try {
                    randomAccessFile = new RandomAccessFile(file, "r");
                    try {
                        randomAccessFile.readFully(bArr);
                        int i = bArr[18] | (bArr[19] << 8);
                        switch (i) {
                            case dd.d /*3*/:
                                a = ARCH.X86;
                                break;
                            case j.f /*8*/:
                                a = ARCH.MIPS;
                                break;
                            case 40:
                                a = ARCH.ARM;
                                break;
                            case 183:
                                a = ARCH.ARM64;
                                break;
                            default:
                                Log.e("NativeBitmapFactory", "libc.so is unknown arch: " + Integer.toHexString(i));
                                break;
                        }
                        if (randomAccessFile != null) {
                            try {
                                randomAccessFile.close();
                            } catch (Throwable e2) {
                                ibn.a(e2);
                            }
                        }
                    } catch (FileNotFoundException e3) {
                        e2 = e3;
                        try {
                            ibn.a(e2);
                            if (randomAccessFile != null) {
                                try {
                                    randomAccessFile.close();
                                } catch (Throwable e22) {
                                    ibn.a(e22);
                                }
                            }
                            arch = a;
                            return arch;
                        } catch (Throwable th) {
                            e22 = th;
                            if (randomAccessFile != null) {
                                try {
                                    randomAccessFile.close();
                                } catch (Throwable e4) {
                                    ibn.a(e4);
                                }
                            }
                            throw e22;
                        }
                    } catch (IOException e5) {
                        e22 = e5;
                        ibn.a(e22);
                        if (randomAccessFile != null) {
                            try {
                                randomAccessFile.close();
                            } catch (Throwable e222) {
                                ibn.a(e222);
                            }
                        }
                        arch = a;
                        return arch;
                    }
                } catch (FileNotFoundException e6) {
                    e222 = e6;
                    randomAccessFile = null;
                    ibn.a(e222);
                    if (randomAccessFile != null) {
                        randomAccessFile.close();
                    }
                    arch = a;
                    return arch;
                } catch (IOException e7) {
                    e222 = e7;
                    randomAccessFile = null;
                    ibn.a(e222);
                    if (randomAccessFile != null) {
                        randomAccessFile.close();
                    }
                    arch = a;
                    return arch;
                } catch (Throwable th2) {
                    e222 = th2;
                    randomAccessFile = null;
                    if (randomAccessFile != null) {
                        randomAccessFile.close();
                    }
                    throw e222;
                }
            }
            arch = a;
        }
        return arch;
    }

    public static String b() {
        return Build.CPU_ABI;
    }

    public static String c() {
        try {
            Field declaredField = Build.class.getDeclaredField("CPU_ABI2");
            if (declaredField == null) {
                return null;
            }
            Object obj = declaredField.get(null);
            if (obj instanceof String) {
                return (String) obj;
            }
            return null;
        } catch (Exception e) {
            return null;
        }
    }

    public static boolean a(String str) {
        String b = b();
        if (!TextUtils.isEmpty(b) && b.equalsIgnoreCase(str)) {
            return true;
        }
        if (TextUtils.isEmpty(c()) || !b.equalsIgnoreCase(str)) {
            return false;
        }
        return true;
    }

    public static boolean d() {
        return Build.MANUFACTURER.equalsIgnoreCase("Xiaomi") && Build.PRODUCT.equalsIgnoreCase("dredd");
    }

    public static boolean e() {
        return Build.MANUFACTURER.equalsIgnoreCase("MagicBox") && Build.PRODUCT.equalsIgnoreCase("MagicBox");
    }

    public static boolean f() {
        return d() || e();
    }

    public static boolean g() {
        return (a(AbiUtils.ABI_ARMv7a) || a(AbiUtils.ABI_ARM)) && ARCH.ARM.equals(a());
    }

    public static boolean h() {
        return a(AbiUtils.ABI_X86) || ARCH.X86.equals(a());
    }
}

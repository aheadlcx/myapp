package bili.bl;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.support.graphics.drawable.animated.BuildConfig;
import android.util.Base64;
import com.bilibili.bilibililive.ui.common.data.CameraConfigurationModel;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

/* compiled from: BL */
public class cij {
    private static final String a = hae.a(new byte[]{(byte) 102, (byte) 100, (byte) 104, (byte) 96, (byte) 119, (byte) 100, (byte) 70, (byte) 106, (byte) 107, (byte) 99, (byte) 108, (byte) 98, (byte) 112, (byte) 119, (byte) 100, (byte) 113, (byte) 108, (byte) 106, (byte) 107});
    private Context b;

    public cij(Context context) {
        this.b = context;
    }

    public void a(long j, int i) throws Exception {
        Serializable a = a(j);
        a.cameraOrantation = i;
        a(String.valueOf(j), a);
    }

    public void b(long j, int i) throws Exception {
        Serializable a = a(j);
        a.screenOrantation = i;
        a(String.valueOf(j), a);
    }

    public void a(long j, int i, boolean z) throws Exception {
        Serializable a = a(j);
        a.beautyLevel = i;
        a.firstUseBeauty = z;
        a(String.valueOf(j), a);
    }

    public void a(long j, boolean z) throws Exception {
        Serializable a = a(j);
        a.isVerticalDanmaku = z;
        a(String.valueOf(j), a);
    }

    public void a(long j, String str, int i) throws Exception {
        Serializable a = a(j);
        if (str.equals(hae.a(new byte[]{(byte) 97, (byte) 100, (byte) 107, (byte) 104, (byte) 112, (byte) 81, (byte) 96, (byte) 125, (byte) 113, (byte) 86, (byte) 108, Byte.MAX_VALUE, (byte) 96}))) {
            a.danmuTextViewSize = i;
        } else if (str.equals(hae.a(new byte[]{(byte) 97, (byte) 100, (byte) 107, (byte) 104, (byte) 112, (byte) 81, (byte) 96, (byte) 125, (byte) 113, (byte) 105, (byte) 117, (byte) 109, (byte) 100}))) {
            a.danmuTextViewAlpha = i;
        } else if (str.equals(hae.a(new byte[]{(byte) 97, (byte) 100, (byte) 107, (byte) 104, (byte) 112, (byte) 86, (byte) 117, (byte) 96, (byte) 96, (byte) 97}))) {
            a.danmuTextViewSpeed = i;
        }
        a(String.valueOf(j), a);
    }

    public CameraConfigurationModel a(long j) {
        Object a = a(String.valueOf(j));
        if (a != null) {
            return (CameraConfigurationModel) a;
        }
        return new CameraConfigurationModel(0, 1, 0, 50, 100, 50);
    }

    public void a(String str, Serializable serializable) throws Exception {
        Throwable th;
        ObjectOutputStream objectOutputStream = null;
        ObjectOutputStream objectOutputStream2;
        try {
            OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream2.writeObject(serializable);
                byte[] toByteArray = byteArrayOutputStream.toByteArray();
                Editor edit = this.b.getSharedPreferences(hae.a(new byte[]{(byte) 102, (byte) 100, (byte) 104, (byte) 96, (byte) 119, (byte) 100, (byte) 70, (byte) 106, (byte) 107, (byte) 99, (byte) 108, (byte) 98, (byte) 112, (byte) 119, (byte) 100, (byte) 113, (byte) 108, (byte) 106, (byte) 107}), 0).edit();
                edit.putString(str, Base64.encodeToString(toByteArray, 0));
                edit.apply();
                try {
                    objectOutputStream2.close();
                } catch (IOException e) {
                }
            } catch (Exception e2) {
                try {
                    throw new Exception(hae.a(new byte[]{(byte) -21, (byte) -80, (byte) -110, (byte) -22, (byte) -94, (byte) -105, (byte) -23, (byte) -102, (byte) -65, (byte) -23, (byte) -126, (byte) -95, (byte) -22, (byte) -85, (byte) -66, (byte) -25, (byte) -69, (byte) -86}));
                } catch (Throwable th2) {
                    Throwable th3 = th2;
                    objectOutputStream = objectOutputStream2;
                    th = th3;
                    try {
                        objectOutputStream.close();
                    } catch (IOException e3) {
                    }
                    throw th;
                }
            }
        } catch (Exception e4) {
            objectOutputStream2 = null;
            throw new Exception(hae.a(new byte[]{(byte) -21, (byte) -80, (byte) -110, (byte) -22, (byte) -94, (byte) -105, (byte) -23, (byte) -102, (byte) -65, (byte) -23, (byte) -126, (byte) -95, (byte) -22, (byte) -85, (byte) -66, (byte) -25, (byte) -69, (byte) -86}));
        } catch (Throwable th4) {
            th = th4;
            objectOutputStream.close();
            throw th;
        }
    }

    public Object a(String str) {
        ByteArrayInputStream byteArrayInputStream;
        ObjectInputStream objectInputStream;
        Object readObject;
        Throwable th;
        InputStream inputStream;
        InputStream inputStream2 = null;
        byte[] decode = Base64.decode(this.b.getSharedPreferences(hae.a(new byte[]{(byte) 102, (byte) 100, (byte) 104, (byte) 96, (byte) 119, (byte) 100, (byte) 70, (byte) 106, (byte) 107, (byte) 99, (byte) 108, (byte) 98, (byte) 112, (byte) 119, (byte) 100, (byte) 113, (byte) 108, (byte) 106, (byte) 107}), 0).getString(str, BuildConfig.VERSION_NAME), 0);
        if (decode != null) {
            try {
                byteArrayInputStream = new ByteArrayInputStream(decode);
                try {
                    objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        readObject = objectInputStream.readObject();
                        if (byteArrayInputStream != null) {
                            try {
                                byteArrayInputStream.close();
                            } catch (Throwable e) {
                                ibn.a(e);
                            }
                        }
                        if (objectInputStream != null) {
                            try {
                                objectInputStream.close();
                            } catch (Throwable e2) {
                                ibn.a(e2);
                            }
                        }
                    } catch (Exception e3) {
                        if (byteArrayInputStream != null) {
                            try {
                                byteArrayInputStream.close();
                            } catch (Throwable e4) {
                                ibn.a(e4);
                            }
                        }
                        if (objectInputStream != null) {
                            try {
                                objectInputStream.close();
                            } catch (Throwable e22) {
                                ibn.a(e22);
                            }
                        }
                        return readObject;
                    } catch (Throwable th2) {
                        th = th2;
                        if (byteArrayInputStream != null) {
                            try {
                                byteArrayInputStream.close();
                            } catch (Throwable e42) {
                                ibn.a(e42);
                            }
                        }
                        if (objectInputStream != null) {
                            try {
                                objectInputStream.close();
                            } catch (Throwable e222) {
                                ibn.a(e222);
                            }
                        }
                        throw th;
                    }
                } catch (Exception e5) {
                    inputStream = inputStream2;
                    if (byteArrayInputStream != null) {
                        byteArrayInputStream.close();
                    }
                    if (objectInputStream != null) {
                        objectInputStream.close();
                    }
                    return readObject;
                } catch (Throwable e2222) {
                    Throwable th3 = e2222;
                    inputStream = inputStream2;
                    th = th3;
                    if (byteArrayInputStream != null) {
                        byteArrayInputStream.close();
                    }
                    if (objectInputStream != null) {
                        objectInputStream.close();
                    }
                    throw th;
                }
            } catch (Exception e6) {
                objectInputStream = inputStream2;
                byteArrayInputStream = inputStream2;
                if (byteArrayInputStream != null) {
                    byteArrayInputStream.close();
                }
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
                return readObject;
            } catch (Throwable e22222) {
                byteArrayInputStream = inputStream2;
                InputStream inputStream3 = inputStream2;
                th = e22222;
                objectInputStream = inputStream3;
                if (byteArrayInputStream != null) {
                    byteArrayInputStream.close();
                }
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
                throw th;
            }
        }
        return readObject;
    }
}

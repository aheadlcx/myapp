package bili4.tv.danmaku.ijk.media.player;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: BL */
public interface IIjkMediaPlayerService extends IInterface {

    /* compiled from: BL */
    public static abstract class Stub extends Binder implements IIjkMediaPlayerService {
        private static final String DESCRIPTOR = "tv.danmaku.ijk.media.player.IIjkMediaPlayerService";
        static final int TRANSACTION_create = 1;
        static final int TRANSACTION_removeClient = 2;

        /* compiled from: BL */
        static class Proxy implements IIjkMediaPlayerService {
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            public IIjkMediaPlayer create(int i, IIjkMediaPlayerClient iIjkMediaPlayerClient) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeStrongBinder(iIjkMediaPlayerClient != null ? iIjkMediaPlayerClient.asBinder() : null);
                    this.mRemote.transact(Stub.TRANSACTION_create, obtain, obtain2, 0);
                    obtain2.readException();
                    IIjkMediaPlayer asInterface = tv.danmaku.ijk.media.player.IIjkMediaPlayer.Stub.asInterface(obtain2.readStrongBinder());
                    return asInterface;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void removeClient(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    this.mRemote.transact(Stub.TRANSACTION_removeClient, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IIjkMediaPlayerService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IIjkMediaPlayerService)) {
                return new Proxy(iBinder);
            }
            return (IIjkMediaPlayerService) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            switch (i) {
                case TRANSACTION_create /*1*/:
                    parcel.enforceInterface(DESCRIPTOR);
                    IIjkMediaPlayer create = create(parcel.readInt(), tv.danmaku.ijk.media.player.IIjkMediaPlayerClient.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeStrongBinder(create != null ? create.asBinder() : null);
                    return true;
                case TRANSACTION_removeClient /*2*/:
                    parcel.enforceInterface(DESCRIPTOR);
                    removeClient(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString(DESCRIPTOR);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    IIjkMediaPlayer create(int i, IIjkMediaPlayerClient iIjkMediaPlayerClient) throws RemoteException;

    void removeClient(int i) throws RemoteException;
}

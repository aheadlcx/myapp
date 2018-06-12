package bili.android.support.v4.view;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/* compiled from: BL */
public abstract class AbsSavedState implements Parcelable {
    public static final Creator<android.support.v4.view.AbsSavedState> CREATOR = new ClassLoaderCreator<android.support.v4.view.AbsSavedState>() {
        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return a(parcel, classLoader);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return a(i);
        }

        public android.support.v4.view.AbsSavedState a(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return android.support.v4.view.AbsSavedState.EMPTY_STATE;
            }
            throw new IllegalStateException("superState must be null");
        }

        public android.support.v4.view.AbsSavedState a(Parcel parcel) {
            return a(parcel, null);
        }

        public android.support.v4.view.AbsSavedState[] a(int i) {
            return new android.support.v4.view.AbsSavedState[i];
        }
    };
    public static final android.support.v4.view.AbsSavedState EMPTY_STATE = new android.support.v4.view.AbsSavedState() {
    };
    private final Parcelable a;

    private AbsSavedState() {
        this.a = null;
    }

    protected AbsSavedState(@NonNull Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        if (parcelable == EMPTY_STATE) {
            parcelable = null;
        }
        this.a = parcelable;
    }

    protected AbsSavedState(@NonNull Parcel parcel, @Nullable ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        if (readParcelable == null) {
            readParcelable = EMPTY_STATE;
        }
        this.a = readParcelable;
    }

    @Nullable
    public final Parcelable getSuperState() {
        return this.a;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }
}

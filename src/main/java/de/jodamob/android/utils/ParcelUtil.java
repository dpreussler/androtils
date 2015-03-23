package de.jodamob.android.utils;

import android.os.Parcel;

import java.util.Date;

public class ParcelUtil {

    public static void writeDate(Date date, Parcel parcel) {
        parcel.writeLong(date.getTime());
    }

    public static Date readDate(Parcel in) {
        return new Date(in.readLong());
    }


    public static void writeBoolean(boolean value, Parcel parcel) {
        parcel.writeByte(value ? (byte) 1 : (byte) 0);
    }

    public static boolean readBoolean(Parcel in) {
        return in.readByte() != 0;
    }
}

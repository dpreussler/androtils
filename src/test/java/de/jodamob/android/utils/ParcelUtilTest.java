package de.jodamob.android.utils;

import android.os.Parcel;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(RobolectricTestRunner.class)
public class ParcelUtilTest {

    Parcel parcel = mock(Parcel.class);

    @Test
    public void should_write_true() {
        ParcelUtil.writeBoolean(true, parcel);
        verify(parcel).writeByte((byte) 1);
    }

    @Test
    public void should_write_false() {
        ParcelUtil.writeBoolean(false, parcel);
        verify(parcel).writeByte((byte) 0);
    }

    @Test
    public void should_read_true() {
        when(parcel.readByte()).thenReturn((byte) 1);
        assertTrue(ParcelUtil.readBoolean(parcel));
    }

    @Test
    public void should_read_false() {
        assertFalse(ParcelUtil.readBoolean(parcel));
    }

    @Test
    public void should_write_date() {
        Date date = new Date();
        ParcelUtil.writeDate(date, parcel);
        verify(parcel).writeLong(date.getTime());
    }

    @Test
    public void should_read_date() {
        Date date = new Date();
        when(parcel.readLong()).thenReturn(date.getTime());
        assertEquals(date, ParcelUtil.readDate(parcel));
    }
}

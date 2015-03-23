package de.jodamob.android.utils;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.widget.TextView;
import org.robolectric.RobolectricTestRunner;
import org.junit.Test;
import org.junit.Before;
import org.junit.runner.RunWith;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(RobolectricTestRunner.class)
public class ColorUtilTest {

    Resources resources = mock(Resources.class);
    TextView textView1 = mock(TextView.class);
    TextView textView2 = mock(TextView.class);
    
    @Before
    public void setup() {
	    when(textView1.getResources()).thenReturn(resources);
 	    when(textView2.getResources()).thenReturn(resources);
    }

    @SuppressLint("ResourceAsColor")
    @Test
    public void should_color_all_elements() {
        ColorUtil.setTextColor(android.R.color.black, new TextView[]{textView1, textView2});
        verify(textView1).setTextColor(anyInt());
        verify(textView2).setTextColor(anyInt());
    }

    @SuppressLint("ResourceAsColor")
    @Test
    public void should_handle_empty_list() {
        ColorUtil.setTextColor(android.R.color.black, new TextView[]{});
    }
}

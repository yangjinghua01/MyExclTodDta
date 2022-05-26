package com.example.myexcltoddta;

import org.junit.Test;

import static org.junit.Assert.*;

import android.os.Environment;

import com.alibaba.excel.EasyExcel;

import java.io.IOException;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }
    @Test
    public void readdata() throws IOException {
        String absolutePath = Environment.getExternalStoragePublicDirectory(
                Environment.DIRECTORY_DOWNLOADS).getAbsolutePath()+ "/Detonator_Data.xlsx";
        EasyExcel.read(absolutePath, DetonatorData.class, new DetonatorDataListener()).sheet().doRead();
    }
    @Test
    public void  say(){
        System.out.println("adf");
    }
}
package com.example.myexcltoddta;
import android.os.Environment;

import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Viewmodel extends ViewModel implements LifecycleObserver {
    public MutableLiveData<List<DetonatorData>> listLiveDatalist = new MutableLiveData<>();
    public MutableLiveData<List<DetonatorData>>getListLiveDatalist = new MutableLiveData<>();
    //    加载数据
    public void getdata() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                List<DetonatorData> loadall = DaoUtils.loadall();
                getListLiveDatalist.postValue(loadall);
            }
        }).start();
    }
    //    入库
    public void readExcel() {
        String absolutePath = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath() + "/Detonator_Data.xls";
        HSSFWorkbook wb = null;
        try {
            wb = new HSSFWorkbook(new FileInputStream(new File(absolutePath)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        assert wb != null;
        HSSFSheet sheet = wb.getSheetAt(0);
        List<DetonatorData> list = new ArrayList<>();
        for (int i = 1; i < sheet.getLastRowNum(); i++) {
            Long id = Long.valueOf(i);
            String detonator = sheet.getRow(i).getCell(0).toString();
            String uid = sheet.getRow(i).getCell(1).toString();
            String area = sheet.getRow(i).getCell(2).toString();
            String group = sheet.getRow(i).getCell(3).toString();
            String line = sheet.getRow(i).getCell(4).toString();
            String hole = sheet.getRow(i).getCell(5).toString();
            String position = sheet.getRow(i).getCell(6).toString();
            String delay = sheet.getRow(i).getCell(7).toString();
            String reserved1 = sheet.getRow(i).getCell(8).toString();
            String reserved2 = sheet.getRow(i).getCell(9).toString();
            String reserved3 = sheet.getRow(i).getCell(10).toString();
            String reserved4 = sheet.getRow(i).getCell(11).toString();
            String reserved5 = sheet.getRow(i).getCell(12).toString();
            String reserved6 = sheet.getRow(i).getCell(13).toString();
            String reserved7 = sheet.getRow(i).getCell(14).toString();
            String reserved8 = sheet.getRow(i).getCell(15).toString();
            String reserved9 = sheet.getRow(i).getCell(16).toString();
            String reserved10 = sheet.getRow(i).getCell(17).toString();
            list.add(new DetonatorData(id,detonator,uid,area,group,line,hole,position,delay,reserved1,reserved2,reserved3,reserved4,reserved5,reserved6,reserved7,reserved8,reserved9,reserved10));
        }
        DaoUtils.insertList(list);
        listLiveDatalist.setValue(list);
    }
}

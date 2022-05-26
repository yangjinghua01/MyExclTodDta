package com.example.myexcltoddta;

import android.util.Log;


import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.read.listener.ReadListener;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DetonatorDataListener implements ReadListener<DetonatorData> {
    private static final int BATCH_COUNT = 4;
    private List<DetonatorData> list =  new ArrayList<>();
    @Override
    public void onException(Exception exception, AnalysisContext context) throws Exception {
        Log.i("TAG", "onException: "+"解析失败");

    }

    @Override
    public void invokeHead(Map<Integer, CellData> headMap, AnalysisContext context) {
        Log.i("TAG", "invokeHead: "+headMap.toString());
        Log.i("TAG", "invokeHead: "+context.toString());
    }

    @Override
    public void invoke(DetonatorData data, AnalysisContext context) {
        Log.i("TAG", "invoke: "+data);
        list.add(data);
//        if (list.size()>=BATCH_COUNT){
//            save(list);
//        }
        System.out.println(data.toString());
    }



    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {
        Log.i("TAG", "doAfterAllAnalysed: 读取完成");
    }

    @Override
    public boolean hasNext(AnalysisContext context) {
        return true;
    }
    private void save(List<DetonatorData> list){
        DaoUtils.insertList(list);
    }
}

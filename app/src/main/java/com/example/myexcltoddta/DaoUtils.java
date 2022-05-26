package com.example.myexcltoddta;

import java.util.List;

public class DaoUtils {
    public static  void insert(DetonatorData detonatorData){
        DaoManger.getInstance().getDaoSession().insertOrReplace(detonatorData);
    }
    public static  void  insertList(List<DetonatorData> list){
        DaoManger.getInstance().getDaoSession().getDetonatorDataDao()
                .insertOrReplaceInTx(list);
    }
    public static void delele(Long id){
        DaoManger.getInstance().getDaoSession()
                .getDetonatorDataDao()
                .deleteByKey(id);
    }
    public static List<DetonatorData> loadall(){
        return DaoManger.getInstance().getDaoSession().loadAll(DetonatorData.class);
    }
}

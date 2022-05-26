package com.example.myexcltoddta;

import android.app.Application;
import android.content.Context;

import com.example.myexcltoddta.Dao.DaoMaster;
import com.example.myexcltoddta.Dao.DaoSession;

public class DaoManger {
    private DaoMaster daoMaster;
    private DaoSession daoSession;
    public DaoManger() {
        init();
    }
    private static class SingleInstanceHolder{
        private  static final DaoManger INSTANCE = new DaoManger();
    }
    public static DaoManger getInstance(){
        return SingleInstanceHolder.INSTANCE;
    }

    private void init() {
    DaoMaster.DevOpenHelper devOpenHelper = new DaoMaster.DevOpenHelper(MyApplication.getContext(),"DetonatorData");
    daoMaster = new DaoMaster(devOpenHelper.getWritableDb());
    daoSession =daoMaster.newSession();
    }

    public DaoMaster getDaoMaster() {
        return daoMaster;
    }

    public DaoSession getDaoSession() {
        return daoSession;
    }
}

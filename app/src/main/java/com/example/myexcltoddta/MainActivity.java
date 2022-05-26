package com.example.myexcltoddta;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.myexcltoddta.databinding.ActivityMainBinding;


import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private Viewmodel viewmodel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        viewmodel = new ViewModelProvider(this).get(Viewmodel.class);
        viewmodel.listLiveDatalist.observe(MainActivity.this, new Observer<List<DetonatorData>>() {
            @Override
            public void onChanged(List<DetonatorData> list) {
                Log.i("TAG", "onChanged: "+"查询入库完成");
                Toast.makeText(MainActivity.this, "查询入库完成", Toast.LENGTH_SHORT).show();
            }
        });
        viewmodel.getListLiveDatalist.observe(MainActivity.this, new Observer<List<DetonatorData>>() {
            @Override
            public void onChanged(List<DetonatorData> list) {
                Log.i("TAG", "onChanged: ");
                Toast.makeText(MainActivity.this, "查询完成", Toast.LENGTH_SHORT).show();
            }
        });
        binding.setData(viewmodel);
        binding.setLifecycleOwner(this);
    }


}
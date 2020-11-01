package com.bamboo.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.bamboo.loading.LoadingConstant;
import com.bamboo.loading.LoadingCustom;
import com.bamboo.loading.LoadingFlower;
import com.bamboo.loading.LoadingPie;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button_1).setOnClickListener(this);
        findViewById(R.id.button_2).setOnClickListener(this);
        findViewById(R.id.button_3).setOnClickListener(this);
        findViewById(R.id.button_4).setOnClickListener(this);
        findViewById(R.id.button_5).setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_1: {
                LoadingFlower dialog = new LoadingFlower.Builder(this, R.style.NonDimACProgressDialog)
                        .direction(LoadingConstant.DIRECT_CLOCKWISE)
                        .themeColor(Color.WHITE)
                        .sizeRatio(0.15f)
                        .fadeColor(Color.DKGRAY).build();
                dialog.setCanceledOnTouchOutside(false);
                dialog.show();
            }
            break;
            case R.id.button_2: {
                LoadingFlower dialog = new LoadingFlower.Builder(this)
                        .direction(LoadingConstant.DIRECT_ANTI_CLOCKWISE)
                        .themeColor(Color.GREEN)
                        .fadeColor(Color.RED).build();
                dialog.setCanceledOnTouchOutside(true);
                dialog.show();
            }
            break;
            case R.id.button_3: {
                LoadingFlower dialog = new LoadingFlower.Builder(this)
                        .text("Text is here")
                        .build();
                dialog.setCanceledOnTouchOutside(true);
                dialog.show();
            }
            break;
            case R.id.button_4: {
                LoadingPie dialog = new LoadingPie.Builder(this).build();
                dialog.setCanceledOnTouchOutside(true);
                dialog.show();
            }
            break;
            case R.id.button_5: {
                LoadingCustom dialog = new LoadingCustom.Builder(this)
                        .useImages(R.drawable.p0, R.drawable.p1, R.drawable.p2, R.drawable.p3).build();
                dialog.setCanceledOnTouchOutside(true);
                dialog.show();
            }
            break;
        }
    }
}
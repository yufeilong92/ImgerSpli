package com.xuechuan.myapplication;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mBtn;
    private ImageView mIv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();


    }

    private void initView() {
        mBtn = (Button) findViewById(R.id.btn);
        mIv = (ImageView) findViewById(R.id.iv);

        mBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn:
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.qbank_shareimg);
                Bitmap bitmap1 = BitmapFactory.decodeResource(getResources(), R.drawable.timg);
                ImgerUtill imgerUtill = ImgerUtill.getInstance(this);
                Bitmap bitmap2 = imgerUtill.add2Bitmap(bitmap1, bitmap);
                mIv.setImageBitmap(bitmap2);

                break;
        }
    }
}

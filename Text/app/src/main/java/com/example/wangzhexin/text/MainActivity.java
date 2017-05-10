package com.example.wangzhexin.text;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.PopupWindow;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {

    ImageView ivFabu,ivClose;
    View viewPop;
    PopupWindow window;
    WindowManager.LayoutParams wl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ivFabu = (ImageView) findViewById(R.id.iv_fabu);
        viewPop = LayoutInflater.from(this).inflate(R.layout.inflate_send,null);
        ivClose = (ImageView) viewPop.findViewById(R.id.iv_close);



        ivFabu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ivFabu.setVisibility(View.GONE);
                window = new PopupWindow(viewPop, ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.MATCH_PARENT);
                window.setAnimationStyle(R.style.AppTheme);
                window.setFocusable(true);
                window.setOutsideTouchable(false);
                window.update();
                window.showAtLocation(viewPop, Gravity.CENTER,0,0);


            }
        });

        ivClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ivFabu.setVisibility(View.VISIBLE);
                window.dismiss();
            }
        });


    }
}

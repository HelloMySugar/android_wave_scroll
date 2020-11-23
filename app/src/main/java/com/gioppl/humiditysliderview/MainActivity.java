package com.gioppl.humiditysliderview;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements SlideView2.ScrollCallBack {
    private SlideView2 sv_main;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sv_main=findViewById(R.id.sv_main);
        sv_main.setScrollBack(this);
    }

  @Override
  public void scrollMove(int num) {

    Log.e("SLIDE_MOVE", String.valueOf(num));
  }
  @Override
  public void scrollUp(int num) {
    Log.e("SLIDE_UP", String.valueOf(num));
  }
}

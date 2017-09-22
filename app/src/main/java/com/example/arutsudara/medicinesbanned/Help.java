package com.example.arutsudara.medicinesbanned;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class Help extends Activity
{
    TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help);
        display=(TextView)findViewById(R.id.tv);
        Bundle gotExtras = getIntent().getExtras();
        Integer gotBread = gotExtras.getInt("key");
        display.setText(gotBread);
    }
}
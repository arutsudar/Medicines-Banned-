package com.example.arutsudara.medicinesbanned;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Page3 extends Activity
{
    int[] image = {R.drawable.astemizole,R.drawable.fenfluramine,R.drawable.gatifloxacin,R.drawable.phenformin,R.drawable.rimonabant,R.drawable.rofecoxibpng,
            R.drawable.rosiglitazone,R.drawable.sibutramine,R.drawable.tegaserod,R.drawable.terfenadine,R.drawable.valdecoxib};
    ImageView img;
    TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page3);
        display=(TextView)findViewById(R.id.tvdisplay);
        Bundle gotExtras = getIntent().getExtras();
        Integer gotBread = gotExtras.getInt("key");
        Integer gotBread1 = gotExtras.getInt("position");
        display.setText(gotBread);
        img = (ImageView) findViewById(R.id.image);
        Bitmap bm = BitmapFactory.decodeResource(getResources(), image[gotBread1]);
        img.setImageBitmap(bm);
    }
}
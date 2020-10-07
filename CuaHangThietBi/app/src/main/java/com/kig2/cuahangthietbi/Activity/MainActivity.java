package com.kig2.cuahangthietbi.Activity;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.widget.Toolbar;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ListView;

import android.widget.ViewFlipper;

import com.google.android.material.navigation.NavigationView;
import com.kig2.cuahangthietbi.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    ViewFlipper viewFlipper;
    RecyclerView recyclerviewmanhinhchinh;
    NavigationView navigationview;
    ListView listviewmanhinhchinh;
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Anhxa();
        ActionBar();
        ActionViewFlipper();
    }

    private void ActionViewFlipper() {
        ArrayList<String> mangquangcao=new ArrayList<>();
        mangquangcao.add("https://stcv4.hnammobile.com/uploads/optimized/banner/giam-den-500k-cho-chu-the-tin-dung-vib-1003368.png?v=1600154822?v=1599642125");
        mangquangcao.add("https://cdn.tgdd.vn/2020/09/banner/800-170-800x170-33.png");
        mangquangcao.add("https://cdn.tgdd.vn/2020/09/banner/a51-71-800-170-800x170-3.png");
        mangquangcao.add("https://cdn.tgdd.vn/2020/09/banner/ip-7plus-8plus800-170-800x170-1.png");
        for(int i=0;i<mangquangcao.size();i++){
            ImageView imageView=new ImageView(getApplicationContext());
            Picasso.with(getApplicationContext()).load(mangquangcao.get(i)).into(imageView);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            viewFlipper.addView(imageView);
        }
        viewFlipper.setFlipInterval(5000);
        viewFlipper.setAutoStart(true);
        Context context;
        Animation animation_slide_in=AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_in_right);
        Animation animation_slide_out=AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_out_right);
        viewFlipper.setInAnimation(animation_slide_in);
        viewFlipper.setOutAnimation(animation_slide_out);

    }

    private void ActionBar(){
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationIcon(android.R.drawable.ic_menu_sort_by_size);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });
    }

    private void Anhxa() {
        toolbar= (Toolbar) findViewById(R.id.toolbarmanhinhchinh);
        viewFlipper=findViewById(R.id.viewflipper);
        recyclerviewmanhinhchinh=findViewById(R.id.recyclerview);
        navigationview=findViewById(R.id.navigationview);
        listviewmanhinhchinh=findViewById(R.id.listviewmanhinhchinh);
        drawerLayout=findViewById(R.id.drawerLayout);
           }
}
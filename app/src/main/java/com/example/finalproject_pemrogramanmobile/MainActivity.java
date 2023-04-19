package com.example.finalproject_pemrogramanmobile;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.widget.Toast;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ImageSlider carousel;
    private DrawerLayout sidebar_view_container;
    private NavigationView sidebar_view_item;
    private ActionBarDrawerToggle drawerToggle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        carousel = findViewById(R.id.carousel);
        List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel("https://upload.wikimedia.org/wikipedia/commons/thumb/5/50/%D0%9F%D0%BE%D0%B5%D0%B7%D0%B4_%D0%BD%D0%B0_%D1%84%D0%BE%D0%BD%D0%B5_%D0%B3%D0%BE%D1%80%D1%8B_%D0%A8%D0%B0%D1%82%D1%80%D0%B8%D1%89%D0%B5._%D0%92%D0%BE%D1%80%D0%BE%D0%BD%D0%B5%D0%B6%D1%81%D0%BA%D0%B0%D1%8F_%D0%BE%D0%B1%D0%BB%D0%B0%D1%81%D1%82%D1%8C.jpg/1280px-%D0%9F%D0%BE%D0%B5%D0%B7%D0%B4_%D0%BD%D0%B0_%D1%84%D0%BE%D0%BD%D0%B5_%D0%B3%D0%BE%D1%80%D1%8B_%D0%A8%D0%B0%D1%82%D1%80%D0%B8%D1%89%D0%B5._%D0%92%D0%BE%D1%80%D0%BE%D0%BD%D0%B5%D0%B6%D1%81%D0%BA%D0%B0%D1%8F_%D0%BE%D0%B1%D0%BB%D0%B0%D1%81%D1%82%D1%8C.jpg", ScaleTypes.CENTER_CROP));
        slideModels.add(new SlideModel(R.drawable.icn5, ScaleTypes.CENTER_CROP));
        slideModels.add(new SlideModel(R.drawable.icn2, ScaleTypes.CENTER_CROP));
        carousel.setImageList(slideModels, ScaleTypes.FIT);

        sidebar_view_container = findViewById(R.id.sidebar_view_container);
        sidebar_view_item = findViewById(R.id.sidebar_view_item);
        drawerToggle = new ActionBarDrawerToggle(this, sidebar_view_container, R.string.open, R.string.close);

        sidebar_view_container.addDrawerListener(drawerToggle);
        drawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        sidebar_view_item.setNavigationItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.nav_home:
                    Toast.makeText(this, "Home Selected", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.kesehatanCategory:
                    Toast.makeText(this, "Kesehatan Selected", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.olahragaCategory:
                    Toast.makeText(this, "Olahraga Selected", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.livestyleCategory:
                    Toast.makeText(this, "Lifestyle Selected", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.politikCategory:
                    Toast.makeText(this, "Politik Selected", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.ekonomiCategory:
                    Toast.makeText(this, "Ekonomi Selected", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.teknologiCategory:
                    Toast.makeText(this, "Teknologi Selected", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.nav_login:
                    Toast.makeText(this, "Login Selected", Toast.LENGTH_SHORT).show();
                    break;
            }
            return true;
        });
    }
}
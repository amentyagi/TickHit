package com.anuntah.tickhit;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.google.android.youtube.player.YouTubeThumbnailView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;
    private FrameLayout frameLayout;

    private ViewPager mSlideViewPager;
    private LinearLayout mDotsLayout;
    private com.anuntah.tickhit.SlideAdapter slideAdapter;
    private YouTubeThumbnailView ytThubnailView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        frameLayout=findViewById(R.id.mainFrame);

        bottomNavigationView=findViewById(R.id.mainNav);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {

                    case R.id.movie_btn:
                        setFragment(new com.anuntah.tickhit.MoviesFragment());
                        return true;

                    case  R.id.tv_btn:
                        setFragment(new TvFragment());
                        return true;
                    case R.id.profile_btn:
                        setFragment(new com.anuntah.tickhit.ProfileFragment());
                        return true;
                }
                return true;
            }
        });


//        MoviesFragment fragment=new MoviesFragment();
//        FragmentManager fragmentManager=getSupportFragmentManager();
//        FragmentTransaction transaction=fragmentManager.beginTransaction();
//        transaction.add(R.id.mainFrame,fragment).commit();
        setFragment(new com.anuntah.tickhit.MoviesFragment());
    }

    private void setFragment(Fragment fragment) {
        frameLayout.removeAllViews();
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction transaction=fragmentManager.beginTransaction();
        transaction.add(R.id.mainFrame,fragment).commit();
    }
}

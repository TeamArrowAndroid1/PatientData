package patient.arrow.myapplication;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Search extends AppCompatActivity {
   TabLayout tabLayout;ViewPager viewPager;ViewPagerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout=(TabLayout)findViewById(R.id.tablayout);
        viewPager=(ViewPager)findViewById(R.id.viewpager);

        adapter=new ViewPagerAdapter(getSupportFragmentManager());

        adapter.addFragmetns(new HomeFragment(),"By Id");
        adapter.addFragmetns(new RenterF(),"By Dept");

        viewPager.setAdapter(adapter);

        tabLayout.setupWithViewPager(viewPager);
    }
}

package uz.exemple.less8_task5_java;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import uz.exemple.less8_task5_java.adapters.ViewPagerAdapter;
import uz.exemple.less8_task5_java.fragments.ContactsFragment;
import uz.exemple.less8_task5_java.fragments.PostsFragment;
import uz.exemple.less8_task5_java.fragments.UsersFragment;

public class MainActivity extends AppCompatActivity {
    private ViewPagerAdapter viewPagerAdapter;
    private ViewPager viewPager;
    private TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    void initViews(){
        viewPager = findViewById(R.id.view_pager);

        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());

        viewPagerAdapter.add(new ContactsFragment(), "Contacts");
        viewPagerAdapter.add(new UsersFragment(), "Users");
        viewPagerAdapter.add(new PostsFragment(), "Posts");

        viewPager.setAdapter(viewPagerAdapter);

        tabLayout = findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);
    }
}
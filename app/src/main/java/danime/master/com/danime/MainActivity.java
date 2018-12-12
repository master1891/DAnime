package danime.master.com.danime;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;


import android.os.Build;
import android.os.Bundle;
import android.view.View;

import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationItem;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.bottom_navigation)
    AHBottomNavigation ahBottomNavigation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
        initEvents();
        configItemsBottomNavigation();

    }



    private void configItemsBottomNavigation(){


        ahBottomNavigation.setDefaultBackgroundColor(getResources().getColor(R.color.colorPrimary));


        AHBottomNavigationItem ahBottomHome = new AHBottomNavigationItem(R.string.home,R.drawable.ic_home_outline,R.color.colorAccent);
        AHBottomNavigationItem ahBottomFavorites= new AHBottomNavigationItem(R.string.downloading,R.drawable.ic_favorite_outline,R.color.colorAccent);
        AHBottomNavigationItem ahBottomVideos= new AHBottomNavigationItem(R.string.completes,R.drawable.ic_videos,R.color.colorAccent);

        //agregando los items al toolbar
        this.ahBottomNavigation.addItem(ahBottomHome);
        this.ahBottomNavigation.addItem(ahBottomFavorites);
        this.ahBottomNavigation.addItem(ahBottomVideos);
    }


    private void initEvents(){
        ahBottomNavigation.setOnTabSelectedListener(new AHBottomNavigation.OnTabSelectedListener() {
            @Override
            public boolean onTabSelected(int position, boolean wasSelected) {
                return false;
            }
        });
    }



}

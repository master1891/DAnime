package danime.master.com.danime;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import it.sephiroth.android.library.bottomnavigation.BottomNavigation;


import android.os.Build;
import android.os.Bundle;
import android.view.View;



public class MainActivity extends AppCompatActivity {

    @BindView(R.id.bottom_navigation)
    BottomNavigation bottomNavigation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
        initEvents();
        configItemsBottomNavigation();

    }



    private void configItemsBottomNavigation(){
        
    }


    private void initEvents(){

    }

}

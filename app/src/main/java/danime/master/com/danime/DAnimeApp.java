package danime.master.com.danime;

import android.app.Application;

import androidx.multidex.MultiDex;

public class DAnimeApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        MultiDex.install(this);
    }
}

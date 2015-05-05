package adam.materialdesignsetting;

import android.annotation.SuppressLint;
import android.app.FragmentManager;
import android.content.SharedPreferences;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity {
     SettingFragment mSettingsFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState==null){
            mSettingsFragment=new SettingFragment();
            replaceFragment(R.id.setting_container,mSettingsFragment);

        }



    }

    private void replaceFragment(int viewId, SettingFragment mSettingsFragment) {
        FragmentManager fragmentManager=getFragmentManager();
        fragmentManager.beginTransaction().replace(viewId,mSettingsFragment).commit();

    }

    public  static class SettingFragment extends PreferenceFragment{
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            addPreferencesFromResource(R.xml.preferences2);
        }
    }

}

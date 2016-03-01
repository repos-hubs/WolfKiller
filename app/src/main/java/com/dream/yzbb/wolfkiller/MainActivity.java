package com.dream.yzbb.wolfkiller;

import android.content.Intent;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.dream.yzbb.wolfkiller.app.commonui.AboutUsActivity;
import com.dream.yzbb.wolfkiller.ui.SettingsActivity;
import com.dream.yzbb.wolfkiller.apputils.XmlUtils;
import com.dream.yzbb.wolfkiller.ui.SetupNewGameActivity;

public class MainActivity extends AppCompatActivity {
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        mTextView = (TextView) findViewById(R.id.role_content);

        //Get all players' role information
//        Factory.get().getGameManager().getAllPlayers();
        //Then call NightRoundManager's method to do actions
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.menu_settings) {
//            mTextView.setText(XmlUtils.parseRolesFromXml(getResources().openRawResource(R.raw.roles)).toString());
//            mTextView.setText(XmlUtils.parseRoleDistributionFromXml(getResources().openRawResource(R.raw.games)).toString());
            openSetupNewGameActivity();
            return true;
        } else if (id == R.id.menu_about) {
            openAboutActivity();
            return true;
        }

        return false;
    }

    private void openAboutActivity() {
        startActivity(new Intent(this, AboutUsActivity.class));
    }

    private void openSettingsActivity() {
        startActivity(new Intent(this, SettingsActivity.class));
    }

    private void openSetupNewGameActivity() {
        startActivity(new Intent(this, SetupNewGameActivity.class));
    }


}

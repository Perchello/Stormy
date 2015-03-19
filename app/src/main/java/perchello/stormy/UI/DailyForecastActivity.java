package perchello.stormy.UI;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;

import java.util.Arrays;

import perchello.stormy.R;
import perchello.stormy.adapters.DayAdapter;
import perchello.stormy.weather.Day;

public class DailyForecastActivity extends ListActivity {
    private Day [] mDays;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_forecast);
        Intent intent = getIntent();
        Parcelable[] parcelables = intent.getParcelableArrayExtra(MainActivity.DAILY_FORECAST);
        mDays = Arrays.copyOf(parcelables, parcelables.length,Day[].class);
        DayAdapter adapter = new DayAdapter(this, mDays);
        this.setListAdapter(adapter);
    }



}

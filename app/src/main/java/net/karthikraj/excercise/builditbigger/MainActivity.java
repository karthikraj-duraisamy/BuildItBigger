package net.karthikraj.excercise.builditbigger;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Pair;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void tellJoke(View view) {
        //Toast.makeText(this, JokeTeller.getJoke(), Toast.LENGTH_SHORT).show();



        new EndPointsAsyncTask().execute(new Pair<Context, String>(this, "Manfred"));
    }

}

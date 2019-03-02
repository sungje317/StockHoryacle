package com.example.stockhyoracle.Utils;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.util.Log;
import android.view.MenuItem;

import com.example.stockhyoracle.HomeActivity;
import com.example.stockhyoracle.R;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

public class BottomNavigationViewHelper {
    private static final String TAG = "BottomNavigationViewHel";
    public static void setupBottomNavigationView(BottomNavigationViewEx bottomNavigationViewEx){
        Log.d(TAG, "setupBottomNavigationView : Setting up BottomNavigationView");
        //bottomNavigationViewEx.enableAnimation(false)
        //bottomNavigationViewEx.enableItemShiftingMode(false)
        //bottomNavigationViewEx.enableShiftingMode(false)
        //bottomNavigationViewEx.setTextVisibility(false)
    }

    public static void enableNavigation(final Context context, BottomNavigationViewEx view){
        view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){

                    case R.id.ic_house:
                        Intent intent1 = new Intent(context, HomeActivity.class);
                        context.startActivity(intent1);
                        break;
                    case R.id.ic_notification:
                        Intent intent2 = new Intent(context, HomeActivity.class);
                        context.startActivity(intent2);
                        break;
                    case R.id.ic_person:
                        Intent intent3 = new Intent(context, HomeActivity.class);
                        context.startActivity(intent3);
                        break;
                }


            }
        });
    }

}

package app.com.example.android.myappportfolio;

//reference
//http://developer.android.com/guide/topics/ui/controls/button.html
//http://developer.android.com/guide/topics/ui/notifiers/toasts.html#Basics

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showPopularMovies(View view) {
        Context context = getApplicationContext();
        CharSequence toastText = "This button will launch my Popular Movies app!";
        showToast(context, toastText);
    }

    public void showStockHawk(View view) {
        Context context = getApplicationContext();
        CharSequence toastText = "This button will launch my Stock Hawk app!";
        showToast(context, toastText);
    }

    public void showBuildItBigger(View view) {
        Context context = getApplicationContext();
        CharSequence toastText = "This button will launch my Build It Bigger app!";
        showToast(context, toastText);
    }

    public void showMakeYourApp(View view) {
        Context context = getApplicationContext();
        CharSequence toastText = "This button will launch my Make Your App Material app!";
        showToast(context, toastText);
    }

    public void showUbiquitous(View view) {
        Context context = getApplicationContext();
        CharSequence toastText = "This button will launch my Go Ubiquitous app!";
        showToast(context, toastText);
    }

    public void showCapstone(View view) {
        Context context = getApplicationContext();
        CharSequence toastText = "This button will launch my Capstone app!";
        showToast(context, toastText);
    }

    private void showToast(Context context, CharSequence text){
        Toast toast = Toast.makeText(context, text, Toast.LENGTH_LONG);
        toast.show();
    }

}

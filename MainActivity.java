package in.udith.prog4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    FragmentOne fragmentOne = new FragmentOne();

    FragmentTwo fragmentTwo = new FragmentTwo();

    int ShowingFragment = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.clayout, fragmentOne);
        ShowingFragment = 1;
        fragmentTransaction.commit();
    }
    public void switchFragment(View view) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        if (ShowingFragment == 1) {
            fragmentTransaction.replace(R.id.clayout, fragmentTwo);
            ShowingFragment = 2;
        }
        else {
            fragmentTransaction.replace(R.id.clayout, fragmentOne);
            ShowingFragment = 1;
        }
        fragmentTransaction.commit();
    }
}
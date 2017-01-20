package whitedirewolves.basic_04_b;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //
        if (item.getItemId() == R.id.id_a) {
            Intent intent=new Intent(this,Act_01.class);
            startActivity(intent);
        } else if (item.getItemId() == R.id.id_b) {
            Intent intent=new Intent(this,Act_02.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}

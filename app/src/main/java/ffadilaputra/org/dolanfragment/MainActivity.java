package ffadilaputra.org.dolanfragment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        ResepDetailFragment fragment = (ResepDetailFragment) getSupportFragmentManager().findFragmentById(R.id.detail_flag);
//        fragment.setResep(1);
    }

    public void onShowDetails(View view) {
        Intent intent = new Intent(MainActivity.this,DetailActivity.class);
        startActivity(intent);
    }
}

package ffadilaputra.org.dolanfragment;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        ResepDetailFragment fragment = (ResepDetailFragment) getSupportFragmentManager().findFragmentById(R.id.detail_flag);
        Bundle bu = getIntent().getExtras();
        fragment.setResep(bu.getInt("id"));
    }
}

package ffadilaputra.org.dolanfragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ResepDetailFragment extends Fragment {

    private long resepId;

    @Override
    public void onStart() {
        super.onStart();
        View v = getView();
            if (v != null){
                TextView textView = (TextView) v.findViewById(R.id.txtTitle);
                Resep e = Resep.resep[(int) resepId];
                textView.setText(e.getNama_makanan());
                TextView desc = (TextView) v.findViewById(R.id.txtDesc);
                desc.setText(e.getDeskripsi());
            }
    }

    public ResepDetailFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_resep_detail, container, false);
    }

    public void setResep(long id){
        this.resepId = id;
    }
}

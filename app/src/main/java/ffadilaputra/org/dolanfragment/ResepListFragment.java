package ffadilaputra.org.dolanfragment;
import android.app.ListFragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ResepListFragment extends ListFragment {

    static interface Listener {
          void itemClicked(long id);
    };

    private Listener listener;

    public ResepListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String[] names = new String[Resep.resep.length];
        for (int i= 0; i< names.length; i++){
            names[i] = Resep.resep[i].getNama_makanan();
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<>(inflater.getContext(),android.R.layout.simple_list_item_1, names);
        setListAdapter(adapter);
        // Inflate the layout for this fragment
        return super.onCreateView(inflater,container,savedInstanceState);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.listener = (Listener) context;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        Intent intent = new Intent(v.getContext(),DetailActivity.class);
        Bundle bundle = new Bundle();
        String[] name = new String[Resep.resep.length];
        bundle.putInt("id",position);
        intent.putExtras(bundle);

        startActivity(intent);
        if (listener != null) {
            listener.itemClicked(id);
        }
    }
}

package ahhhlvin.c4q.nyc.ac_07_18;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by alvin2 on 7/18/15.
 */
public class HomeScreenFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // this is the default screen that opens when the app is opened up
        View rootView = inflater.inflate(R.layout.fragment_home_screen, container, false);

        return rootView;
    }

}

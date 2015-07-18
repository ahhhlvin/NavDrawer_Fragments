package ahhhlvin.c4q.nyc.ac_07_18;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by alvin2 on 7/18/15.
 */
public class CounterFragment extends Fragment{

    TextView textView;
    Button button;
    int count;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // setContentView() for the fragment itself to display inside the container
        View view = inflater.inflate(R.layout.fragment_counter, container, false);

        // Everything under the view initialized is added into the view
        if (savedInstanceState != null) {
            count = savedInstanceState.getInt("count");
            textView.setText(count);
        } else {
            count = 0;
        }

        textView = (TextView) view.findViewById(R.id.textView);
        button = (Button) view.findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                textView.setText(String.valueOf(count));
            }
        });


        // Return the view after everything is added to it!
        return view;
    }


    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putInt("count", count);
    }



}

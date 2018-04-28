package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;



/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }
    TextView jokeTextView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);

        jokeTextView = root.findViewById(R.id.tv_joke);
        jokeTextView.setVisibility(View.INVISIBLE);

        Button button =root.findViewById(R.id.button_tell_joke);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new EndpointAsyncTask().execute(MainActivityFragment.this);
            }
        });
        return root;
    }
}

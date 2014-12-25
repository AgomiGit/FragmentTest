package com.example.agomi.agomi_fragment_test;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by agomi on 14/12/25.
 */
public class Fragment1 extends Fragment {
    private Button button1 = null;
    private View view = null;
    private String TAG = "Agomi";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment1, container, false);

        button1 = (Button)view.findViewById(R.id.frag1_button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "==>>>>>onClick");
                Fragment frag_right = Fragment1.this.getFragmentManager().findFragmentByTag("right_frag");
                EditText editText = (EditText)frag_right.getView().findViewById(R.id.editText1);
                editText.setText("WOW hahaha");

            }
        });
        return view;
    }
}

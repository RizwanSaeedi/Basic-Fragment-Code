package islamic.soft.saeedi.com.fragment1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BlankFragment extends Fragment
{
    public BlankFragment()
    {
        // Required empty public constructor
    }

    public static BlankFragment newInstance(String arg)
    {

        Bundle args = new Bundle();
        args.putString("key", arg);
        BlankFragment fragment = new BlankFragment();
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View view =  inflater.inflate(R.layout.fragment_blank, container, false);


        if (getArguments() != null)
        {
            String input = getArguments().getString("key");
            TextView tv = view.findViewById(R.id.tv);
            tv.setText(input);
        }

        return view;
    }
}
package br.com.rocheikoaresalfabooks.alfabooks.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.com.rocheikoaresalfabooks.alfabooks.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class LivroFragment extends Fragment {


    public LivroFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.fragment_livro, container, false);

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_livro, container, false);
    }

}

package ru.penza.aabr.deviceinfo.starbuzz;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ru.penza.aabr.deviceinfo.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PizzaMaterialFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PizzaMaterialFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public PizzaMaterialFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment PizzaMaterialFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static PizzaMaterialFragment newInstance(String param1, String param2) {
        PizzaMaterialFragment fragment = new PizzaMaterialFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        RecyclerView pizzaRecycler = (RecyclerView) inflater
                .inflate(R.layout.fragment_pizza_material,container,false);
        String[] pizzaNames = new String[Pizza.pizzas.length];
        for (int i=0;i<pizzaNames.length;i++){
            pizzaNames[i] = Pizza.pizzas[i].getName();
        }
        int[] pizzaImages = new int[Pizza.pizzas.length];
        for (int i=0;i<pizzaImages.length;i++){
            pizzaImages[i] = Pizza.pizzas[i].getInageResourceId();
        }
        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(pizzaNames,pizzaImages);
        pizzaRecycler.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        pizzaRecycler.setLayoutManager(layoutManager);

        return pizzaRecycler;
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_pizza_material, container, false);
    }
}
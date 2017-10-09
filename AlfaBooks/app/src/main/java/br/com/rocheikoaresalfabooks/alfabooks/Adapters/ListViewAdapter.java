package br.com.rocheikoaresalfabooks.alfabooks.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import br.com.rocheikoaresalfabooks.alfabooks.Activities.Livro;
import br.com.rocheikoaresalfabooks.alfabooks.R;

public class ListViewAdapter extends BaseAdapter {

    // Declare Variables

    Context mContext;
    LayoutInflater inflater;
    private List<Livro> livrosLista = null;
    private ArrayList<Livro> arraylist;

    public ListViewAdapter(Context context, List<Livro> livrosLista) {
        mContext = context;
        this.livrosLista = livrosLista;
        inflater = LayoutInflater.from(mContext);
        this.arraylist = new ArrayList<Livro>();
        this.arraylist.addAll(livrosLista);
    }

    public class ViewHolder {
        TextView name;
    }

    @Override
    public int getCount() {
        return livrosLista.size();
    }

    @Override
    public Livro getItem(int position) {
        return livrosLista.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public View getView(final int position, View view, ViewGroup parent) {
        final ViewHolder holder;
        if (view == null) {
            holder = new ViewHolder();
            view = inflater.inflate(R.layout.listview_item, null);
            // Locate the TextViews in listview_item.xml
            holder.name = (TextView) view.findViewById(R.id.name);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }
        // Set the results into TextViews
        holder.name.setText(livrosLista.get(position).getNomeLivro());
        return view;
    }

    // Filter Class
    public void filter(String charText) {
        charText = charText.toLowerCase(Locale.getDefault());
        livrosLista.clear();
        if (charText.length() == 0) {
            livrosLista.addAll(arraylist);
        } else {
            for (Livro wp : arraylist) {
                if (wp.getNomeLivro().toLowerCase(Locale.getDefault()).contains(charText)) {
                    livrosLista.add(wp);
                }
            }
        }
        notifyDataSetChanged();
    }

}
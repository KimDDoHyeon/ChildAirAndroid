package com.example.childair.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.childair.Model.Chid;
import com.example.childair.R;

import java.util.List;

class SearchViewHolder extends RecyclerView.ViewHolder{
    public TextView name,time,temperature,dust1,dust2;


    public SearchViewHolder(@NonNull View itemView) {
        super(itemView);
        name=(TextView)itemView.findViewById(R.id.name);
        time=(TextView)itemView.findViewById(R.id.time);
        temperature=(TextView)itemView.findViewById(R.id.temperature);
        dust1=(TextView)itemView.findViewById(R.id.dust1);
        dust2=(TextView)itemView.findViewById(R.id.dust2);
    }
}

public class SearchAdapter extends RecyclerView.Adapter<SearchViewHolder> {

    private Context context;
    private List<Chid> chids;

    public SearchAdapter(Context context, List<Chid> chids){
        this.context = context;
        this.chids=chids;
    }
    @NonNull
    @Override
    public SearchViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.layout_item,parent, false);

        return new SearchViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull SearchViewHolder holder, int position) {
        holder.name.setText(chids.get(position).getName());
        holder.time.setText(chids.get(position).getTime());
        holder.temperature.setText(chids.get(position).getTemperature());
        holder.dust1.setText(chids.get(position).getDust1());
        holder.dust2.setText(chids.get(position).getDust2());
    }

    @Override
    public int getItemCount() {
        return chids.size();
    }
}
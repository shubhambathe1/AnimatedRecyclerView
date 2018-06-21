package theaxontech.com.animatedrecyclerview.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

import theaxontech.com.animatedrecyclerview.Model.Superhero;
import theaxontech.com.animatedrecyclerview.R;

public class SuperherosAdapter extends RecyclerView.Adapter<SuperherosAdapter.MyViewHolder> {

    private List<Superhero> superherosList;

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView name, description;
        private LinearLayout linearLayoutSuperheroImage;

        private MyViewHolder(View view) {

            super(view);
            name = (TextView) view.findViewById(R.id.name);
            description = (TextView) view.findViewById(R.id.description);
            linearLayoutSuperheroImage = view.findViewById(R.id.linearLayoutSuperheroImage);

        }
    }


    public SuperherosAdapter(List<Superhero> superherosList) {

        this.superherosList = superherosList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_superhero_row_2, parent, false);

        return new MyViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        Superhero superhero = superherosList.get(position);
        holder.name.setText(superhero.getName());
        holder.description.setText(superhero.getDescription());

        holder.linearLayoutSuperheroImage.setBackgroundResource(superhero.getImage_url());
    }


    @Override
    public int getItemCount() {

        return superherosList.size();
    }

}
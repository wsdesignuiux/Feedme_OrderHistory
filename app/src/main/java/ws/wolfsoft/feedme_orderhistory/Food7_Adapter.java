package ws.wolfsoft.feedme_orderhistory;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Food7_Adapter extends RecyclerView.Adapter<Food7_Adapter.ViewHolder> {

    private Context context;
    private ArrayList<Food7_Model> modelArrayList;

    public Food7_Adapter(Context context, ArrayList<Food7_Model> modelArrayList) {
        this.context = context;
        this.modelArrayList = modelArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.food7_items,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Food7_Model food7_model = modelArrayList.get(position);

        holder.Restaurant_Id.setText(food7_model.getRestaurant_Id());
        holder.Address_Id.setText(food7_model.getAddress_Id());
        holder.Reviews_Id.setText(food7_model.getReviews_Id());
        holder.Date_Id.setText(food7_model.getDate_Id());
        holder.Dollar_Id.setText(food7_model.getDollar_Id());

       holder.FoodImage_Id.setImageResource(food7_model.getFoodImage_Id());

        holder.History_Id.setImageResource(food7_model.getHistory_Id());

    }

    @Override
    public int getItemCount() {
        return modelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView Restaurant_Id,Address_Id,Reviews_Id,Date_Id,Dollar_Id;
        ImageView FoodImage_Id,History_Id;

        public ViewHolder(View itemView) {
            super(itemView);

            Restaurant_Id = itemView.findViewById(R.id.Restaurant_Id);
            Address_Id = itemView.findViewById(R.id.Address_Id);
            Reviews_Id = itemView.findViewById(R.id.Reviews_Id);
            Date_Id = itemView.findViewById(R.id.Date_Id);
            Dollar_Id = itemView.findViewById(R.id.Dollar_Id);


            FoodImage_Id = itemView.findViewById(R.id.FoodImage_Id);

            History_Id = itemView.findViewById(R.id.History_Id);

        }
    }
}

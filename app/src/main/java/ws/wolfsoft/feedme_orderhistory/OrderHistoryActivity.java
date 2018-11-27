package ws.wolfsoft.feedme_orderhistory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class OrderHistoryActivity extends AppCompatActivity {


    String[] Restaurant_Id  = {"Cocobolo Poolside Bar + Grill","Palm Beach Seafood Restaurant","Shin Minori Japanese Restaurant","Shin Minori Japanese Restaurant"};
    String[] Address_Id = {"60 Kub Pines Apt. 797","60 Kub Pines Apt. 797","60 Kub Pines Apt. 797","60 Kub Pines Apt. 797"};
    String[] Reviews_Id ={"238 reviews","200 reviews","556 reviews","240 reviews"};
    String[] Date_Id = {"25 Nov 2017 10 : 30 AM","27 Nov 2017 10 : 30 AM","28 Nov 2017 10 : 30 AM","29 Nov 2017 10 : 30 AM"};
    String[] Dollar_Id={"$ 312.00","$ 312.00","$ 312.00","$ 312.00"};

    Integer[] FoodImage_Id = {R.drawable.pexel,R.drawable.pexel,R.drawable.pexel,R.drawable.pexel};
    Integer[] History_Id = {R.drawable.history,R.drawable.history,R.drawable.history,R.drawable.history};

    private RecyclerView recyclerView;
    private Food7_Adapter food7_adapter;
    private ArrayList<Food7_Model> modelArrayList;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_history);


        recyclerView = findViewById(R.id.RecyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(OrderHistoryActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        modelArrayList = new ArrayList<>();

        for (int i=0;i<Restaurant_Id.length;i++){
            Food7_Model food7_model = new Food7_Model(Restaurant_Id[i],Address_Id[i],Reviews_Id[i],Date_Id[i],Dollar_Id[i],FoodImage_Id[i],History_Id[i]);

            modelArrayList.add(food7_model);

        }
        food7_adapter = new Food7_Adapter(OrderHistoryActivity.this,modelArrayList);
        recyclerView.setAdapter(food7_adapter);
    }
}

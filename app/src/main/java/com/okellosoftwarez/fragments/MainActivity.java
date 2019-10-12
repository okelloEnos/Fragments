package com.okellosoftwarez.fragments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements carAdapter.itemClicked{


    Button carBtn, ownerBtn;
    TextView carModelVersion, name, phoneNo, tvCarBtn, tvOwnerBtn;
    ImageView modelImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        carBtn = findViewById(R.id.buttonCarBrand);
        ownerBtn = findViewById(R.id.buttonOwnerDetails);
        name = findViewById(R.id.tvDetailName);
        phoneNo = findViewById(R.id.tvDetailPhone);
        tvCarBtn = findViewById(R.id.tVCarBtn);
        tvOwnerBtn = findViewById(R.id.tVOwnerBtn);
        carModelVersion = findViewById(R.id.tvDetailModel);
        modelImage = findViewById(R.id.modelImage);

        modelImage.setVisibility(View.GONE);
        carModelVersion.setVisibility(View.GONE);
        tvCarBtn.setVisibility(View.GONE);

        carBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                tvOwnerBtn.setVisibility(view.INVISIBLE);
                name.setVisibility(view.INVISIBLE);
                phoneNo.setVisibility(view.INVISIBLE);
                tvCarBtn.setVisibility(view.VISIBLE);
                carModelVersion.setVisibility(view.VISIBLE);
                modelImage.setVisibility(view.VISIBLE);


            }
        });

        ownerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               tvCarBtn.setVisibility(view.INVISIBLE);
               carModelVersion.setVisibility(view.INVISIBLE);
               modelImage.setVisibility(view.INVISIBLE);
                tvOwnerBtn.setVisibility(view.VISIBLE);
                name.setVisibility(view.VISIBLE);
                phoneNo.setVisibility(view.VISIBLE);


            }
        });







        onItenClicked(0);
    }

    @Override
    public void onItenClicked(int index) {

       carOwnership leo = ApplicationClass.people.get(index);
       tvCarBtn.setText("CAR INFORMATION");
       tvOwnerBtn.setText("OWNER INFORMATION");
        name.setText(leo.getName());
        phoneNo.setText(leo.getPhoneNo());
        carModelVersion.setText(leo.getCarModelVersion());

        if (leo.getCarModel().equals("Mercedes")){
            modelImage.setImageResource(R.drawable.mercedes);
        }else if (leo.getCarModel().equals("Nissan")){
            modelImage.setImageResource(R.drawable.nissan);
        }else if (leo.getCarModel().equals("Volkswagen")){
            modelImage.setImageResource(R.drawable.volkswagen);
        }else {
            modelImage.setImageResource(R.drawable.fruit);
        }




    }
}

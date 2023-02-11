package br.dev.android.newyearfest.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

import br.dev.android.newyearfest.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mViewHolder.valueDays = findViewById(R.id.valueDays);
        this.mViewHolder.textToday = findViewById(R.id.todayDate);
        this.mViewHolder.confirmbtn = findViewById(R.id.btnConfirm);

        this.mViewHolder.confirmbtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnConfirm) {
            //ação vinda do btn
            Intent intent = new Intent(this, DetailsActivity.class);
            startActivity(intent);


        }

    }

    private static class ViewHolder {

        TextView textToday;
        TextView valueDays;
        MaterialButton confirmbtn;
    }
}

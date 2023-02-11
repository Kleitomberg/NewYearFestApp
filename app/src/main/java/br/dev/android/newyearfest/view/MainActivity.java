package br.dev.android.newyearfest.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import br.dev.android.newyearfest.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewHolder mViewHolder = new ViewHolder();
    private static SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mViewHolder.valueDays = findViewById(R.id.valueDays);
        this.mViewHolder.textToday = findViewById(R.id.todayDate);
        this.mViewHolder.confirmbtn = findViewById(R.id.btnConfirm);

        this.mViewHolder.confirmbtn.setOnClickListener(this);

        //DATAS
        this.mViewHolder.textToday.setText(SIMPLE_DATE_FORMAT.format(Calendar.getInstance().getTime()));

        String daysleft = String.format("%s %s",
            String.valueOf(this.getDaysLeft()),
            getString(R.string.dias)
        );

        this.mViewHolder.valueDays.setText(daysleft);


    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnConfirm) {
            //ação vinda do btn
            Intent intent = new Intent(this, DetailsActivity.class);
            startActivity(intent);


        }

    }

    private int getDaysLeft(){
        // data hoje
        Calendar calenderToday = Calendar.getInstance();
        int hoje = calenderToday.get(Calendar.DAY_OF_YEAR);
        // dias ano
        Calendar calenderLastDay = Calendar.getInstance();
        int maxDay = calenderLastDay.getActualMaximum(Calendar.DAY_OF_YEAR);

        return maxDay - hoje;
    }

    private static class ViewHolder {

        TextView textToday;
        TextView valueDays;
        MaterialButton confirmbtn;
    }
}

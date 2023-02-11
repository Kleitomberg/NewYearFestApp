package br.dev.android.newyearfest.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;

import br.dev.android.newyearfest.R;

public class DetailsActivity extends AppCompatActivity {

    private ViewHolder mViewHolder = new ViewHolder();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        this.mViewHolder.confirmP = findViewById(R.id.checkbox);

    }

    private static class ViewHolder{
        CheckBox confirmP;
    }
}

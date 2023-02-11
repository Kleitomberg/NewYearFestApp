package br.dev.android.newyearfest.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import br.dev.android.newyearfest.R;
import br.dev.android.newyearfest.constant.FimAnoContants;
import br.dev.android.newyearfest.data.SecurityPreference;

public class DetailsActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewHolder mViewHolder = new ViewHolder();
    private SecurityPreference mSecurityPreference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        this.mSecurityPreference = new SecurityPreference(this);

        this.mViewHolder.confirmP = findViewById(R.id.checkboxConfirm);

        this.mViewHolder.confirmP.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.checkboxConfirm){
            if (this.mViewHolder.confirmP.isChecked()){
                //salvar presença
                this.mSecurityPreference.setStringInPreference(FimAnoContants.PRESENCE_KEY, FimAnoContants.CONFIRMATION_YES);
            }else{
                //salvar ausencia
                this.mSecurityPreference.setStringInPreference(FimAnoContants.PRESENCE_KEY, FimAnoContants.CONFIRMATION_NO);


            }

        }

    }

    private static class ViewHolder{
        CheckBox confirmP;
    }
}

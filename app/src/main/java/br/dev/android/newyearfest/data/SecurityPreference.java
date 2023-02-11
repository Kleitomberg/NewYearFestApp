package br.dev.android.newyearfest.data;

import android.content.Context;
import android.content.SharedPreferences;

public class SecurityPreference {

    private SharedPreferences mSharedPreferences;

    public SecurityPreference(Context mContext){
        this.mSharedPreferences = mContext.getSharedPreferences("FestaFimAno", Context.MODE_PRIVATE);
    }

    public void setStringInPreference(String key, String value){
        this.mSharedPreferences.edit().putString(key,value).apply();
    }

    public String getStringInPreferenfce(String key){
        String valor = this.mSharedPreferences.getString(key,"");
        return valor;
    }


}

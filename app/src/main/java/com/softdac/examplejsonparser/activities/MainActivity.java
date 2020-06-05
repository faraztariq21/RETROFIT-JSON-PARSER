package com.softdac.examplejsonparser.activities;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.bigkoo.svprogresshud.SVProgressHUD;
import com.google.gson.Gson;
import com.softdac.examplejsonparser.R;
import com.softdac.examplejsonparser.model.Ayah;
import com.softdac.examplejsonparser.network.CustomCallback;
import com.softdac.examplejsonparser.network.WebServicesHandler;

public class MainActivity extends AppCompatActivity {

    TextView tvResponse;
    SVProgressHUD svProgressHUD;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResponse = (TextView) findViewById(R.id.response);

        svProgressHUD = new SVProgressHUD(this);

        svProgressHUD.show();
        WebServicesHandler.instance.getAyah(getAyah);
    }

    private CustomCallback<Ayah> getAyah = new CustomCallback<Ayah>() {

        @Override
        public void onSuccess(@NonNull Ayah response) {

            if(svProgressHUD.isShowing())
                svProgressHUD.dismiss();

            String endResult = "Arabic Text: " + response.getResult().getText() +
                    "\n" + "tname: " + response.getResult().getSuraDetail().getTname() +
                    "\n" + "Translation: " + response.getResult().getTranslate().getText();
            tvResponse.setText(endResult);
        }

        @Override
        public void onFailure(boolean completed, @Nullable Ayah response, @Nullable Exception ex) {

            if(svProgressHUD.isShowing())
                svProgressHUD.dismiss();
            if (ex != null)
                ex.printStackTrace();

        }
    };
}

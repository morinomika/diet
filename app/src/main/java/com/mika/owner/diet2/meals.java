package com.mika.owner.diet2;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class meals extends AppCompatActivity {

    ImageButton imageButton;

    static final int REQUEST_CODE_CAMERA = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meals);

        imageButton = (ImageButton) findViewById(R.id.imageButton);
    }

    public void sun11(View v){

        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, REQUEST_CODE_CAMERA);

    }

    public void onActivityResult (int requestCode, int resultCode, Intent intent){
        super.onActivityResult(requestCode, resultCode, intent);


        if(resultCode == RESULT_OK){
            if(requestCode == REQUEST_CODE_CAMERA){

                Bitmap bpm1 = (Bitmap) intent.getExtras().get("data");
                imageButton.setImageBitmap(bpm1);

            }else if (resultCode == RESULT_CANCELED){

                Toast.makeText(meals.this, "CANCEL", Toast.LENGTH_LONG).show();
            }
        }
    }
}

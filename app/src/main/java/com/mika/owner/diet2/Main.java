package com.mika.owner.diet2;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.InputStream;

public class Main extends AppCompatActivity {
//    EditText editText2;
//    EditText editText3;
//    int weight1;
//    int weight2;
//    int weight3;
//    int weight4;

    static final int REQUEST_CODE_GALLERY = 1;
    static final int REQUEST_CODE_CAMERA = 2;

    ImageView imageView;
    Button enter;
    Button change;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        editText2 = (EditText)findViewById(R.id.editText2);
//        editText3 = (EditText)findViewById(R.id.editText3);
//
//        String str1 = editText2.getText().toString();
//        int weight1 = Integer.parseInt(str1);
//
//        String str2 = editText3.getText().toString();
//        int weight2 = Integer.parseInt(str2);
//
//        int weight3 = weight1 / weight2 ;
//        int weight4 = weight1 - weight2 ;
//        int weight5 =
//
//        if (0 =< )









        imageView = (ImageView) findViewById(R.id.imageView);
        enter = (Button) findViewById(R.id.enter);
        change = (Button) findViewById(R.id.change);


    }
    public void enter(View v){

        Intent intent = new Intent(this, Calender.class);
        startActivity(intent);
    }

    public  void camera(View v){

        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, REQUEST_CODE_CAMERA);
    }

    public  void gallery(View v){

        Intent intent = new Intent(Intent.ACTION_PICK,
                android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        startActivityForResult(intent, REQUEST_CODE_GALLERY);
    }


    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent intent){
        super.onActivityResult(requestCode, resultCode, intent);

        if(requestCode == RESULT_OK){
            if (requestCode == REQUEST_CODE_GALLERY ){
                try{

                    InputStream inputStream = getContentResolver().openInputStream(intent.getData());
                    Bitmap bmp = BitmapFactory.decodeStream(inputStream);
                    imageView.setImageBitmap(bmp);
                }catch (Exception e){
                    Toast.makeText(Main.this, "エラー", Toast.LENGTH_LONG).show();
                }

            }else if(requestCode == REQUEST_CODE_CAMERA){
                Bitmap bpm = (Bitmap) intent.getExtras().get("data");
                imageView.setImageBitmap(bpm);

            }

        }else if (resultCode == RESULT_CANCELED){
            Toast.makeText(Main.this, "CANCEL", Toast.LENGTH_LONG).show();
        }
    }


}


package com.example.owner.diet2;

/**
 * Created by owner on 16/06/20.
 */
public class ListContent {


    private int resId1;
    private int resId2;
    private int resId3;


    public ListContent(int resId1, int resId2, int resId3){

        this.resId1 = resId1;
        this.resId2 = resId2;
        this.resId3 = resId3;
    }


    public int getResId1(){return this.resId1;
    }

    public int getResId2(){return this.resId2;
    }

    public int getResId3(){return this.resId3;
    }

}

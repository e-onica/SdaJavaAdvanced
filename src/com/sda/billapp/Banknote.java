package com.sda.billapp;

public abstract class Banknote implements PayableType{

    private int length;
    private int width;
    private int receivedLength;
    private int receivedWidth;



    @Override
    public boolean isFake(){
      return !(length == receivedLength && width == receivedWidth);
    }
}

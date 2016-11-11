package com.company;

public class Code {
    private String myCode , area , fill;
    private int num1 , num2;
    private String [] lgth;

    public Code(String code){
        myCode = code;
    }

    public String getCode(){
        return myCode;
    }

    public void hide(int p1, int p2){
        area = myCode.substring(p1,p2);
        num1 = p1;
        num2 = p2;
        lgth = new String[area.length()];
        for(String x: lgth)
            fill = fill + "X";
        myCode = myCode.substring(0,p1) + fill + myCode.substring(p2,myCode.length());

    }
    public void recover(int p1, int p2){
        myCode = myCode.substring(0,num1) + area + myCode.substring(num2, myCode.length());
    }
}
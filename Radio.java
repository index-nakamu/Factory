package com.company;

//ラジオ商品クラス

class Radio extends Seihin{
    private int radioSerialNumber;
    public void numberring() {
        radioSerialNumber = Counter2.getRadioNumber();
    }

    public void print() {
        System.out.println("このラジオに関する情報:");
        System.out.println(" 製造番号:" + radioSerialNumber);
    }
}
class Counter2 {
    private static int radioNum = 76;
    public static int getRadioNumber() {
        return radioNum++;//ラジオの製造番号を返す
    }
}
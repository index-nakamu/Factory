package com.company;
//制作者クラス２

class TvKoujyou extends Koujyou {
     public Seihin factoryMethod() {
         return new Television();
     }

     public void touroku(Seihin s) {
         Television t = (Television) s;
         t.numberring();
         t.setDate(Date.today());
     }
 }
class Date {
    public static String today() {
        return "2004/01/20"; //製造日を返す
    }
}

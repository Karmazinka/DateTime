package org.itstep;

public class Power {
    public static void main(String[] args) {
        //как за минимальное количество действий 2 возвести в 7 степень
        //В целочисленную степень
        int base = 2;
        int a2=base*base;
        int a4=a2*a2;
        int result = a4*a2*base;
        System.out.println(result);

        //В вещественную степень
        double dbase = 2.1;
        double dresult = Math.pow(2,2);
        System.out.println(dresult);


    }
}

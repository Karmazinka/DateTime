package org.itstep;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class DateTime {

    public static void main(String[] args) {
        Date date1 = new Date();
        System.out.println(date1);
        Calendar calendar = new GregorianCalendar(2022,2,17);
        System.out.println(calendar.getTime());
        calendar.add(Calendar.HOUR_OF_DAY, 1);
        Date date2 = calendar.getTime();
        System.out.println(calendar.getTime());

        //Сравнение дат
        boolean b = date1.after(date2);
        System.out.println(b);

        //Вычитание
        long diff = date1.getTime()-date2.getTime();
        long hours = diff/(1000*60*60);
        System.out.println(hours);
    }
}

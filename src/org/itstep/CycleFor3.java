package org.itstep;

public class CycleFor3 {
    public static void main(String[] args) {
        //Поднимаемся по всем ступенькам, но отмечаем только четные
        for (int i=0; i<10; i++){
            boolean b=i%2==0;
            if (b) System.out.println(i);
        }
        //
        for (int i=0; i<10; i++)
            if (i%2==0)
                System.out.println(i);
    }
}

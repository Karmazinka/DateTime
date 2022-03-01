package org.itstep;

public class While1 {
    public static void main(String[] args) {
        //Кузнечик прыгает на 1 см, затем на 2, на 3 и т.д. Через сколько прыжков он взберется на травинку высотой 50 см?
        int length=1;
        int way=0;

        /*
        for (int i=0; i<100; i++){
            way+=length;
            length++;
            //System.out.println(way);
            if (way>=50){
                System.out.println(i+1);
                break;
            }
        }
         */
        int n=0;
        while (way<50){
            way+=length;
            length++;
            n++;
        }
        System.out.println(n);
    }
}

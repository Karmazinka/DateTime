package org.itstep;

public class CycleFor2 {
    public static void main(String[] args) {
        //Счетчик имеется только у одного человека.
        //При этом первый поднимается вверх, а второй опускается вниз.
        for (int i = 0; i < 10; i++) { //10
            System.out.print(i);
            System.out.println("");
            System.out.println(9 - i);
            //for (int i=0; i<10; i++){ //10
        }
    }
}

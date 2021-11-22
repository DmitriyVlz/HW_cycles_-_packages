package ru.netology;

public class SQRService {

    public static void main(String[] args) {

        int count = 0; //вводим счётчик квадратов, входящих в диапазон

        for (int j = 10; j <= 99; j++) {             //внутр цикл перебора диапазона чисел
            int lowerRange = 200;  // нижн гран диапазона
            int upRange = 300;  // верхн гран диапазона
            int k;
            k = j * j;
            if (k > lowerRange && k < upRange) {  // сравниваем квадрат с параметром границы
                count++;  // включаем счётчик
            }

        }
        System.out.println("Количество чисел=" + count);
    }

}






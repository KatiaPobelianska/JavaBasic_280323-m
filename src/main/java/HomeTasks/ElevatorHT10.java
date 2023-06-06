package HomeTasks;

import java.util.Scanner;

public class ElevatorHT10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter pls the height of the house (H): ");
        int H = sc.nextInt();

        System.out.println("Enter pls the number of floors during the ascent (N): ");
        int N = sc.nextInt();

        System.out.println("Enter the number of floors when descending (M): ");
        int M = sc.nextInt();

        int liftsNeeded = calculateLiftsNeeded(H, N, M);
        System.out.println("The number of climbs required to get to the top floor: " + liftsNeeded);

    }
    private static int calculateLiftsNeeded(int H, int N, int M){
        int remainingFloors = H - M;
        int liftsNeeded = remainingFloors / (N - M);

        if(remainingFloors % (H - M) != 0){
            liftsNeeded++;
        }
        return liftsNeeded;
    }
}
//В этом примере приложения мы используем класс Scanner для получения ввода пользователя из консоли. Пользователю будет предложено ввести значения H, N и M, затем программа вычислит количество подъемов, необходимых для поднятия лифта на последний этаж.
//Метод calculateLiftsNeeded вычисляет количество подъемов, используя формулу: liftsNeeded = remainingFloors/(N – M). Если остаток от деления remainingFloors % (N – M) не равен нулю, то мы добавляем один подъем, поскольку лифт превысит количество этажей на последнем подъеме.
//
//Например, если введены значения H=200, N=50, M=1, программа выведет: "Количество подъемов, необходимых для поднятия на последний этаж: 4".
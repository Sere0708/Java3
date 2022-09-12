//Задача 2. Пусть дан произвольный список(ArrayList) целых чисел, удалить из него четные числа

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CollectStep15 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = 1;
        ArrayList<Integer> arrayList = new ArrayList<>();

        while (scanner.hasNextInt()){
            if (n % 2 != 0){
            arrayList.add(scanner.nextInt());
            }
            else scanner.next();
            n++;
        }

        for (int i = arrayList.size() - 1; i >= 0 ; i-- ) {
            System.out.print(arrayList.get(i) + " ");
        }
    }
}

// при вводе чисел я вводил 1,2,3,4,5,6,7,  чтобы увидеть ответ нажимал ctrl + C.  Ответ был 7,5,3,1,
// Наверное vscode не коректно работает или я что то делаю не так....



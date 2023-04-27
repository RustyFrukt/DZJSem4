/*
Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор
 */
/*
Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор
 */
import java.util.*;
public class summIt {
    public static void main(String[] args) {

        System.out.print("Введите количество элементов: ");
        Scanner scanner = new Scanner(System.in);
        Integer col = scanner.nextInt();

        LinkedList<Integer> list = new LinkedList<>();
        Random rnd = new Random();
        for (int i = 0; i < col; i++) {
            list.add(i, rnd.nextInt(10));
        }
        System.out.println(list);
        Sum(list);
    }
    static void Sum(LinkedList<Integer> list){
        int sum = 0;
        ListIterator<Integer> iterator = list.listIterator(0);
        while (iterator.hasNext()){
            sum = sum + iterator.next();
        }
        System.out.println("Сумма элементов в списке = " + sum);
    }
}
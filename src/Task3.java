public class Task3 {
    public static void main(String[] args) {
        int snikersPrice = 35;
        double candyPrice = 3.5;
        int snikersCount;
        int candyCount;
        int wallet = 1000;
        double change;
            snikersCount = wallet / snikersPrice;//считаем какое кол-во сникерсов получится купить
                System.out.println("Количество сникерсов: " + snikersCount);
            change = wallet % snikersPrice; //считаем сколько осталось денег на конфеты
            candyCount = (int) (change / candyPrice);//считаем кол-во конфет, которые мы купили на оставшиеся деньги
                System.out.println("Количество конфет: " + candyCount);
            change = change - candyCount * candyPrice;//считаем сдачу после покупки конфет
                System.out.println("Сдача: " + change);
    }
}

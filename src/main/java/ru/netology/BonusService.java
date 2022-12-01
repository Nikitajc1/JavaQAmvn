package ru.netology;

public class BonusService {
    public long calculate (long amount, boolean registered){
        if (amount < 0){
            System.out.println("Некорректное число");
            amount = 0;
        } else {
            int percent = registered ? 3 : 1;
            long bonus = amount * percent / 100;
            long limit = 500;
            if (bonus > limit) {
                bonus = limit;
            } return bonus;
        } return amount;
    }
}

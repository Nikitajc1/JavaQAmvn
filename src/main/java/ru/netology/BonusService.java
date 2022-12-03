package ru.netology;

public class BonusService {
    public long calculate (long amount, boolean registered){
        int percent = registered ? 3 : 1;
        long bonus = amount * percent / 100;
        long limit = 500;
        if (amount < 0) {
            bonus = 0;
        }
        if (bonus > limit) {
            bonus = limit;
        }
        return bonus;
    }
}

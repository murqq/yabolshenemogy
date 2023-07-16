package ru.netology.service;

public class CashbackHackService {
    private final int boundary = 1000;

    public int remain(int amount) {
        if (amount >= 0) {
            return boundary - amount % boundary;
        } else {
            throw new IllegalArgumentException("Amount should be non-negative");
        }
    }
}

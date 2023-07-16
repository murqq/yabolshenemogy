package ru.netology.service;

import org.junit.Assert;
import ru.netology.service.CashbackHackService;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void shouldReturnZeroForFullBoundaryAmount() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;

        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldReturnCorrectRemainderForLessThanBoundaryAmount() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expected = 100;

        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionForNegativeAmount() {
        CashbackHackService service = new CashbackHackService();
        int amount = -500;

        service.remain(amount);
    }
}

package ru.netology.service;


import org.testng.Assert;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void shouldReturnZeroForFullBoundaryAmount() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;

        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldReturnCorrectRemainderForLessThanBoundaryAmount() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expected = 100;

        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test(expectedExceptions = IllegalArgumentException.class)
    public void shouldThrowExceptionForNegativeAmount() {
        CashbackHackService service = new CashbackHackService();
        int amount = -500;

        service.remain(amount);
    }
}

package lv.lu.training.lesson2.lesson2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HomeWorkSummTest {
    private HomeWorkSumm victim;
    @Before
    public void SetUp(){
        victim=new HomeWorkSumm();
    }
@Test
    public void shouldReturnTotalOfTwoNumbers(){
        Class<? extends HomeWorkSumm> result=victim.getClass();
    Assert.assertEquals(80,result);

}

}
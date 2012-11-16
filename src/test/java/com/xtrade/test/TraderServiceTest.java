package com.xtrade.test;
import com.xtrade.services.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class TraderServiceTest {

@Test
public void test_getMessage(){
	TraderService traderService=new TraderService();
	assertNotNull(traderService.list());
}

}

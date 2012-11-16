package com.xtrade.test;
import com.xtrade.service.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class TraderServiceTest {

@Test
public void test_getMessage(){
	TraderService traderService=new TraderService();
	assertEquals("Result","hola Mundo",traderService.getMessage());
}

}

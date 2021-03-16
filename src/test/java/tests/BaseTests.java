package tests;

import org.junit.After;
import org.junit.Before;
import utils.Browser;
import utils.Utils;

public class BaseTests {
    @Before //executado antes dos teste iniciarem
    public void  setup(){
        Browser.loadPage(Utils.getBaseUrl());
    }

    @After //no final dos testes
    public void tearDown(){
        Browser.close();
    }
}

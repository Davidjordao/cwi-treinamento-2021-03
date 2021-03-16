package tests;

import org.junit.Test;
import utils.Browser;
import utils.Utils;

import  static  org.junit.Assert.assertTrue;

public class SetupTest extends  BaseTests{

    //exemplo de teste
    @Test
    public void testOpeningBrowserAndLoadPage(){

        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl()));
        System.out.println("Abrimos a navegador e carregamos a url!");
    }
}

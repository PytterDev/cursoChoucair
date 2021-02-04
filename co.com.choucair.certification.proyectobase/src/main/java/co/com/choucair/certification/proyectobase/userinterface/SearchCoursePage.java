package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
    public static final Target UNICHOUCAIR_BUTTON = Target.the("Image to select the choucair courses")
            .located(By.id("certificaciones"));
    public static final Target INPUT_COURSE = Target.the("Search the course")
            .located(By.id("coursesearchbox"));
    public static final Target GO_BUTTON = Target.the("Click to go to the course")
            .located(By.xpath("//*[@id='coursesearch']/fieldset/button"));
    public static final Target SELECT_COURSE = Target.the("Click to go to the course")
            .located(By.xpath("//*[@id='yui_3_17_2_1_1612469325882_296']"));
    public static final Target NAME_COURSE = Target.the( "Get the name of the course")
            .located(By.xpath("//*[@id='region-main']/div/div[1]/div/div[1]/h3/a"));
}

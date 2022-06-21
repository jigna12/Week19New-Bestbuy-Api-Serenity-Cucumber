package com.bestbuyapi.cucumber;

import com.bestbuyapi.testbase.TestBase;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/java/resources/feature",//path from feature file
 tags = "@SMOKE")
public class CategoriesRunner extends TestBase{

}

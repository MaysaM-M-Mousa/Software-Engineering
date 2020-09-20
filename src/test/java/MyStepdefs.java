import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.concurrent.Future;

public class MyStepdefs {

    ArrayList<Fruit> list=new ArrayList<Fruit>();
    int totPrice=0;

    @Given("The Price of a {string} is {int}")
    public void thePriceOfAIs(String name, int price) {
        Fruit fruit=new Fruit(name,price);
        list.add(fruit);
    }

    @When("I checkout {int} {string}")
    public void iCheckout(int count, String name) {
        for(Fruit fruit:list){
            if(name.equals(fruit.getName())){
                totPrice+= count * fruit.getPrice();
                break;
            }
        }
    }

    @Then("The total price should be {int}")
    public void theTotalPriceShouldBe(int actualPrice) {
        Assert.assertEquals(totPrice,actualPrice);
    }


}

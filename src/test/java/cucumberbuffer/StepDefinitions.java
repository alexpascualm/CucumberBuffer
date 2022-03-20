package cucumberbuffer;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions.*;



public class StepDefinitions {
	private BufferAcotado buf;
	private int a,b;
	@Given("Tengo buffer")
    public void Tengo_buffer() {
        buf=new BufferAcotado(10);
    }
	@When("Inserto a={int}")
	public void inserto_a(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		this.a=int1;
		buf.put(a);
	    
	}

	 @Then("size es uno")
	    public void size_es_uno() {
	    	equals(buf.size()==1);
	    }
	 @Then("Saco b={int}")
	    public void saco_b(int result) {
	    	assertEquals(result,buf.get());
	    }
	 @When("Inserto a={int} y b={int}")
		public void inserto_a_y_b(Integer int1, Integer int2) {
		    // Write code here that turns the phrase above into concrete actions
			this.a=int1;
			this.b=int2;
			buf.put(a);
			buf.put(b);
		    
		}

		 @Then("size es dos")
		    public void size_es_dos() {
		    	equals(buf.size()==2);
		    }
		 @When("lleno buffer")
		 public void lleno_buffer() {
		     // Write code here that turns the phrase above into concrete actions
		     for(int i=0;i<10;i++) {
		    	 buf.put(i);
		     }
		 }
		 @Then("esta lleno")
		 public void esta_lleno() {
		     // Write code here that turns the phrase above into concrete actions
		     equals(buf.isFull()==true);
		 }
		 @Then("esta vacio")
		 public void esta_vacio() {
		     // Write code here that turns the phrase above into concrete actions
		     equals(buf.isEmpty()==true);
		 }
		 


}

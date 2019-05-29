package com.TestingWebsites;
import org.testng.annotations.Test;

public class Myntra {
	Config2 dri = new Config2();
  @Test
  public void Amazonmethod() {
	  System.out.println("Entered");
	  dri.driver.get("https://www.Amazon.in");
	  
	  
  }
}

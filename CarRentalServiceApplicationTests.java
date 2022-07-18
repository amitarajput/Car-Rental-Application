package com.abc.demo;


import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.jdbc.Sql;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

 
@SpringBootTest(classes = SpringBootApplication.class, 
    webEnvironment = WebEnvironment.RANDOM_PORT)

public class CarRentalServiceApplicationTests {
	

	@Test
	void contextLoads() {
	}
  
	
	@LocalServerPort
  private int port;
 
  @Autowired
  private TestRestTemplate restTemplate;
 
  @Sql({ "schema.sql", "data.sql" })
  @Test
  public void testAllCars() 
  {
    Boolean assertTrue = (
        this.restTemplate
          .getForObject("http://localhost:" + port + "/car-rental", CarRentalServiceApplication.class) != null
          );
  }
 


}






package com.swim.DaoSpecs;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import com.swim.Dao.AsnDao;
import com.swim.model.Asn;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;



@RunWith(SpringRunner.class)
@SpringBootTest
public class AsnSpec {
	
	
@Autowired
	AsnDao asnDao;

	
	@Test
	public void getAsnById() {
		//Create an Asn object from Data in the DB
		Asn asn = asnDao.getAsnById(1);
		Assert.assertEquals(asn.getAsnid(), 1);
		
		
	}
	
	@Test
	public void getAllAsn() {
		
	}
	
	@Test
	public void createAsn() {
		// Create the Asn object
		Asn asn = new Asn();
		
		// Create data to be tested
		asn.setAsnid(12);
		asn.setExpectedArrivalDate("2018-06-15");
		asn.setExpectedArrivalTime("10:00");
		asn.setVendorId("13");
		asn.setStatus("In-Transit");
		
		// Call the method for the new asn object
		asnDao.createAsn(asn);
	}
	
	
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void deleteAsn() {
		asnDao.deleteAnsById(12);
		asnDao.getAsnById(12);
	}
	
	
	@Test
	public void updateAsn() {
		
		
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

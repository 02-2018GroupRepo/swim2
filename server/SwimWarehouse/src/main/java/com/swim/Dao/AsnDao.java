package com.swim.Dao;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.swim.model.Asn;

@Repository
public class AsnDao {
	
	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;

/*METHODS FOR CRUD ARE LISTED BELOW*/
	
	//Creates an Asn in the DB
	public void createAsn(Asn asn) {
		SqlParameterSource parameterSource = new BeanPropertySqlParameterSource(asn);
		jdbcTemplate.update("insert into asns values (:asnid, :vendorId, :expectedArrivalDate,:expectedArrivalTime, :status)",parameterSource);
	}
	
	// Create an Asn method to GET the AsnByID
	public Asn getAsnById(int id) {
		List<Asn> asnList = jdbcTemplate.query("SELECT * FROM asns WHERE asnId = " + id, new BeanPropertyRowMapper<Asn>(Asn.class)  );
		return asnList.get(0);
	}
	
	
	// Create an Asn method to Delete an AsnById
	public void deleteAnsById(int id) {
		HashMap<String, Integer> testMap = new HashMap<>();
		testMap.put("id", id);
		jdbcTemplate.update("DELETE FROM asns WHERE asnId = :id ", testMap);
	

	}
	
	
}

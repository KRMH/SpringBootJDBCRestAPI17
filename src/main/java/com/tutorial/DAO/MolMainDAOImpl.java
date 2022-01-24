package com.tutorial.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.tutorial.model.FcOrderLineAlert;
import com.tutorial.model.MolMain;

@Repository
public class MolMainDAOImpl implements MolMainDAO{
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public List<MolMain> getAll() {
		return jdbcTemplate.query("SELECT mm.id, mm.site_id, mm.ABC_CATEGORY, FA.ORDER_LINE_ID, FA.ALERT_ID, FA.ID ID_FC FROM MOL_MAIN_VO MM, FC_ORDER_LINE_ALERT FA WHERE MM.ID = FA.ORDER_LINE_ID", new ResultSetExtractor<List<MolMain>>() {

			@Override
			public List<MolMain> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<MolMain> molMainList = new ArrayList<MolMain>();
				while(rs.next()) {
					MolMain molMain = new MolMain();
					molMain.setId(rs.getLong("ID"));
					molMain.setSiteId(rs.getLong("SITE_ID"));
					molMain.setAbcCategory(rs.getString("ABC_CATEGORY"));
					List<FcOrderLineAlert> fcOrderLineAlertList = new ArrayList<FcOrderLineAlert>();
					FcOrderLineAlert fcorderLineAlert = new FcOrderLineAlert(rs.getLong("ID_FC"), rs.getLong("ORDER_LINE_ID"), rs.getLong("ALERT_ID"));
					fcOrderLineAlertList.add(fcorderLineAlert);
					molMain.setFcOrderLineAlert(fcOrderLineAlertList);
					molMainList.add(molMain);
						
				}
				return molMainList;
			}
			
			
			
			
			
			
		}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				);
	}
}

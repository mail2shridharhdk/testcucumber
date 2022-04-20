package my.newtonica.mycucu;

import java.util.List;
import java.util.Map;

import io.cucumber.core.logging.Logger;
import io.cucumber.core.logging.LoggerFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

public class ColumnStepDefinitions {

	private static Logger log=LoggerFactory.getLogger(ColumnStepDefinitions.class);
	@Given("I have data in table with 1 column")
	public void i_have_1_col_table(List<String> dataTable) {
		
		log.info(()->dataTable.toString());
		log.info(()-> dataTable.get(0));
		
	}
	
	@Given("I have data in table with 2 column")
	public void i_have_2_col_table(Map<String,String> dataTable) {
		
		log.info(()->dataTable.toString());
		log.info(()-> dataTable.get("field2"));
		
	}
	
	@Given("I have data in table with datatable")
	public void i_have_table_col_table(DataTable dataTable) {
		
		log.info(()->dataTable.toString());
		log.info(()-> dataTable.column(2).get(1));
		
	}
}

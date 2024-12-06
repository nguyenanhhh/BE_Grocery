package utils;

import org.hibernate.boot.model.naming.Identifier;
import org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl;
import org.hibernate.engine.jdbc.env.spi.JdbcEnvironment;

public class CustomNamingStrategy extends PhysicalNamingStrategyStandardImpl{
	 @Override
	    public Identifier toPhysicalColumnName(Identifier name, JdbcEnvironment context) {
	        String columnName = name.getText();
	        if (columnName.equals("isActive")) {
	            return name;
	        }
	        if (columnName.equals("isSelling")) {
	            return name;
	        }
	        // return default name for other columns
	        return super.toPhysicalColumnName(name, context);
	    }
	 
}

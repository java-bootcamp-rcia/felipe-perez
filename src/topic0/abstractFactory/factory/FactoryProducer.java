package topic0.abstractFactory.factory;

public class FactoryProducer {

    public static AbstractSQLFactory getFactory(String sqlType){
        if (sqlType.equalsIgnoreCase("MySQL")){
            return new MySQLFactory();
        }else if (sqlType.equalsIgnoreCase("MS-SQL")){
            return new MSSQLFactory();
        }else if (sqlType.equalsIgnoreCase("Oracle")){
            return new OracleSQLFactory();
        }else if (sqlType.equalsIgnoreCase("PostgreSQL")){
            return new PostgreSQLFactory();
        }
        return null;
    }
}

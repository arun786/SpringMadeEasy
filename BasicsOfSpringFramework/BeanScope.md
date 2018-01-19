# Bean Scope

1. Singleton - by default beans are singleton
2. Prototype
3. Request
4. Session

To enable Bean Scope, 

We can use ConfigurableBeanFactory can be used.

    @Component
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    public class BinarySearch implements SearchAlgorithm {

This will make the BinarySearch Singleton class


    @Component
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public class BinarySearch implements SearchAlgorithm {

This will make the BinarySearch Non Singleton class


We have a requirement where we need to have a singleton class which is calling but the class 
which is autowired should be prototype, then we need to create a proxy.

Below Example 

1. PersonDAO is the class which is dependent on JDBCConnection.

2. JDBCConnection should have Non Singleton bean each time it is called, we need to use the 
below configuration.

    @Component
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
    public class JDBCConnection {
    
 to make the JDBCConnection Non-Singleton
    
    @Component
    public class PersonDAO {
    
        @Autowired
        private JDBCConnection jdbcConnection;
    
        public JDBCConnection getJdbcConnection() {
            return jdbcConnection;
        }
    }
    
    @Component
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
    public class JDBCConnection {
    
        public JDBCConnection() {
            System.out.println("JDBCConnection...");
        }
    }
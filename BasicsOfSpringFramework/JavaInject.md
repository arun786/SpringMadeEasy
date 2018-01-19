# Container and Dependency Injection (CDI)

    1. @Inject is similar to @Component.
    2. @Named is similar to @Autowired.
    3. @Qualifier is similar to @Qualifier of Spring
    4. @Scope is similar to @Scope of Spring
    5. @Singleton is similar to ConfigurableBeanFactory.SCOPE_SINGLETON
    6. @Provider
    
    
    Example being 
    
    @Named
    public class SomeCDIBusiness {
    
        @Inject
        private SomeCdiDao someCdiDao;
    
        public void call() {
            someCdiDao.call();
        }
    }
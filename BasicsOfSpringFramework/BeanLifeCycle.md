# Beanlife Cycle

## Using Annotation

    @PostConstruct
    @PreDestroy

### @PostConstruct 

It is called after all the beans are injected. This is basically used
to initialise.

### @PreDestroy

This is called to remove any resource before the instance is being removed

## Using XML

    1. init-method
    2. destroy-method
    
    These are used in bean definition in xml file.
    

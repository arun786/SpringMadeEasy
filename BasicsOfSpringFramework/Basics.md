# Basics Of SpringFramework

## Annotations used in Spring Boot

1. @SpringBootApplication
2. @Autowired
3. @Component
4. @Service
5. @primary
6. @Qualifier

Types of Injection

1. setter
2. constructor

TODO Difference between the two.

## @Qualifier 

This is used when you create more than one bean of the same type and you need to 
autowire a specific bean.

example: 

public interface SortAlgorithm {
    int[] sort(int[] numbers);
}


@Service
@Qualifier("BubbleSort")
public class BubbleSort implements SortAlgorithm {
    @Override
    public int[] sort(int[] numbers) {
        return new int[0];
    }
}

@Service
@Qualifier("QuickSort")
public class QuickSort implements SortAlgorithm {
    @Override
    public int[] sort(int[] numbers) {
        return new int[0];
    }
}

In the class where we call, we can use

    @Autowired
    @Qualifier("BubbleSort")
    private SortAlgorithm sortAlgorithm;
    
Note : We can use autowire by Name, where we create the reference of the interface based on the name

say above example will be 

    @Autowired
    private SortAlgorithm quickSort;

The above will call QuickSort Algorithm

    @Autowired
    private SortAlgorithm bubbleSort;
   
This will call BubbleSort Algorithm


    


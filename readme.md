# Java 8 new features.

## Functionan Interface
The interface with only one abstract method.
```
a. Runnable  -- run()
b. Comparable -- compareTo()
c. ActionListener -- acvtionperformed
d. callable --call()

```

## Default Methods (defender methods or virtual extension methods.)
```java
default void m1(){
    System.out.println (“Default Method”);

}
```

## Static methods inside Interface
``` java
interface Interf { 
     public static void sum(int a, int b) { 
         System.out.println("The Sum:"+(a+b)); 
         }
     }
```

interface static method not available to implementatio class. It is used using interface name.
Overiding concept not allowed with static methods.

## Predicates
A function that take one argument and return true or false value.
Predicate is presebt in java.util.function package
it is functional interface that contains only one method called test()

```java
interface Predicate<T>{
    public boolean test(T t);
}
```


## Predicate joining

It is possible eto join predicate uisng following methods:

a. and()
b. or()
c. negate()


## Functions

It is functional interface that contains apply method(). take one input and return one output.
```java
interface funbction(T,R){
    public R apply(T t);
}
```


## Method References
functional interaface can be mapped using method(instance or static)
functional expression and our method should have same argument types.



## Lambda Expression
 nameless function 
 referred by functional interface


 ## constructor refernces
 classnname::new

 ```
 In method and constructor references compulsory the argument types must be matched
 ```

## Stream Api

stream is default method added to collectiuon interface in 1.8 version.
Stream is interface present in java.util.stream.


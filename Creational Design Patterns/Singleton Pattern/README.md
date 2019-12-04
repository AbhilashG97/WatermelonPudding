# Singleton Pattern

Singleton Pattern is a creational design pattern that ensures a class has only one instance, and provides a global point of access to it.  

Singletons can be primarily initialized in two ways - 

1.  Early Initialization
1.  Lazy Initialization

## Early Initialization

The singleton instant is initialized at the beginning itself. This method is also thread-safe. 

Here the variable is declared as ```final``` as this will ensure that the variable will be initialized only once. 

The code implementation for early initialization can be found [here]().

## Lazy Initialization

In this method, the singleton instance is initialized in the ```getInstance()``` method.

Depending on how lazy initialization is implemented, it may or may not be thread safe.

### Normal approach

This way of implementing singleton is not thread safe and this should not be used to avoid critical bugs. 

The implementation for this method can be found [here](#).

Multiple objects can be created if two threads call the ```getInstance()``` at the same time. 

### Synchronized method approach 

In this method the ```synchronized``` keyword is used to ensure that only one thread can access the ```getInstance()``` method.  

:warning: Using ```synchronized``` on the whole method can significantly reduce the performace of the application. This way of implementing singleton should not be used in cases where high performace is required. 

### Double Locking approach

This way of implementing a singleton makes use of the ```volatile``` and ```synchronized``` keyword. The singleton instance is marked with the ```volatile``` keyword whereas the ```synchronized``` block is used inside the ```getInstance()``` method. 

On careful examination of the ```getInstance()``` method it can be concluded that ```synchronized``` keyword is only needed for the first time when the singleton instance is created. Thus, instead of using the ```synchronized``` keyword on the whole method, it can be used on a specific part of the method which actually requires the ```sychronized``` block.

This ensures that there is no severe performance reduction when the ```synchronized``` keyword is used. 

The implementation for this approach cam be found [here](#).
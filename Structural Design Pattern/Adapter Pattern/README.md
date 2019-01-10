# Adapter Design Pattern

## Introduction and defintion

The ```adapter pattern``` is a software design pattern (also known as ```wrapper```) that allows the interface of an existing class to be used as another interface. It is often used to make existing classes work with others without modifying their source code.

It is a type of structural design pattern.

This design pattern contains the following elements - 

1. Adapter Interface (Abstract entity)
1. Adapter Concretion
1. Adaptee Class

These entities are related in the following manner - 




There are two ways to implement Adapter Pattern, which are as follows: 

1.  **Implementation by composition**: 

    In this implementation the follwoing is done:

    An instance of the Adaptee is created inside the Adapter to access the required method. Also, the Adapter class implements the AdapterInterface.

1. **Implementation through multiple inheritance**

    In this implementation the following is done:

    An instance of the Adaptee is created inside the Adapter to access the required method. Also, here the Adapter class extends the Adaptee and it also implements the AdapterInterface.  

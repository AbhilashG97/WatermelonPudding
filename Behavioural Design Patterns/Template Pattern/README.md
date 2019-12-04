# Template Method Pattern 

This is a behavioural design pattern where it defines the steps to execute an algorithm and it can provide default implementation that might be common for all or some of the subclasses.

The template method is always kept final to prevent its sub-classes from making changes to it. 

:warning: The reason the template method is kept ```final``` is to prevent its sub-classes from making changes to the order of execution of the methods called inside of it.

## Hook() in Template method pattern

An optional ```hook()``` method can also be provided in the template method. The ```hook()``` method is a **non-abstract** method with no method body. 

Since, the ```hook()``` method is not abstract, the sub-classes may or may not provide an implementation for this method. 
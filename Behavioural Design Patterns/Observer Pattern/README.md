# Observer Pattern

## Introduction 

> It defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically. 

Depending on the style of notification, the observer may also be updated with new values. 

:warning: The subject is the sole owner of the state data. Observers do not have direct access to the state data; they rely on the subject to get the latest data.

:boom: **One-to-many** and **loosely coupled** are two important attributes of the Observer pattern.

Some advantages of having loosely-coupled code in Observer pattern are as follows - 

1.  Observers can be registered any time. 
1.  The Subject doesn't have to be modified to add new observers. 
1.  Subjects and observers can be re-used as they are independent of each other. 
1.  Changes in either Subject or Observer will not affect each other. 

:boom: Instance of ```Subject```/```Observable``` is present in the ```Observer``` as it makes it easy to register and un-register observers.

**pull vs poll**

```pull``` uses force to move something towards oneself. 

```poll``` : One polls a server when a client asks the server for something.

**In-built Java API**

The in-built Java API has a ```setChanged()``` method which needs to be called if the observers are required to get the updated value. The observers will not receive any updates if the ```setChanged()``` method is not called.

## UML Diagram


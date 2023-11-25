# Entity Component System Architecture Demo 

This project contains a rough architecture written in Java for 
the popular design pattern known as Entity Component System "ECS". 

This follows the composition over inheritance approach in designing modular systems. 

The ESystem class can be used to "query" entities given their components. 

"Player" Entity class has the following components, "Health" and "Magic". 
"Enemy"  Entity class has the following components, "Health" and "Physics". 

We can use the ESystem class to query entities within the system. 
A union query like: 
    ```
      ESystem.queryByUnion("Health") 
     ```
would return both the Player and Enemy entity classes, since they both have the "Health" component. 

A intersection query like: 
```
    ESystem.queryByIntersection("Health", "Physics") 
  ```
Would only return the Enemy class, since only the enemy class has both "Health" and "Physics" components. 

Reference: [Wiki article on ECS](https://en.wikipedia.org/wiki/Entity_component_system)
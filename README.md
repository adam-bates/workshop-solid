# Workshop on SOLID Principles
###### [Adam Bates](https://github.com/adam-bates) | [adam@adambates.ca](mailto:adam@adambates.ca)

The 5 SOLID Principles are a set of principles compiled together by Robert C. Martin (aka. Uncle Bob), which are meant to be principles of structuring and developing clean and scalable software.

### Single Responsibility Principle (SRP)
> A class should have only one reason to change.

Classes should have one responsibility. If you use the word "and" while describing your class, it's probably not following this principle.

### Open-Closed Principle (OCP)
> Software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification.

Extending classes, reimplementing interfaces, and using dependency injection allows us to add funcitonality to our software, without modifying the classes that have already been deployed and may be used by other APIs or libraries.

### Liskov Substituition Principle (LSP)
> Let *ϕ(x)* be a property provable about objects *x* of type *T*. Then *ϕ(y)* should be true for objects *y* of type *S* where *S* is a subtype of *T*.

Barbara Liskov was clearly a mathematician. What she's essentially saying is anything a parent can do, a child should also be able to do **without consequences**. This means it's bad structure to implement a method in a class and have unreasonable side-effects (a Square class probably shouldn't extend a Rectangle class), or throw some sort of UnsupportedOperationException.

### Interface Segregation Princple (ISP)
> No client should be forced to depend on methods it does not use.

Essentially, only add methods to interfaces or abstract classes if every child ever will always require that method. Most interfaces can usually be split up into smaller interfaces, which makes some functionality accessible without requiring a large interface. Often times this principle and LSP are closely related. Solving one will usually lead to solving another.

### Dependency Inversion Principle (DIP)
> A. High-level modules should not depend on low-level modules. Both should depend on abstractions.
>
> B. Abstractions should not depend on details. Details should depend on abstractions.

Not the same as *dependency injection*, but this principle does usually use *dependency injection*. Essentially all it's saying is your abstract classes and interfaces should only require the use of other abstract classes or interfaces, not concrete classes. And your implementation of classes should be requiring abstract classes or interfaces.

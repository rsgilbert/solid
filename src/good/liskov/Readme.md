# Liskov Substitution principle

In a computer program, if S is a subtype of T, then 
objects of type T maybe replaced with objects of type S
without altering any of the desirable properties of that
program (correctness, task performed, etc).

This can be interpreted to mean that functions that reference base 
classes must be able to use objects of derived classes without knowing it.

Violation of this principle will most likely lead to buggy or difficult to maintain code.

Violation of the Liskov Substitution principle can often
be noticed by a method in a derived class that does nothing or can not be implemented.

If you're writing objects which extend classes but fail the Is-A test, you're likely violating the Liskov Substitution principle.

The solution to the problem is a correct inheritance hierarchy.



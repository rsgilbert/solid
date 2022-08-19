# DEPENDENCY INVERSION

A. High level modules should not import anything from low level modules. Both should depend on abstractions such as interfaces.

B. Abstractions should not depend on details ie concrete implementations. Details should depend on abstractions.

The low level modules provide implementations for the abstractions/interfaces.
The high level modules depend on the abstractions/interfaces.
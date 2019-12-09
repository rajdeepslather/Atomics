# Atomics

In Java and many other languages, there are two kinds of locking mechanisms allowed for concurrent programming. One is a complete lock (synchronize) and the other is a read and write lock (ReadWriteLock). While syncronize has very little overhead, it suffers from the fact that it treats reads the same as writes. ReadWriteLock, on the other hand, adds too much overhead, making it inefficient in cases where reads don't outnumber writes by a large amount.

However, if the data structures we are working with are immutable, then we can have a third kind of scheme where the read requires no locking at all, this can be done by making use of volatile keyword in Java.

The AtomicWrite class is such a scheme. This implementations is measurably faster than both synchronized and ReadWriteLock while working with immutable objects. Moreover, it's also faster than Java's own AtomicReference in many cases. It's also generalized it using Generics and used functional programming to abstract the locking details from the user.

This implementation can be used as-is in another program or used as a template for writing fast concurrent code while ensuring correctness. 

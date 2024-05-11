Useful Test Methods
==
JUnit provides a lot of different test methods. The following will at least get you started:


- `assertEquals(o1, o2)`  - the test passes if o1 and o2 are equal. For basic types, the equality operator is used for comparison, and for object types, the equals method is used.


- `assertTrue(b1)` - the test passes if the boolean expression b1 is true.


- `assertSame(o1, o2)` - the test passes if o1 and o2 refer to exactly the same object


- `fail()` - the test will never pass. This method is useful if the test is more complex, and for example, within a loop, it is determined in a certain situation that the test cannot be passed.
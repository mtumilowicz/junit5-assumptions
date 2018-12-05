[![Build Status](https://travis-ci.com/mtumilowicz/junit5-assumptions.svg?branch=master)](https://travis-ci.com/mtumilowicz/junit5-assumptions)

# junit5-assumptions
Simple example of Junit5 Assumptions.

_Reference_: https://junit.org/junit5/docs/current/user-guide/#writing-tests-assumptions  
_Reference_: https://junit.org/junit5/docs/current/api/org/junit/jupiter/api/Assumptions.html

# preface
Assumptions is a collection of utility methods that 
support conditional test execution based on assumptions.

**In direct contrast to failed assertions, failed assumptions 
do not result in a test failure; rather, a failed 
assumption results in a test being aborted.**

# project description
It is often very handy to exclude some tests from running
on CI - for example - we don't want to run tests that 
creates files (for example - 
there are no permissions to create files on Travis server).

The easiest configuration will be:
```
var file = new File("file.txt");

assumingThat(() -> !Objects.equals(System.getProperty("user.name"), "travis"),
        () -> assertTrue(file.createNewFile()));

file.delete();
```
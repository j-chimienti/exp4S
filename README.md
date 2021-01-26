## Exp4s

Scala wrapper around Exp4j library. This is still under-development and 
more features to come. Read more about [exp4j](http://www.objecthunter.net/exp4j/). 

### Install

tag:
scala 2.11 = 0.0.4
scala 2.13 = 0.0.5

```
lazy val exp4S = RootProject(uri("https://github.com/JWWeatherman/exp4S.git#<TAG>"))

lazy val myproject = (project in file("."))
  .dependsOn(exp4S)
  .aggregate(exp4S)
```




### Usage


      import Exp4sProcessor._
      
**Step 2**

      // a more idomatic way of doing
      // pass the formula , the variables followed by the values
      val x = forFormula("(sqrt(a^2) + sqrt(b^2))")("a", "b")(1, 2)
      println(x)

**Step3**

      // shortcut and simplified one  - formula followed by "with" keyword and variables and values as next set of params
      val compiledForm: Double = compileFormula("(sqrt(a^2) + sqrt(b^2)) with a,b", 1, 2)
      println(compiledForm)
      
### @TODO 

* support for custom functions
* support for async formula execution

### License

Licensed under the Apache License, Version 2.0: http://www.apache.org/licenses/LICENSE-2.0

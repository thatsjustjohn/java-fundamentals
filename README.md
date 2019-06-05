# java-fundamentals
CF 401

## Labs
1. [The basics directory has a Main.java file that contains methods](https://github.com/thatsjustjohn/java-fundamentals/blob/master/basics/Main.java)
    - ```pluralize(String, Int)```
    - ```flipNHeads(Int)```
    - ```clock()```
    - ```convertSpeed()```
2. [The basiclibrary contains a file with the following functions with tests](https://github.com/thatsjustjohn/java-fundamentals/blob/master/basiclibrary/src/main/java/basiclibrary/Library.java)
    - ```roll()```
    - ```containsDuplicates()```
    - ```arrayAverage()```
    - ```twoDArrayAverage()```
3. [The basiclibrary contains a file with the following functions with tests](https://github.com/thatsjustjohn/java-fundamentals/blob/master/basiclibrary/src/main/java/basiclibrary/Library.java)
    - ```analyzeWeatherData()```
    - ```tally()```
    - [linter is a Java App that returns lines with semicolon errors](https://github.com/thatsjustjohn/java-fundamentals/blob/master/linter/src/main/java/linter/LinterReader.java)
4. [Inheritance](https://github.com/thatsjustjohn/java-fundamentals/tree/master/inheritance/src/main/java/inheritance)(Update June 5)
    - [Interface Business](https://github.com/thatsjustjohn/java-fundamentals/blob/master/inheritance/src/main/java/inheritance/Business.java)
        - ```addReview(Review)``` Takes in a Review Object and adds it to a list
        - ```toString()```
        - [Class Restaurant](https://github.com/thatsjustjohn/java-fundamentals/blob/master/inheritance/src/main/java/inheritance/Restaurant.java)
        - [Class Shop](https://github.com/thatsjustjohn/java-fundamentals/blob/master/inheritance/src/main/java/inheritance/Shop.java)
        - [Class Theater](https://github.com/thatsjustjohn/java-fundamentals/blob/master/inheritance/src/main/java/inheritance/Theater.java)
            - ```addMovie(String)``` Takes in a String and adds it to the movie list
    - [Class Review](https://github.com/thatsjustjohn/java-fundamentals/blob/master/inheritance/src/main/java/inheritance/Review.java)
        - ```toString()```
        - [Class MovieReview extends Review](https://github.com/thatsjustjohn/java-fundamentals/blob/master/inheritance/src/main/java/inheritance/MovieReview.java)
            - ```toString()```



## Testing
For testing just run 
```./gradlew test```
Within the respective folder

# Java Test
Simple Java code exercises that are related to practical coding.

## Setup
1. Install [IntelliJ Community Edition](https://www.jetbrains.com/idea/download/)
2. Install [Java 17](https://www.oracle.com/java/technologies/downloads/#java17)
3. Install [git](https://git-scm.com/)
4. [Fork and Clone](https://docs.github.com/en/get-started/quickstart/fork-a-repo).
5. Open cloned folder in IntelliJ.  It should detect this is a `gradle` project.
6. Implement the methods in [Exercises](./src/main/java/edu/sample/Exercises.java).
7. Run the [ExercisesTest](./src/test/java/edu/sample/ExercisesTest.java) to check your solutions.

## Project
The JSON is the return from the [USDA Search API](https://fdc.nal.usda.gov/api-guide.html).
and is read from the following file: [search-apple.json](./src/test/resources/search-apple.json).

## Gradle Tasks
All gradle tasks can be [Run in IntelliJ](https://www.jetbrains.com/help/idea/work-with-gradle-tasks.html#gradle_tasks).
The following are how to run the commands using a command line shell.

This project uses the Gradle Wrapper, so you'll run gradle commands with either:
* `gradlew.bat` (windows)
* `gradlew` (mac / linux)

For brevity, all examples will start with `./gradlew`.

### Run Tests
```shell
./gradlew test
```

### Install Without Testing
```shell
./gradlew build -x test
```

## Project Information
Because boilerplate sucks, classes in the `usda_api_object` package are annotated with 
[lombock](https://projectlombok.org/) to fulfil the [Java Bean](https://en.wikipedia.org/wiki/JavaBeans) contract.

Because hydrating objects sucks, this project uses [Jackson Object Mapper](https://github.com/FasterXML/jackson-databind)
to read JSON into an object.
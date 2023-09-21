Try running:

    MAVEN_OPTS="--enable-preview" ./mvnw clean compile exec:java

or:

    ./gradlew clean compileJava run

Also try running:

    java --enable-preview --source 21 ./src/main/java/dev/softwaregarden/jep443/JEP443Demo.java

and even perhaps:

    java --enable-preview -jar target/jep443demo-1.0-SNAPSHOT.jar

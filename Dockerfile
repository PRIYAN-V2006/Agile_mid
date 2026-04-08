FROM eclipse-temurin:17
COPY notes.jar notes.jar
CMD ["java", "-jar", "notes.jar"]
FROM openjdk:8
EXPOSE 8080
ADD target/java-cicd-githubaction.jar java-cicd-githubaction.jar
ENTRYPOINT ["java","-jar","/java-cicd-githubaction.jar"]

FROM frolvlad/alpine-oraclejdk8:slim
# environment
EXPOSE 8080

VOLUME /tmp
ADD @project.artifactId@-@project.version@.jar app.jar

RUN sh -c 'touch app.jar'
ENTRYPOINT ["java", "-Xmx512m", "-Xss32m","-Djava.security.egd=file:/dev/./urandom","-jar","app.jar"]
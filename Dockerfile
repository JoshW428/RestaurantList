FROM openjdk:8
RUN mkdir -p /opt/my/service
ADD /var/jenkins_home/workspace/RestaurantList/target/RestaurantWeb-0.0.1-SNAPSHOT.jar /opt/my/service
EXPOSE 9000
CMD ["java", "-jar", "/opt/my/service/RestaurantWeb-0.0.1-SNAPSHOT.jar"]

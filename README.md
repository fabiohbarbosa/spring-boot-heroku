# spring-boot-heroku
Heroku Spring Boot Example With Maven

### Table of contents
1. [Configure Heroku](#configure-heroku)
    1. [Generate SSH Key](#generate-ssh-key)
    1. [Addings Key to Heroku](#addings-key-to-heroku)
    1. [Create Heroku App](#create-heroku-app)
    1. [Configure Spring Boot](#configure-spring-boot)
    1. [Configure Heroku Spring Boot Deploy](#configure-heroku-spring-boot-deploy)
    1. [Deploy Application](#deploy-application)
    1. [Test your Application](#test-your-application)
1. [Next Steps](#next-steps)


### Configure Heroku

##### Generate SSH key
```sh
ssh-keygen -t rsa
```

##### Addings Key to Heroku
```sh
heroku keys:add
```

##### Create Heroku App
```
heroku create your-application-name
```

##### Configure Spring Boot
Here I'm listing the most important configurations of Spring Boot

```xml
<plugin>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-maven-plugin</artifactId>
    <version>${spring.version}</version>
    <executions>
        <execution>
            <goals>
                <goal>repackage</goal>
            </goals>
            <configuration>
                <finalName>${artifactId}</finalName>
            </configuration>
        </execution>
    </executions>
</plugin>

<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-jar-plugin</artifactId>
    <version>2.3.2</version>
    <configuration>
        <finalName>${artifactId}</finalName>
    </configuration>
</plugin>
```

**finalName** in *spring-boot-maven-plugin* and *maven-jar-plugin*, are very important to fix the name of JAR file, so we can configure the Procfile.

The **repackage goal**, repackaging an application as an executable JAR/WAR as well as a goal for running the application.

##### Configure Heroku Spring Boot Deploy

Create Procfile with the content

```sh
web: java -Dserver.port=$PORT -jar target/spring-boot-heroku.jar
```

##### Deploy Application
```sh
git push heroku master
```

##### Test your Application

Access the Spring Actuator API:

https://your-application-name.herokuapp.com/health

or
```sh
curl https://your-application-name.herokuapp.com/health
```

### Next Steps
Hot deploy on Heroku...

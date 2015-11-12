# spring-boot-heroku
Heroku Spring Boot Example

### Table of contents
1. [Generate SSH Key](#generate-ssh-key)
1. [Addings Key to Heroku](#addings-key-to-heroku)
1. [Create Heroku App](#create-heroku-app)
1. [Configure Heroku Spring Boot Deploy](#configure-heroku-spring-boot-deploy)
1. [Deploy Application](#deploy-application)
1. [Test your Application](#test-your-application)




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

Access:

https://your-application-name.herokuapp.com/health

or

```sh
curl https://your-application-name.herokuapp.com/health
```
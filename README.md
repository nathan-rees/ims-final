# Project Title

```
This is an inventory management system. It uses a persistant database storage hosted from a GCP server.
Implemented in Java 8.I also have a jenkins server running that is configured to use this github repsoitory
and build so sonarqube can run static code analysis on my project- where i will propagate the issues to my github.
```

## Getting Started

```
First use "git clone" to copy the repository to your local machine.
Create a database (using my sql script "inventory.sql") on a server.
Enter the ip and port used for this DB on the program source code.

install maven and jenkins on a VM (make sure to enable traffic to port 3306 and 8080).
Grab the password for jeknins inside of your VM and access it through port 8080 on another machine (using http).
Create a new item and post your github in the config. Add some execute commands to the config that builds the project and sends it to sonarqube.
```

### Prerequisites


```

You will need to have a DBMS,git,java ide, on your local machine cloud service (or server)

```

### Installing

A step by step series of examples that tell you how to get a development env running

Say what the step will be

```
Install eclipse
install java sdk and add path to environment variables

```


```
until finished
```

End with an example of getting some data out of the system or using it for a little demo

## Running the tests

```
These should be automatically updated within the CI pipeline via jenkin, when you push to your specified github repository
(given you have set up jenkins correctly)
Alternatively, you can run the it manually through jenkins

I have included unit tests. These test make sure to see if the classes are working correctly
The object should be created without any issues. 
However the databse data extraction is not included and this subsequently would need an integration test for further improvement.

```

### Integration Tests 
Explain what these tests test, why and how to run them

```
Using moquito framework, you can create a test database- and override some functions so they return 
```


## Deployment

Add additional notes about how to deploy this on a live system

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management

## Versioning

We use [SemVer](http://semver.org/) for versioning.

## Authors

* **Nathan Rees** - *Initial work* - (https://github.com/nathan-rees

## License

This project is licensed under the MIT license - see the [LICENSE.md](LICENSE.md) file for details 

*For help in [Choosing a license](https://choosealicense.com/)*

## Acknowledgments

* Hat tip to anyone whose code was used
* Inspiration
* etc

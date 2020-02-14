# Project Title

```
This is an inventory management system. It uses a persistant database storage hosted from a GCP server. Implemented in Java 8
I also have a jenkins server running that is configured to use this github repsoitory and build so sonarqube can run static code analysis on my project- where i will propagate the issues to my github.
```

## Getting Started

```
First use "git clone" to copy the repository to your local machine.
Create a database (using my sql script "inventory.sql") on a server. Enter the ip and port used for this DB on the program source code.

install maven and jenkins on a VM (make sure to enable traffic to port 3306 and 8080). Grab the password for jeknins inside of your VM and access it through port 8080 on another machine (using http). Create a new item and post your github in the config. Add some execute commands to the config that builds the project and sends it to sonarqube.
```

### Prerequisites

You will need to have a DBMS,git,java ide, on your local machine cloud service (or server)

```
Give examples
```

### Installing

A step by step series of examples that tell you how to get a development env running

Say what the step will be

```
Give the example
```

And repeat

```
until finished
```

End with an example of getting some data out of the system or using it for a little demo

## Running the tests

Explain how to run the automated tests for this system. Break down into which tests and what they do

### Unit Tests 

Explain what these tests test, why and how to run them

```
Give an example
```

### Integration Tests 
Explain what these tests test, why and how to run them

```
Give an example
```

### And coding style tests

Explain what these tests test and why

```
Give an example
```

## Deployment

Add additional notes about how to deploy this on a live system

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management

## Versioning

We use [SemVer](http://semver.org/) for versioning.

## Authors

* **Chris Perrins** - *Initial work* - [christophperrins](https://github.com/christophperrins)

## License

This project is licensed under the MIT license - see the [LICENSE.md](LICENSE.md) file for details 

*For help in [Choosing a license](https://choosealicense.com/)*

## Acknowledgments

* Hat tip to anyone whose code was used
* Inspiration
* etc

# Flink-Fraud-Java

## Group Members
 - Golla Durga Prasad
 - RaviTeja Pagidoju
 - Gopichand Bandarupalli
 - Pruthvi Naskanti
 - Shiva Rama Krishna Vodnala
 - Sai Krishna Emmadishetty
 
 <table>
<td align="center"><a href="https://github.com/GD-Prasad"><img src="https://avatars.githubusercontent.com/u/59986885?s=400&u=df8057f5d9aa0936da702cdb1a5a776ceddf12a5&v=4" width="100px;" alt=""/><br /><sub><b>GD Prasad</b></sub></a><br /></td>

<td align="center"><a href="https://github.com/RaviTeja444"><img src="https://github.com/chanduhvg/Flink-Fraud-Scala/blob/main/Ravi_pic.jpeg?raw=true" width="100px;" alt=""/><br /><sub><b>Ravi Teja Pagidoju</b></sub></a><br /></td>

<td align="center"><a href="https://github.com/chanduhvg"><img src="https://avatars.githubusercontent.com/u/60024244?s=460&u=1f54a606cfb5ca1af59d89980ccd0597c0794b17&v=4" width="100px;" alt=""/><br /><sub><b>Gopichand Bandarupalli</b></sub></a><br /></td>

<td align="center"><a href="https://github.com/pruthvi-naskanti"><img src="https://github.com/chanduhvg/Flink-Fraud-Scala/blob/main/Pruthvi_pic.jpg?raw=true" width="100px;" alt=""/><br /><sub><b>Pruthvi Naskanti</b></sub></a><br /></td>

<td align="center"><a href="https://github.com/srkvodnala"><img src="https://avatars.githubusercontent.com/u/28599511?s=400&u=b1f6f569110d0150f844184d33a3d7b8e0a4dc4b&v=4" width="100px alt=""/><br /><sub><b>Shiva Rama Krishna</b></sub></a><br /></td>

<td align="center"><a href="https://github.com/Saikrishna1545"><img src="https://avatars.githubusercontent.com/u/60013018?s=460&u=4687be0646ecbb59bd281276c302eba966ff5f64&v=4" width="100px;" alt=""/><br /><sub><b>Sai Krishna Emmadishetty
</b></sub></a><br /></td>

</table>


### Prerequisites:
* Apache Flink Installed (2.12 or 2.11)
* Installing JDK 8
* IntelliJ / Eclipse IDE / Apache Net Beans installation.


### Introduction to Flink

- Apache Flink is an Open source stream processing framework for distributed, high performance data streaming application.
- Flink also provides batch processing, graph processing, Itearative proccessing for Machine learning applications. 
- Flink is considered as the next-gen stream processing system. 
- Flink offers substantially higher processing speeds to spark and hadoop.
- Flink provides low latency and high throughput

### Flink download
- Go to [apache Flink](https://flink.apache.org/downloads.html) link and select the latest available stable version and download it.
- open powershell and untar the downloaded file using ``` tar -xvf <filename.tgz> ```.
- Set up  system variable ``` FLINK_HOME ``` and configure it to the ``` C:\flink-1.11.2 ``` folder location and configure the path accordingly.


# Prasad Golla Durga:

## Contibution
- Apache Flink setup and setting up netbeans Flink environment.
- Apache FLink Fraud detection on Prime Number using java.
- Basic Fraud Detetction Application in Bank Transaction.

## Installables
- Java installed on machine
- Apache flink installed(>2)
- Netbeans IDE installed
- Netcat installed

## Steps for Execution of Prime Number Fraud Detection
- Add flink dependencies in the pom.xml file to use flink methods in java code.
- Build the application to make sure all the dependencies are downloaded/added to the project.
- Before running the java main class(App.java),start the ncat server on port 9000.
- - ```ncat -lk 9000```
- Java code written using flink stream methods to listen on port 9000.
- Now run the java application main class which starts listen to port 9000.
- Enter a number in ncat server(powershell/cmd) and check if it contains a fraud in the input from ncat server to netbeans output window.


# Ravi Teja Pagidoju&nbsp;

## Contibution
- Apache FLink Fraud detection on Even Number using java

## Installables
- Java installed on machine
- Apache flink installed
- [NetCat Installation](https://nmap.org/dist/nmap-7.91-setup.exe)
- Netbeans IDE installed


## Steps for Execution of Even Number Fraud Detection
- Add flink dependencies in the pom.xml file to use flink methods in java code.
- Build the application to make sure all the dependencies are downloaded/added to the project.
- Before running the java main class(App.java),start the ncat server on port 9000.
- Java code written using flink stream methods to listen on port 9000.
- Now run the java application main class which starts listen to port 9000.
- Enter a number in ncat server(powershell/cmd) and check if its a even or fraud in the netbeans output window.
- used ncat commands
- ```ncat -lk 9000```

## Explanation Video link
[Video Link](https://app.vidgrid.com/view/o2wFXv109DWP)

## References
- https://nmap.org/ncat/
- https://nmap.org/ncat/guide/ncat-usage.html
- https://ci.apache.org/projects/flink/flink-docs-stable/dev/datastream_api.html

# Gopichand Bandarupalli&nbsp;

## Contibution
- Apache FLink Fraud detection on Square Number using java

## Installables
- Java installed on machine
- Apache flink installed
- Netbeans IDE installed
- Netcat installed


## Flink set up using Maven.
- Using Apache Net Beans create a new Maven project.
- When trying to create a new flink application for the first time. Create a new archetype by configuring the GroupId, artifactId, and version as specified in the below    screenshot. Click "ok" and then click "finish".
 ![](https://github.com/chanduhvg/Flink-Fraud-Java/blob/main/NewProject.png)
 
 - We need to select the Archtechtype in the Maven archtype is flink-quickstart-java_2.11
 
 ![](https://github.com/chanduhvg/Flink-Fraud-Java/blob/main/SelectArchtechtype.png)

- After creating the archetype select the flink archetype from the list of available archetypes and create a Maven project.

 ![](https://github.com/chanduhvg/Flink-Fraud-Java/blob/main/Screenshot%20(45).png)



## Steps for Execution of Square Number Fraud Detection
- Add flink dependencies in the pom.xml file to use flink methods in java code.
- Build the application to make sure all the dependencies are downloaded/added to the project.
- Before running the java main class(App.java),start the ncat server on port 9000.
- Java code written using flink stream methods to listen on port 9000.
- Now run the java application main class which starts listen to port 9000.
- Enter a number in ncat server(powershell/cmd) and check if its a even or fraud in the netbeans output window.
- used ncat commands
- ```ncat -lk 9000```

## Vidgrid Demonstration link
https://use.vg/0nFBhD

## References
- https://nmap.org/ncat/
- https://nmap.org/ncat/guide/ncat-usage.html
- https://ci.apache.org/projects/flink/flink-docs-stable/dev/datastream_api.html

# Pruthvi Naskanti&nbsp;

## Contibution
- Apache FLink Fraud detection on String Length using java

## Installables
- Java installed on machine
- Apache flink installed
- [NetCat Installation](https://nmap.org/dist/nmap-7.91-setup.exe)
- Netbeans IDE installed


## Steps for Execution of Even Number Fraud Detection
- Add flink dependencies in the pom.xml file to use flink methods in java code.
- Build the application to make sure all the dependencies are downloaded/added to the project.
- Before running the java main class(App.java),start the ncat server on port 9000.
- Java code written using flink stream methods to listen on port 9000.
- Now run the java application main class which starts listen to port 9000.
- Enter a String in ncat server(powershell/cmd) and check the length of the string in netbeans output window. 
- If the length of the string is greater than 8, it will throw negative number -1.
- used ncat commands
- ```ncat -lk 9000```

## References
- https://nmap.org/ncat/
- https://nmap.org/ncat/guide/ncat-usage.html
- https://ci.apache.org/projects/flink/flink-docs-stable/dev/datastream_api.html


## Sai Krishna Emmadishetty

## Contribution

Apache flink fraud detection on Number greater using java

## Installables

- Apache NetBeans IDE installed.
- Netcat Installed.
- Java installed on machine
- Apache flink installed(>2)

## Steps for Execution of Even Number Fraud Detection

1. first clone the project the from github and open the project in netbeans and then after
 clean and bulid to the project in order to download all dependenies to our project
2. open the project and run the file from choosing the main class
3. Then after open power shell commander on current project folder, start ncat
server on port 9000
4. We need to give input number in ncat server in power shell command and check if number is greater than 1000 returns as -1 as fraud number and if the number is less than 1000 it returns as same number as over input.
5.used ncat commands
6.ncat -lk 9000

## References

1. https://nmap.org/ncat/guide/ncat-usage.html
2. https://ci.apache.org/projects/flink/flink-docs-stable/dev/datastream_api.html






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
* Installing the Scala plugin
* IntelliJ / Eclipse IDE installation
* Spark

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

### Installing the Scala plugin
- The IntelliJ / Eclipse installation setup offers to install the Scala plugin. If it is not installed, follow these instructions before importing Flink to enable support for Scala   projects and files:
- Go to IntelliJ plugins settings (IntelliJ IDEA -> Preferences -> Plugins) and click on “Install Jetbrains plugin…”.
- Select and install the “Scala” plugin.
- Restart IntelliJ
- To be able to open a Scala editor, open new project, Select Scala and java verssion 1.8.
- Once the project is created, the editor will create a java project.
- So, to change the project to Scala project, select files and select environment configuration.
- In environment configuration select global environment and select add symbol and select sacal.
- Now, the project is ready for scala projects.
- Add dependencies to flink fraud project in intelliJ IDE.

## Installed Intellij with sbt dependencies.

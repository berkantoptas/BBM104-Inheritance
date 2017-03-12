# BBM104-Inheritance
Hacettepe University Computer Engineering BBM104 - Second Assignment

#2. Software Using Documentation
##2.1. Software Usage
Program starts Main.java class.The input files given as an argument. Personnel.txt file is the first argument and the Monitoring.txt file is second.(args[0]=Personnel.txt and args[1]=Monitoring.txt)
##2.2. Error Messages
Program doesn’t have any error messages. Because advisors said that not give wrong input.
#3.Software Design Notes
##3.1. Desctiption of the program
###3.1.1. Problem
In this experiment I am expected to develop a system to monitorize payroll of Personnel who is working in a governmental institution.
###3.1.2. Solution
I solved the problem when I read the given article at Appendix A.
##3.2. System Chart
Inputs : Personnel.txt
: Monitoring.txt
Programs : Main.java
: personnel.java
: monitoring.java
: manager.java
: officer.java
: security.java
: employee.java
: ptemployee.java
: ftemployee.java
: worker.java
: chief.java
##3.3. Algorithm
1. Program takes 2 arguments. (args[0],args[1])
2. Call readFile function with arguments.
3. Split that files and give into ArrayLists.
4. Compare personnelList registnumber and monitoringList registnumber.
5. When they matches, creat file with their registnumber and write the personnels specifies into the files.

##REFERENCES
https://en.wikipedia.org/wiki/Javadoc

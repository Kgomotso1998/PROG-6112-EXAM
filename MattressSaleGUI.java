cd C:\Users\Student\Documents\NetBeansProjects\MattressSalesReport; "JAVA_HOME=C:\\Program Files\\Apache NetBeans\\jdk" cmd /c "\"C:\\Program Files\\Apache NetBeans\\java\\maven\\bin\\mvn.cmd\" -Dexec.vmArgs= \"-Dexec.args=${exec.vmArgs} -classpath %classpath ${exec.mainClass} ${exec.appArgs}\" -Dexec.appArgs= -Dexec.mainClass=com.mycompany.mattresssalesreport.MattressSalesReport \"-Dexec.executable=C:\\Program Files\\Apache NetBeans\\jdk\\bin\\java.exe\" \"-Dmaven.ext.class.path=C:\\Program Files\\Apache NetBeans\\java\\maven-nblib\\netbeans-eventspy.jar\" --no-transfer-progress process-classes org.codehaus.mojo:exec-maven-plugin:3.5.1:exec"
WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::staticFieldBase has been called by com.google.inject.internal.aop.HiddenClassDefiner (file:/C:/Program%20Files/Apache%20NetBeans/java/maven/lib/guice-5.1.0-classes.jar)
WARNING: Please consider reporting this to the maintainers of class com.google.inject.internal.aop.HiddenClassDefiner
WARNING: sun.misc.Unsafe::staticFieldBase will be removed in a future release
Scanning for projects...

-----------------< com.mycompany:MattressSalesReport >------------------
Building MattressSalesReport 1.0-SNAPSHOT
  from pom.xml
--------------------------------[ jar ]---------------------------------

--- resources:3.3.1:resources (default-resources) @ MattressSalesReport ---
skip non existing resourceDirectory C:\Users\Student\Documents\NetBeansProjects\MattressSalesReport\src\main\resources

--- compiler:3.13.0:compile (default-compile) @ MattressSalesReport ---
Recompiling the module because of changed source code.
Compiling 5 source files with javac [debug release 25] to target\classes

--- exec:3.5.1:exec (default-cli) @ MattressSalesReport ---
========================
       LOCAL MATTRESS SPECIALTY STORE     
         MONTHLY SALES REPORT             
========================
Top 3 Performing Products Breakdown:
 - CloudNine Memory Foam: 145 units sold
 - Orthopedic Supreme Innerspring: 120 units sold
 - Luxe Hybrid Latex: 160 units sold
---------------------
I.   Total number of products sold: 425
II.  Average products sold per product: 141.67
III. Most popular product: Luxe Hybrid Latex (160 units)
=====================
------------------------------------------------------------------------
BUILD SUCCESS
------------------------------------------------------------------------
Total time:  2.515 s
Finished at: 2026-11-18T14:03:52+02:00
------------------------------------------------------------------------

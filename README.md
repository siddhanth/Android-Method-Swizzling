# Android-Method-Swizzling
1. Android studio generates aar file from module located under : 
<module>/build/outputs/aar/<modulename>.aar

2. Extracting jar file from aar : 
Open aar while using Archive manager and aar file contains classes.jar file. Using Archive manager verify once classes.jar file contains
all requires *.class files. 

3. Converting jar file to dex : 
Using dx command generate dex file from jar file. dx command is located : 
/path/to/Androdid/SDK/build-tools/<version number>
 command : 
 
 ./dx --dex --output="/output/dir/path/dl.dex" "/jar/path/dl.jar"   // dl is sample file name here. 
 
 4. This dex file can be loaded dynamically now.

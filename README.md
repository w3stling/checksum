Checksum
==========

[![Build Status](https://travis-ci.org/w3stling/checksum.svg?branch=master)](https://travis-ci.org/w3stling/checksum)
[![Download](https://api.bintray.com/packages/apptastic/maven-repo/checksum/images/download.svg)](https://bintray.com/apptastic/maven-repo/checksum/_latestVersion)
[![Javadoc](https://img.shields.io/badge/javadoc-1.0.9-blue.svg)](https://w3stling.github.io/checksum/javadoc/1.0.9)
[![License](http://img.shields.io/:license-MIT-blue.svg?style=flat-round)](http://apptastic-software.mit-license.org)   
[![Quality Gate](https://sonarcloud.io/api/project_badges/measure?project=com.apptastic%3Achecksum&metric=alert_status)](https://sonarcloud.io/dashboard?id=com.apptastic%3Achecksum)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=com.apptastic%3Achecksum&metric=coverage)](https://sonarcloud.io/component_measures?id=com.apptastic%3Achecksum&metric=Coverage)
[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=com.apptastic%3Achecksum&metric=bugs)](https://sonarcloud.io/component_measures?id=com.apptastic%3Achecksum&metric=bugs)
[![Vulnerabilities](https://sonarcloud.io/api/project_badges/measure?project=com.apptastic%3Achecksum&metric=vulnerabilities)](https://sonarcloud.io/component_measures?id=com.apptastic%3Achecksum&metric=vulnerabilities)
[![Code Smells](https://sonarcloud.io/api/project_badges/measure?project=com.apptastic%3Achecksum&metric=code_smells)](https://sonarcloud.io/component_measures?id=com.apptastic%3Achecksum&metric=code_smells)

Java library for calculating a checksum for a given resource. It can be either the content of a file or the content from a URL. 

Examples
--------
Calculates MD5 checksum for content of a file 
```java
String checksum = Checksum.calculate(new File("file.txt"), MessageDigest.getInstance("MD5"));
```

Calculates SHA-256 checksum for the content from a URL 
```java
String checksum = Checksum.calculate(new URI("http://google.com"), MessageDigest.getInstance("SHA-256"));
```


Download
--------

Download [the latest JAR][1] or grab via [Maven][2] or [Gradle][3].

### Maven setup
Add JCenter repository for resolving artifact:
```xml
<project>
    ...
    <repositories>
        <repository>
            <id>jcenter</id>
            <url>https://jcenter.bintray.com</url>
        </repository>
    </repositories>
    ...
</project>
```

Add dependency declaration:
```xml
<project>
    ...
    <dependencies>
        <dependency>
            <groupId>com.apptastic</groupId>
            <artifactId>checksum</artifactId>
            <version>1.0.9</version>
        </dependency>
    </dependencies>
    ...
</project>
```

### Gradle setup
Add JCenter repository for resolving artifact:
```groovy
repositories {
    jcenter()
}
```

Add dependency declaration:
```groovy
dependencies {
    implementation 'com.apptastic:checksum:1.0.9'
}
```

Checksum library requires at minimum Java 11.

License
-------

    MIT License
    
    Copyright (c) 2020, Apptastic Software
    
    Permission is hereby granted, free of charge, to any person obtaining a copy
    of this software and associated documentation files (the "Software"), to deal
    in the Software without restriction, including without limitation the rights
    to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
    copies of the Software, and to permit persons to whom the Software is
    furnished to do so, subject to the following conditions:
    
    The above copyright notice and this permission notice shall be included in all
    copies or substantial portions of the Software.
    
    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
    AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
    OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
    SOFTWARE.


[1]: https://bintray.com/apptastic/maven-repo/checksum/_latestVersion
[2]: https://maven.apache.org
[3]: https://gradle.org
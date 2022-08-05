Checksum
==========

[![Build](https://github.com/w3stling/checksum/actions/workflows/build.yml/badge.svg)](https://github.com/w3stling/checksum/actions/workflows/build.yml)
[![Download](https://img.shields.io/badge/download-%%version%%-brightgreen.svg)](https://search.maven.org/artifact/com.apptasticsoftware/checksum/%%version%%/jar)
[![Javadoc](https://img.shields.io/badge/javadoc-%%version%%-blue.svg)](https://w3stling.github.io/checksum/javadoc/%%version%%)
[![License](http://img.shields.io/:license-MIT-blue.svg?style=flat-round)](http://apptastic-software.mit-license.org)   
[![CodeQL](https://github.com/w3stling/checksum/actions/workflows/codeql-analysis.yml/badge.svg)](https://github.com/w3stling/checksum/actions/workflows/codeql-analysis.yml)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=com.apptasticsoftware%3Achecksum&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=com.apptasticsoftware%3Achecksum)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=com.apptasticsoftware%3Achecksum&metric=coverage)](https://sonarcloud.io/summary/new_code?id=com.apptasticsoftware%3Achecksum)
[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=com.apptasticsoftware%3Achecksum&metric=bugs)](https://sonarcloud.io/summary/new_code?id=com.apptasticsoftware%3Achecksum)
[![Vulnerabilities](https://sonarcloud.io/api/project_badges/measure?project=com.apptasticsoftware%3Achecksum&metric=vulnerabilities)](https://sonarcloud.io/summary/new_code?id=com.apptasticsoftware%3Achecksum)
[![Code Smells](https://sonarcloud.io/api/project_badges/measure?project=com.apptasticsoftware%3Achecksum&metric=code_smells)](https://sonarcloud.io/summary/new_code?id=com.apptasticsoftware%3Achecksum)

> **Note**
> 
> From version 2.0.0:
> * New Java package name
> * Moved repository from `JCenter` to `Maven Central Repository`

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

Add dependency declaration:
```xml
<project>
    ...
    <dependencies>
        <dependency>
            <groupId>com.apptasticsoftware</groupId>
            <artifactId>checksum</artifactId>
            <version>%%version%%</version>
        </dependency>
    </dependencies>
    ...
</project>
```

Add dependency declaration:
```groovy
dependencies {
    implementation 'com.apptasticsoftware:checksum:%%version%%'
}
```

Checksum library requires at minimum Java 11.

License
-------

    MIT License
    
    Copyright (c) %%year%%, Apptastic Software
    
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


[1]: https://search.maven.org/artifact/com.apptasticsoftware/checksum/%%version%%/jar
[2]: https://maven.apache.org
[3]: https://gradle.org
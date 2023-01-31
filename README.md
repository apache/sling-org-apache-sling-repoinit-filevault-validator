[![Apache Sling](https://sling.apache.org/res/logos/sling.png)](https://sling.apache.org)

[![Build Status](https://ci-builds.apache.org/job/Sling/job/modules/job/sling-org-apache-sling-repoinit-filevault-validator/job/master/badge/icon)](https://ci-builds.apache.org/job/Sling/job/modules/job/sling-org-apache-sling-repoinit-filevault-validator/job/master/)
[![Test Status](https://img.shields.io/jenkins/tests.svg?jobUrl=https://ci-builds.apache.org/job/Sling/job/modules/job/sling-org-apache-sling-repoinit-filevault-validator/job/master/)](https://ci-builds.apache.org/job/Sling/job/modules/job/sling-org-apache-sling-repoinit-filevault-validator/job/master/test/?width=800&height=600)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=apache_sling-org-apache-sling-repoinit-filevault-validator&metric=coverage)](https://sonarcloud.io/dashboard?id=apache_sling-org-apache-sling-repoinit-filevault-validator)
[![Sonarcloud Status](https://sonarcloud.io/api/project_badges/measure?project=apache_sling-org-apache-sling-repoinit-filevault-validator&metric=alert_status)](https://sonarcloud.io/dashboard?id=apache_sling-org-apache-sling-repoinit-filevault-validator)
[![JavaDoc](https://www.javadoc.io/badge/org.apache.sling/org.apache.sling.repoinit.filevault.validator.svg)](https://www.javadoc.io/doc/org.apache.sling/org.apache.sling.repoinit.filevault.validator)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.apache.sling/org.apache.sling.repoinit.filevault.validator/badge.svg)](https://search.maven.org/#search%7Cga%7C1%7Cg%3A%22org.apache.sling%22%20a%3A%22org.apache.sling.repoinit.filevault.validator%22)
[![repoinit](https://sling.apache.org/badges/group-repoinit.svg)](https://github.com/apache/sling-aggregator/blob/master/docs/groups/repoinit.md)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://www.apache.org/licenses/LICENSE-2.0)

# Apache Sling Repo Init FileVault Validator

This module is part of the [Apache Sling](https://sling.apache.org) project.

It implements a [FileVault validator][1] for the [Repository Initialization language][4] used in [serialized OSGi configurations][3].
It emits validation error messages for invalid repoinit statements.

# Usage with Maven

You can use this validator with the [FileVault Package Maven Plugin][2] in version 1.3.0 or higher like this

```
<plugin>
  <groupId>org.apache.jackrabbit</groupId>
  <artifactId>filevault-package-maven-plugin</artifactId>
  <dependencies>
    <dependency>
      <groupId>org.apache.sling</groupId>
      <artifactId>org.apache.sling.repoinit.filevault.validator</artifactId>
      <version><latestversion></version>
    </dependency>
    <!-- use the following dependency to optionally overwrite the used repoinit parser version (default=1.9.0) -->
    <dependency>
      <groupId>org.apache.sling</groupId>
      <artifactId>org.apache.sling.repoinit.parser</artifactId>
      <version><version of the parser in the runtime where my config is deployed to></version>
    </dependency>
  </dependencies>
</plugin>
```

[1]: https://jackrabbit.apache.org/filevault/validation.html
[2]: https://jackrabbit.apache.org/filevault-package-maven-plugin/index.html
[3]: https://sling.apache.org/documentation/bundles/configuration-installer-factory.html#configuration-serialization-formats
[4]: https://sling.apache.org/documentation/bundles/repository-initialization.html

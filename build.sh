#!/bin/bash

# call for maven
mvn clean verify

# enter target
cd target

# delete files
rm -r archive-tmp
rm -r classes
rm -r generated-sources
rm -r generated-test-sources
rm -r maven-status
rm -r surefire-reports
rm -r test-classes

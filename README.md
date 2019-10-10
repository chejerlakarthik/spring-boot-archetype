# Install this archetype locally

Clone the repo
```
git clone git@github.com:chejerlakarthik/spring-boot-archetype.git
cd spring-boot-archetype
mvn clean install
```

# Generate a new maven project using this archetype

```
mvn archetype:generate \
    -DarchetypeGroupId=com.karthik \
    -DarchetypeArtifactId=spring-boot-archetype \
    -DarchetypeVersion=1.0.0 \
    -DgroupId=com.money \
    -DartifactId=currency-conversion-api \
    -Dversion=1.0-SNAPSHOT \
    -Dpackage=com.money.currency
```
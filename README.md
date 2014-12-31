
http://hsqldb.org/doc/guide/sqlroutines-chapt.html

```
mvn clean install
mvn dependency:copy-dependencies
java -cp target/hsqldb-tools-1.0-SNAPSHOT.jar org.hsqldb.cmdline.SqlTool <db name> src/main/sql/hex.sql
```
# Oracle Testcontainers Spring Boot

This example project was created to support [sysbox issue 903](https://github.com/nestybox/sysbox/issues/903).

_Requires Java 21._

To run the test:

```
mvn clean install
```

This should work in GitHub Codespaces, but will fail if run within a sysbox pod on Kubernetes 1.30 or 1.31, with sysbox v0.6.6

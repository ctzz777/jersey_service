# Jersey dependencies: 
```xml
<dependencies>
	<dependency>
	     <groupId>org.glassfish.jersey.containers</groupId>
	     <artifactId>jersey-container-servlet</artifactId>
	     <version>2.2</version>
	</dependency>
	<dependency>
	    <groupId>org.glassfish.jersey.media</groupId>
	    <artifactId>jersey-media-moxy</artifactId>
	    <version>2.2</version>
	</dependency>
</dependencies>
```

# Jersey 2 marshall Json via moxy as default:
```xml
<dependencies>
	<dependency>
	    <groupId>org.glassfish.jersey.media</groupId>
	    <artifactId>jersey-media-moxy</artifactId>
	    <version>2.2</version>
	</dependency>
</dependencies>
```

# solve conflict with JBOSS by jboss-deployment-structure.xml
```xml
<?xml version="1.0" encoding="UTF-8"?>
<jboss-deployment-structure>
    <deployment>
        <exclusions>
            <!-- Exclude RestEasy conflicts -->
            <module name="javaee.api" />
            <module name="javax.ws.rs.api"/>
            <module name="org.jboss.resteasy.resteasy-jaxrs" />
        </exclusions>
    </deployment>
</jboss-deployment-structure>
```

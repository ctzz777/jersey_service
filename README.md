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

#web.xml
```xml
<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns="http://java.sun.com/xml/ns/javaee" xsi:schemaLocation="http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd" id="WebApp_ID" version="3.0">
  <display-name>jersey_service</display-name>
  <servlet>
    <servlet-name>Jersey REST Service</servlet-name>
    <servlet-class>org.glassfish.jersey.servlet.ServletContainer</servlet-class>
    <init-param>
        <param-name>jersey.config.server.provider.packages</param-name>
        <param-value>jersey</param-value>
    </init-param>
    <load-on-startup>1</load-on-startup>
  </servlet>
  <servlet-mapping>
    <servlet-name>Jersey REST Service</servlet-name>
    <url-pattern>/rest/*</url-pattern>
  </servlet-mapping>
</web-app>
```

# FanTurWEB
## Instrucciones
1. Clonar el repositorio e importarlo al IDE.
2. Descargar el conector JDBC para MySQL desde https://dev.mysql.com/downloads/file/?id=476198
3. Descomprimirlo en $(JBOSS)/modules/system/layers/base/com/mysql/main/
4. Editar el archivo $(JBOSS)/configuration/standalone.xml:
```
<datasource jndi-name="java:jboss/datasources/FanturDS" pool-name="FanturDS" enabled="true" use-java-context="true">
	<connection-url>jdbc:mysql://localhost/fantur?useSSL=false</connection-url>
	<driver>mysql</driver>
	<security>
		<user-name>fantur</user-name>	
		<password>fantur</password>			
	</security>
</datasource>
```
5. En el mismo archivo, agregar:
```
<driver name="mysql" module="com.mysql">
	<xa-datasource-class>com.mysql.jdbc.jdbc2.optional.MysqlXADataSource</xa-datasource-class>
</driver>
```
6. Agregar el proyecto al servidor Wildfly.
7. Ejecutar el servidor.

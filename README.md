# javaee6-auth-example

This is an example Java EE 6 web application, demonstrating a programmatic authentication module registration using the JASPIC API.

Contains vendor specific deployment descriptors for JBoss AS 7.1/EAP 6, GlassFish 3.1, Geronimo v3.0 and WebLogic 12c.

The project is an Eclipse/WTP project and by default uses the JBoss EAP 6 target-runtime. This can be changed to any other WTP runtime for a full Java EE 6 server.

In order to compile the included patch for JBoss AS/EAP using Eclipse, add "modules/org/jboss/as/web/main" to preferences -> Server -> Runtime Environments -> Default Classpath Entries -> JBoss Enterprise Application Platform 6.x Runtime (or JBoss AS 7.1 equivalent).

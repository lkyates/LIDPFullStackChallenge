# Serving the Frontend

You may need to run `nodeSetup` in Gradle to install node, if you don't have it already.

### Dev Setup

Use this to test in tandem with the Spring Boot server:

`ngServe` in Gradle will host the frontend Angular piece. It will also run `npmInstall` if you haven't run it manually yet.

### Production

This will compile, minify, and migrate the UI content to the Spring Boot server to be hosted:

`copyAngularDist` in Gradle.

# GeoTrellis template REST service project

This project is a template for creating a geoprocessing web service with
GeoTrellis.  It's an initial project that is a blank slate for your own 
development by providing an initial development environment that is set up
with the necessary dependencies in place.  The project loads GeoTrellis as a
library, and has a very simple "hello world" web service in place for you 
to edit.

You should take a look at the Demo REST service included with the core
GeoTrellis repository (https://github.com/azavea/geotrellis) to start exploring
how to build your own geoprocessing service.

## Step 1: Run SBT

This project uses SBT, the Scala Build Tool, for compilation and execution.

If you don't have SBT installed already, you can run a script in the template
directory (from https://github.com/paulp/sbt-extras) that will automatically
download it for you.

At the command line, go to the directory where you've installed this template
and run `./sbt`.  For example:

```bash
git clone geotrellis-template
cd geotrellis-template
./sbt
```

The first time you run SBT, there will be a significant delay as all of the
necessary libraries are downloaded.

If you get any sort of error that a library can't be downloaded, please let us 
know so we can fix the problem. SBT downloads the libraries from where they
are hosted on the internet, so problems can arise when repositories change.  

When sbt is done loading and compiling, you'll see an sbt prompt:

``` 
 >
```

If you type `run`, you'll see some messages from Jetty, the embedded webserver
that responds to GeoTrellis requests.

```
 > run
[info] Starting server on port 8888.
[error] 2012-02-06 14:17:08.255:INFO:oejs.Server:jetty-8.1.0.RC4
[error] 2012-02-06 14:17:08.329:INFO:oejs.AbstractConnector:Started SelectChannelConnector@0.0.0.0:8888 STARTING
```

This means that you are now running a webserver on port 8888 that responds to
requests.  Go to [http://localhost:8888/template](http://localhost:8888/template)
to see the template web service, which displays "Hello GeoTrellis!"

## Step 2: Configuration and data import

See the [Setting Up GeoTrellis page](http://azavea.github.com/geotrellis/getting_started/Setting+up+GeoTrellis.html)
for information about configuring your GeoTrellis instance and importing your data.

## Step 3: Create your service

The blank REST service is in the file `src/main/scala/geotrellis/rest/TemplateResource.scala`.
Edit that file to change the existing service, or create a similar class in the
`geotrellis.rest` package to create a new service.

If you are using the ScalaIDE for Eclipse (http://scala-ide.org/), you should
type `eclipse` at the sbt prompt, and then import the project into Eclipse. If
you are using emacs, you should consider using ENSIME
(https://github.com/aemoncannon/ensime).

## Additional notes

### Getting Started Guide

See the [getting started guide](http://azavea.github.com/geotrellis/getting_started/GeoTrellis.html)
for more information on available operations, importing your data, and creating
your web service.
 
### Triggered Restart

Note: If you run `~re-start` at the sbt prompt, you will be in a "triggered
restart" mode. As soon as you edit your source files, the application will
recompile and restart with your updated code. 

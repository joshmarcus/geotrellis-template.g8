seq(Revolver.settings: _*)

mainClass in (Compile, run) := Some("geotrellis.rest.WebRunner")

addCompilerPlugin("com.azavea.math.plugin" %% "optimized-numeric" % "0.1")

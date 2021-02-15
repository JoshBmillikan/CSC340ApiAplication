This program downloads data from NASA's exoplanet archive and displays the name, host star, mass, and orbital period of the confirmed exoplanets in the kepler field.
Note that there are currently 2414 confirmed planets in the kepler field.

It uses GSON to parse the JSON data into a java class, and a gradle build script is used to manage that dependency. It makes little difference for
something as simple as this, but projects with multiple dependencies and multiple contributes should use a build script to manage dependencies, as it
makes sure everyone has the same version of each dependency, and make it easy to add others. 

Any java IDE should be able to import and use a gradle script, so it shouldn't be an issue to use.
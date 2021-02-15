/*  Last updated: 2/15/2021
 * This program receives data from NASA's exoplanet archive api,
 * and prints the name, host star, mass, and orbital period of all confirmed
 * planets in the kepler field.
 * Joshua Millikan
 */

import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        //Try with resource guarantees the stream will be closed, even if a exception is thrown
        try (InputStreamReader stream = new InputStreamReader(new URL(
                "https://exoplanetarchive.ipac.caltech.edu/cgi-bin/nstedAPI/nph-nstedAPI?&table=exoplanets&format=JSON&where=pl_kepflag=1")
                .openStream())) {

            Gson gson = new Gson();
            Planet[] planets = gson.fromJson(stream, Planet[].class);
            System.out.printf("%d confirmed planets\n",planets.length);
            for (Planet planet : planets) {
                System.out.println(planet.toString());
            }
        } catch (IOException e) {
            System.out.println("Failed to connect to api: " + e.getMessage());
        }
    }
}

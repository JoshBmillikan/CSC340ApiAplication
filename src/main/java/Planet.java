/*  This class simply holds the relevant planet data,
 *  Serialized name annotation tells GSON what the variables name is in the JSON
 */
import com.google.gson.annotations.SerializedName;

public class Planet {
    @SerializedName("pl_name")
    private String name;

    @SerializedName("pl_hostname")
    private String starName;

    @SerializedName("pl_orbper")
    private float orbital;

    @SerializedName("pl_bmassj")
    private float mass;

    @Override
    public String toString() {
        return String.format("Planet: %s\n\tHost Star: %s\n\tMass: %f Jupiter\n\tOrbital Period: %f days",
                this.name, this.starName, this.mass, this.orbital);
    }
}

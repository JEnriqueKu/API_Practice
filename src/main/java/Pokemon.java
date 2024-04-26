import com.google.gson.annotations.SerializedName;

import java.util.Arrays;

public class Pokemon {
    @SerializedName("name")
    private String name;
    @SerializedName("id")
    private int id;
    @SerializedName("types")
    private Object[] types;
    @SerializedName("abilities")
    private Object[] abilities;
    @SerializedName("moves")
    private Object[] moves;

    public Pokemon(String name, int id, Object[] types, Object[] abilities, Object[] moves) {
        this.name = name;
        this.id = id;
        this.types = types;
        this.abilities = abilities;
        this.moves = moves;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Object[] getTypes() {
        return types;
    }

    public void setTypes(Object[] types) {
        this.types = types;
    }

    public Object[] getAbilities() {
        return abilities;
    }

    public void setAbilities(Object[] abilities) {
        this.abilities = abilities;
    }

    public Object[] getMoves() {
        return moves;
    }

    public void setMoves(Object[] moves) {
        this.moves = moves;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", types=" + Arrays.toString(types) +
                ", abilities=" + Arrays.toString(abilities) +
                ", moves=" + Arrays.toString(moves) +
                '}';
    }
}

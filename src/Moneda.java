import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

public class Moneda {
    @SerializedName("base_code")
    public String base;
    @SerializedName("conversion_rates")
    public JsonObject jO;
    
    public Moneda() {
    }

    public Moneda(String base) {
        this.base = base;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public JsonObject getjO() {
        return jO;
    }

    public void setjO(JsonObject jO) {
        this.jO = jO;
    }

    public double consulta(String json, int colon, String cambio){
        Gson gson = new Gson();
        Moneda nuevoCambio = gson.fromJson(json, Moneda.class);
        Double divisa = nuevoCambio.jO.get(cambio).getAsDouble();
        double result = divisa * colon;
        return result;
    }
}

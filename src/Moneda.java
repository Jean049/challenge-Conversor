import java.util.Collection;

import com.google.gson.annotations.SerializedName;

public class Moneda {
    @SerializedName("base_code")
    private String base;
    @SerializedName("conversion_rates")
    private Collection<String> conversion;

    public Moneda() {
    }

    public Moneda(String base, Collection<String> conversion) {
        this.base = base;
        this.conversion = conversion;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }
    
}

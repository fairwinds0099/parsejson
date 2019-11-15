package model;


public class Schema {
    public Schema(Defaults defaults, Parametric parametric) {
        this.defaults = defaults;
        this.parametric = parametric;
    }

    public Schema() {
    }

    private Defaults defaults;
    private Parametric parametric;

    public Defaults getDefaults() {
        return defaults;
    }

    public void setDefaults(Defaults defaults) {
        this.defaults = defaults;
    }

    public Parametric getParametric() {
        return parametric;
    }

    public void setParametric(Parametric parametric) {
        this.parametric = parametric;
    }
}

public class PorcheCar extends Car {
    private String model;
    public PorcheCar(int year, double price, String model) {
        super(year, price);
        if(model.equals("Macan") || model.equals("Taycan") || model.equals("911")) {
            this.model = model;
        }
        else throw new RuntimeException("Unga Bunga learn porche cars u peasant");
    }

    public PorcheCar() {
        super();
        this.model = "";
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return super.toString() + " " + model;
    }


}

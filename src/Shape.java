public class Shape {
        private String color = "черный";
        private String form = "квадрат";

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", form='" + form + '\'' +
                '}';
    }

    public String getColor() {
        return color;
    }

    public String getForm() {
        return form;
    }
}


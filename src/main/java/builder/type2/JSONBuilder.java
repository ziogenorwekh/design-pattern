package builder.type2;

public class JSONBuilder extends Builder {
    public JSONBuilder(Data data) {
        super(data);
    }

    @Override
    public String head() {
        return "{";
    }

    @Override
    public String body() {
        StringBuilder sb = new StringBuilder();
        sb.append("\"name\": ");
        sb.append("\"").append(data.getName()).append("\"");
        sb.append(", \"Age\": ");
        sb.append(data.getAge());

        return sb.toString();
    }

    @Override
    public String foot() {
        return "}";
    }
}

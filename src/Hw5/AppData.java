package Hw5;

public class AppData {
    private String header;
    private String data;

    public AppData(String s, String s1, String s2) {
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "AppData{" +
                "header='" + header + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}


package uap.bases;

public abstract class Shape {
    private String name;
    
    public Shape() {
        this.name = "";
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public abstract void printInfo();
} 
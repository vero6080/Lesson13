package TaskProject;

public class Task {
    
    private String name, description;
    
    public Task(String n, String d){
        name = n;
        description = d;
    }
    
    public String getDescription(){
        return description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nDescription: " + description + "\n=========\n";
    }
    
    public boolean validate(){
        if (name == null || description == null || name.equals("") || description.equals(""))
            return false;
        else
            return true;
    }
    
}

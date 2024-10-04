import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Employees {
    private String name;
    private LocalDate dateBirth;
    private List pcUsers = new ArrayList<>();

    public  Employees(String name, LocalDate dateBirth){
        this.name = name;
        this.dateBirth = dateBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(LocalDate dateBirth) {
        this.dateBirth = dateBirth;
    }

    public void addComputer(Computers computer){
        addComputer(computer);
    }

    public void removeComputer(Computers computer){
        removeComputer(computer);
    }

     public List<Computers> getCompuetrs(){
        return new ArrayList<>(pcUsers);
     }

    public List getPcUsers() {
        return pcUsers;
    }

    public void setPcUsers(List pcUsers) {
        this.pcUsers = pcUsers;
    }

    public void getCompuetrs(Computers model) {
    }
}

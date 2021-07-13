package Task19;

public class Author {
    private String surname;
    private String nationality;

    public void setSurname(String surname){
        this.surname = surname;
    }
    public String getSurname(){
        return surname;
    }
    public void setNationality(String nationality){
        this.nationality = nationality;
    }
    public String getNationality(){
        return nationality;
    }
    public Author(String surname, String nationality){
        this.surname = surname;
        this.nationality = nationality;
    }
}

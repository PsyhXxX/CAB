package sample;

public class Contact {
    private String surname;
    private String name;
    private String patronomic;
    private int numberPhone;
    private String mail;

    public Contact(String surname, String name, int numberPhone) {
        this.surname = surname;
        this.name = name;
        this.numberPhone = numberPhone;
    }

    private String annotation;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronomic() {
        return patronomic;
    }

    public void setPatronomic(String patronomic) {
        this.patronomic = patronomic;
    }

    public int getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(int numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getAnnotation() {
        return annotation;
    }

    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "Фамилия '" + surname + '\'' +
                ", Имя '" + name + '\'' +
                ", Отчество '" + patronomic + '\'' +
                ", Номер телефона=" + numberPhone +
                ", Почта '" + mail + '\'' +
                ", Примечание '" + annotation + '\'' +
                '}';
    }
}

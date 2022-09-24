public class Human {
    private   int  yearOfBirth;
    private String name;
    private String town;
    private String job;

    public Human( String name,int yearOfBirth, String town, String job) {
        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }
        if (name=="") {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
        if (town=="") {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
        if (job=="") {
            this.job = "Информация не указана";
        } else {
            this.job = town;
        }


            }

    public String toString() {
        return " Привет! Меня зовут "+name+".  Я из города "+town+". Я родился(лась) в "+yearOfBirth+ " году.Я работаю на должности:"+job+". Будем знакомы!";

    }
}

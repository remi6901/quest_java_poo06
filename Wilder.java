public class Wilder {
    //Ajout des attributs
    private String firstname;
    private boolean aware;

    //Création d'un constructeur
    public Wilder(String firstname, boolean aware){
        this.firstname = firstname;
        this.aware = aware;
    }

    //Les getteurs
    public String getFirstname(){
        return this.firstname;
    }

    public boolean getAware(){
        return this.aware;
    }

    //Les setteurs
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    } 

    //Création d'une méthode
    public String whoAmI(){
        return "Je m'appelle " + this.getFirstname()+ " et " + isAware();
    }

    public String isAware(){
        if(aware == true){
            return "je suis aware";
        }else{
            return "Je ne suis pas aware";
        }
    }
}
